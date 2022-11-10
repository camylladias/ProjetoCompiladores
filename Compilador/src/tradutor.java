
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package compilador;

/**
 *
 * @author unifgversolato
 */
import static java.lang.Integer.parseInt;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.ArrayList;
public class tradutor  extends atribuicaoBaseListener{
    String controle_tipo="";
    String controle_tipo_aux="";
    Dictionary controle_espacos = new Hashtable();
   
 
    public StringBuilder CaminharEspacos(String comando_palavra_reservada){
        int qnd_exec_atual=parseInt(this.controle_espacos.get(comando_palavra_reservada).toString());
        StringBuilder espacos=new StringBuilder();
        String espaco= "  ";
        for (int i=0;i<=(espaco.length())*qnd_exec_atual;i++){
                espacos.append(espaco);
        }
      return espacos;  
    }
    
    public void AumentarControleDicionario(String comando_nome){
        int qnd_exec=parseInt(this.controle_espacos.get(comando_nome).toString());
        qnd_exec=qnd_exec+1;
        this.controle_espacos.put(comando_nome, qnd_exec);
    }
    @Override 
    public void enterInit(atribuicaoParser.InitContext ctx) { 
        this.controle_espacos.put("if", 0);
        this.controle_espacos.put("else", 0);
        this.controle_espacos.put("for", 0);
        this.controle_espacos.put("while", 0);
        System.out.println("import java.util.Scanner;");
        System.out.println("public class Code{");
        System.out.println("    public static void main(String[] args){");
    }
    
    
    @Override 
    public void exitInit(atribuicaoParser.InitContext ctx) { 
        System.out.println("\n  }");
        System.out.println("\n}");   
    }
    
    @Override 
    public void enterCmdLeia(atribuicaoParser.CmdLeiaContext ctx) { 
        System.out.println("      Scanner scanner = new Scanner(System.in);");
        System.out.print("      String " );  
    }
    
    @Override 
    public void enterCmdSe(atribuicaoParser.CmdSeContext ctx) { 
        this.controle_tipo="if";
        System.out.print(CaminharEspacos("if")+"if");
        AumentarControleDicionario(this.controle_tipo);
    }
    
    @Override 
    public void enterCmdSenao(atribuicaoParser.CmdSenaoContext ctx) {
         this.controle_tipo="else";
         AumentarControleDicionario(this.controle_tipo);
         System.out.print(CaminharEspacos("else")+"else");
    }
    
    @Override 
    public void enterCmdPara(atribuicaoParser.CmdParaContext ctx) { 
        this.controle_tipo="for";
        AumentarControleDicionario(this.controle_tipo);
        System.out.println(CaminharEspacos("for")+"for");
    }
    
    @Override 
    public void enterCmdEnquanto(atribuicaoParser.CmdEnquantoContext ctx) { 
        this.controle_tipo="while";
        AumentarControleDicionario(this.controle_tipo);
        System.out.println(CaminharEspacos("while")+"while");
    }
   
    @Override 
    public void enterCmdImprime(atribuicaoParser.CmdImprimeContext ctx) { 
        System.out.print("      System.out.print");
    }
    
    @Override
    public void enterTipo(atribuicaoParser.TipoContext ctx) {
        String tipo = ctx.getText();

        switch(tipo){
          case "booleano":{
              System.out.print("      Boolean ");
              this.controle_tipo="Boolean";
              break;
          }
              
          case "inteiro":{
              System.out.print("      int ");
              this.controle_tipo="int";
              break;
          }
             
          case "flutuante":{
              System.out.print("      double ");
              this.controle_tipo="double";
              break;
          }
              
          case "palavra":{
              System.out.print("      String ");
              this.controle_tipo="String";
              break;
          }
              
        }
  }
    @Override 
    public void enterBooleano(atribuicaoParser.BooleanoContext ctx) { 
        String tipo = ctx.getText();

        switch(tipo){
          case "True":{
              System.out.print("True");
              break;
          }
              
          case "False":{
              System.out.print("False");
              
              break;
          }
        }
    }
    
