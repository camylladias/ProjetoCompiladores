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
import java.io.FileNotFoundException;
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
        throw new RuntimeException("ERRO: Elemento faltante de acordo com a gramatica na "+"linha "+line+":"+charPositionInLine+": "+msg);
        }
    }

    public static String LerArquivos(String nome_arquivo,Boolean Verif_tem_erro) throws FileNotFoundException, IOException{
        String linha = "",path="",conteudo="////inicio ";
        path=System.getProperty("user.dir")+nome_arquivo;
 
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
            
        }
       buffRead.close();
       return conteudo;
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
    }
}    
