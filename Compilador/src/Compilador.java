/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author unifgversolato
 */

import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import java.io.FileReader;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.InputStream;


public class Compilador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
        //ler codigo -> passar para o lexico -> passar para o sintatico -> fazer
        //a taducao
        String linha = "",path="",conteudo="";
        System.out.println("Digite o path do arquivo:");
        Scanner in = new Scanner(System.in);
        path=System.getProperty("user.dir")+"\\entrada.txt";
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
		while (linha!=null) {
			linha = buffRead.readLine();
            conteudo=conteudo+linha;
		}
		buffRead.close();
        InputStream entradaStream = new ByteArrayInputStream(conteudo.getBytes());
        //fazer leitura do codigo do usuario
        CharStream input = CharStreams.fromStream(entradaStream);
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
    
}
