/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author unifgversolato
 */

/*import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.*;
import Erros.Erros.CapturadorErros;
//import org.antlr.v4.runtime.misc.Nullable;


import java.util.*;

//public class Compilador {

    /*
     * @param args the command line arguments
     */
    /**public static void main(String[] args)throws IOException {
        // TODO code application logic here
        //ler codigo -> passar para o lexico -> passar para o sintatico -> fazer
        //a taducao
        System.out.println("Digite o seu codigo:");
        //fazer leitura do codigo do usuario
        CharStream input = CharStreams.fromStream(System.in);
        // instanciar o analisar lexico
        atribuicaoLexer lexer = new atribuicaoLexer(input);
        // gerar os tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // instanciar o analisador sintatico
        atribuicaoParser parser = new atribuicaoParser(tokens);
        ParseTree tree = parser.init();
        // andar sobre a arvore de derivacao
        ParseTreeWalker walker = new ParseTreeWalker();
        
        tradutor tr = new tradutor();
        walker.walk(tr, tree);
        }
        
    }**/

/*public class Compilador {
    public static void main(String[] args) throws Exception {
        //ANTLRInputStream input = new ANTLRInputStream(System.in);
        //SimpleLexer lexer = new SimpleLexer(input);
        //CommonTokenStream tokens = new CommonTokenStream(lexer);
        // TODO code application logic here
        //ler codigo -> passar para o lexico -> passar para o sintatico -> fazer
        //a taducao
        System.out.println("Digite o seu codigo:");
        //fazer leitura do codigo do usuario
        CharStream input = CharStreams.fromStream(System.in);
        // instanciar o analisar lexico
        atribuicaoLexer lexer = new atribuicaoLexer(input);
        // gerar os tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // instanciar o analisador sintatico
        atribuicaoParser parser = new atribuicaoParser(tokens);
        parser.removeErrorListeners(); 
        parser.addErrorListener(new CapturadorErros()); 
       
        ParseTree tree = parser.init();
        // andar sobre a arvore de derivacao
        ParseTreeWalker walker = new ParseTreeWalker();
        
        tradutor tr = new tradutor();
        walker.walk(tr, tree);
    }

   
}*/

import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.util.Collections;
import java.util.List;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class Compilador {
    private static class CapturadorErros extends BaseErrorListener{
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,Object offendingSymbol,int line, int charPositionInLine,String msg,
    RecognitionException e)
    {
        List<String> stack = ((Parser)recognizer).getRuleInvocationStack();
        Collections.reverse(stack);
        System.out.println("System.out.println("+"\""+"ERRO: "+msg+"\""+");");
        }
    }
    
    public static String LerArquivos(String nome_arquivo,Boolean Verif_tem_erro) throws FileNotFoundException, IOException{
        String linha = "",path="",conteudo="////inicio ";
        path=System.getProperty("user.dir")+nome_arquivo;
        System.out.println(nome_arquivo);
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        linha = buffRead.readLine();
        if(linha!=null){
            conteudo=linha;
            linha = buffRead.readLine();
        }
        while (linha!=null) {
            conteudo=conteudo+linha;
            conteudo=conteudo.replace("null","");
            linha = buffRead.readLine();
            if (Verif_tem_erro==true && linha.contains("ERRO")){
                buffRead.close();
                return linha;
            }
        }
       buffRead.close();
       return conteudo;
    }
    
    public static void popularArquivo(){
        
    }
    
    public static void DesenharMain(String erro){
        System.out.println("import java.util.Scanner;");
            System.out.println("public class Code{");
            System.out.println("    public static void main(String[] args){");
            System.out.println(erro);
            System.out.println("    }");
            System.out.println("}");
            
    }
    
    
    public static void main(String[] args)throws IOException {
       String conteudo;
       conteudo=LerArquivos("\\entrada.txt",false);
       InputStream entradaStream = new ByteArrayInputStream(conteudo.getBytes());
       //fazer leitura do codigo do usuario
       CharStream inputC = CharStreams.fromStream(entradaStream);
       // instanciar o analisar lexico
       atribuicaoLexer lexer = new atribuicaoLexer(inputC);
       // gerar os tokens
       CommonTokenStream tokens = new CommonTokenStream(lexer);
       // instanciar o analisador sintatico
       atribuicaoParser parser = new atribuicaoParser(tokens);
       parser.removeErrorListeners(); 
       parser.addErrorListener(new CapturadorErros()); 
       ParseTree tree = parser.init();
       // andar sobre a arvore de derivacao
       ParseTreeWalker walker = new ParseTreeWalker();
       tradutor tr = new tradutor();
       walker.walk(tr, tree);
       //Verificando se o arquivo existe.
        System.out.println("Encaminhando para impressao em arquivo");
        File file = new File(System.getProperty("user.dir")+"\\saida\\Code.java");
        boolean code_txt = Files.exists(file.toPath());  
        if (code_txt==false){
            PrintStream stream = new PrintStream(file);
            System.setOut(stream);
            walker.walk(tr, tree);
            stream.close();
            String erro=LerArquivos("\\saida\\Code.java",true);
            File file_java = new File(System.getProperty("user.dir")+"\\saida\\Code.java");
            PrintStream stream2 = new PrintStream(file_java);
            System.setOut(stream2);
            DesenharMain(erro);
           
            stream.close();
        }else{
            String erro=LerArquivos("\\saida\\Code.java",true);
            File file_java = new File(System.getProperty("user.dir")+"\\saida\\Code.java");
            PrintStream stream = new PrintStream(file_java);
            System.setOut(stream);
            DesenharMain(erro);
           
            stream.close();
            }
        
         File file2 = new File(System.getProperty("user.dir")+"\\saida\\Janela.java");
         PrintStream stream2 = new PrintStream(file2);
         System.setOut(stream2);
         
         BufferedReader reader = new BufferedReader(new FileReader(System.getProperty("user.dir")+"\\Interface1.txt"));
         String currentLine = reader.readLine();
         while (currentLine!=null) {
	         System.out.println(currentLine);
	         currentLine = reader.readLine();
         }
         reader.close();
         
         BufferedReader reader3 = new BufferedReader(new FileReader(System.getProperty("user.dir")+"\\saida\\Code.java"));
         String currentLineC = reader3.readLine();
         while (currentLineC!=null) {
	         System.out.println(currentLine);
	         currentLineC = reader3.readLine();
         }
         reader.close();
         
         System.out.print('"'+"); \n jTextArea2.setText("+'"');
         BufferedReader reader2 = new BufferedReader(new FileReader(System.getProperty("user.dir")+"\\Interface2.txt"));
         String currentLine2 = reader.readLine();
         while (currentLine2!=null) {
	         System.out.println(currentLine);
	         currentLine2 = reader.readLine();
         }
         reader.close();

    }
    
    
        }
        
        
    

  

    