    @Override 
    public void enterOperadorAtri(atribuicaoParser.OperadorAtriContext ctx) { 
        System.out.print(" = ");
    }
    
    @Override
    public void exitFim(atribuicaoParser.FimContext ctx){
        System.out.print("; \n");
    }
    
    @Override 
    public void enterComplementoLeia(atribuicaoParser.ComplementoLeiaContext ctx) { 
         System.out.print(" = scanner.next()");   
    }
    
    @Override
    public void exitPlus(atribuicaoParser.PlusContext ctx){
        System.out.print(" + ");
    }
    
    @Override 
    public void exitMenus(atribuicaoParser.MenusContext ctx) { 
        System.out.print(" - ");
    }
    
    @Override 
    public void exitDiv(atribuicaoParser.DivContext ctx) { 
        System.out.print(" / ");
    }
    
    @Override 
    public void exitMult(atribuicaoParser.MultContext ctx) { 
        System.out.print(" * ");
    }
    
    @Override 
    public void enterCompIgual(atribuicaoParser.CompIgualContext ctx) { 
        System.out.print(" == ");
    }
     
    @Override 
    public void enterCompMaior(atribuicaoParser.CompMaiorContext ctx) { 
        System.out.print(" > ");
    }
    
    @Override 
    public void enterCompMenor(atribuicaoParser.CompMenorContext ctx) { 
        System.out.print(" < ");
    }
    
    @Override 
    public void enterCompMeIgual(atribuicaoParser.CompMeIgualContext ctx) { 
        System.out.print(" <= ");
    }
    
    @Override 
    public void enterCompMaIgual(atribuicaoParser.CompMaIgualContext ctx) { 
        System.out.print(" >= ");
    }
    
    @Override 
    public void enterCompDifer(atribuicaoParser.CompDiferContext ctx) { 
        System.out.print(" != ");
    }

    @Override 
    public void enterNumero(atribuicaoParser.NumeroContext ctx) {      
        if (ctx.NUMFLOAT() != null){
            System.out.print(ctx.NUMFLOAT().getText());
        }
        if (ctx.NUMINT()!= null){
            System.out.print(ctx.NUMINT().getText());
        }
    }
    
    @Override 
    public void enterId(atribuicaoParser.IdContext ctx) { 
        //System.out.print(this.controle_tipo);
        System.out.print(ctx.ID().getText());
       /* if (this.controle_tipo.contains("int") || this.controle_tipo.contains("double") || this.controle_tipo.contains("String") ||  this.controle_tipo.contains("Boolean")) {
            System.out.print(ctx.ID().getText());
        }*/
       /* else if (this.controle_tipo.contains("if")  ||this.controle_tipo.contains("else") || this.controle_tipo.contains("for") ||this.controle_tipo.contains("while")) {
             //System.out.print(this.controle_tipo);
            AumentarControleDicionario(this.controle_tipo);
            if (this.controle_tipo !="more_espace"){
                this.controle_tipo_aux=this.controle_tipo;

            }
            this.controle_tipo="more_espace";
            
        }
        else if (this.controle_tipo=="more_espace" ){
            System.out.print(CaminharEspacos(this.controle_tipo_aux)+ctx.ID().getText());
        }*/
        
        
        //
    }
    
    @Override 
    public void enterTexto(atribuicaoParser.TextoContext ctx) { 
        System.out.print(ctx.TEXTO().getText());
    }
    
    @Override 
    public void enterLeftParen(atribuicaoParser.LeftParenContext ctx) { 
        System.out.print("(");
    }
    
    @Override 
    public void enterRightParen(atribuicaoParser.RightParenContext ctx) { 
        System.out.print(")");
    }
    
    @Override 
    public void enterLeftChave(atribuicaoParser.LeftChaveContext ctx) { 
        System.out.print("{\n");
    }
    
    @Override 
    public void enterRightChave(atribuicaoParser.RightChaveContext ctx) { 
        System.out.print("      }");
    }
    
}


//Identacao olhando pela chave - testar, pegar a chave esquerda e procurar next token ate chegar a chave direita ou parenteses.
