
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
import java.util.Arrays;
import java.util.Dictionary;
import java.util.HashSet;
import java.util.Hashtable;

 
public class tradutor  extends atribuicaoBaseListener{
    String aux_tipo_scanner="";
    String controle_tipo="";
    String controle_tipo_aux="";
    Dictionary controle_espacos = new Hashtable();
    Dictionary variaveis_declaradas=new Hashtable();
 
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
    
    public Boolean VariavelDeclarada(String pesquisar_variavel){
        if (this.variaveis_declaradas.get(pesquisar_variavel)==null){
            return false;
        }else{
            return true;
        }  
    }
    public void DeclararVariavel(String nome_var,String tipo,Boolean var_criada){
        if (var_criada==false){
            this.variaveis_declaradas.put(nome_var,tipo);
        }
        
    }
    public Boolean isDigit(String numero){
      String numero_sem_ponto=numero.replace(".","");  
      char[] chars = numero_sem_ponto.toCharArray();
      for(char c : chars){
         if(!Character.isDigit(c)){
            return false;
         }
      }
      return true;
    }
    
    public Boolean checarConteudoBooleano(String conteudo){
       if(conteudo.equals("true") || conteudo.equals("false")){
            return true;
        }else{
            System.out.println("problema bool");
            return false;
        }        
    }
    
    public Boolean checarConteudoFlutuante(String conteudo){
        long quantidade_pontos= conteudo.chars().filter(ch -> ch == '.').count();
        if(conteudo.contains(".")==true && isDigit(conteudo)==true && quantidade_pontos==1){
            return true;
        }else{
            System.out.println("problema flutuante");
           return false;
        }
        
    }
    
    public Boolean checarConteudoInteiro(String conteudo){
        System.out.println(conteudo);
        if((conteudo.contains(".")==false) && isDigit(conteudo)==true){
                return true;
            }else{
            System.out.println("problema inteiro");
                return false;
        }    
    }
    
    public void checarConteudoPalavra(){
        
    }
    public void checarTipovariaveisDeclaradas(String id_atribuicao,String id_atribuida, String tipo,Boolean declarada){
        boolean var_declarada=VariavelDeclarada(id_atribuida);
        if (var_declarada==false){
            System.out.println("Voce esta tentando atribuir valor de uma variável inexistente.");
        }else{
            String tipo_atribuida=this.variaveis_declaradas.get(id_atribuida).toString();
                if (!tipo_atribuida.equals(tipo)){
                    System.out.println("Os tipos de atribuicoes são diferentes.");
                }else{
                    DeclararVariavel(id_atribuicao,tipo,declarada);
                }
        }
    }
   
    public void ChecarTipodeDados(atribuicaoParser.CmdAtribuiContext ctx,Boolean var_criada){
       String tipo="";
        if (var_criada==true){
            tipo=this.variaveis_declaradas.get(ctx.id(0).getText()).toString();
        }else{
            tipo=ctx.tipo().getText();
        }
        switch(tipo){
          case "booleano":{
                if (ctx.booleano()!=null){
                    if(checarConteudoInteiro(ctx.booleano().getText())){
                         DeclararVariavel(ctx.id(0).getText(),tipo,var_criada);
                    }
                  }else if (ctx.id(1) !=null){
                      checarTipovariaveisDeclaradas(ctx.id(0).getText(),ctx.id(1).getText(),tipo,var_criada);
                   }
                  else{
                      System.out.println("Tipo de dado inválido ao fazer a atribuicao");
                  }
                   break;
                 }
                
          case "inteiro":{
           if (ctx.numero()!=null){
              if(checarConteudoInteiro(ctx.numero().getText())==true){
                   DeclararVariavel(ctx.id(0).getText(),tipo,var_criada);
              }
            }else if (ctx.id(1) !=null){
                checarTipovariaveisDeclaradas(ctx.id(0).getText(),ctx.id(1).getText(),tipo,var_criada);
             }
            else{
                System.out.println("Tipo de dado inválido ao fazer a atribuicao");
            }
             break;
           }
          case "flutuante":{
              if (ctx.numero()!=null){
                  if(checarConteudoFlutuante(ctx.numero().getText())){
                   DeclararVariavel(ctx.id(0).getText(),tipo,var_criada);
        
              }else if (ctx.id(1) !=null){
               checarTipovariaveisDeclaradas(ctx.id(0).getText(),ctx.id(1).getText(),tipo,var_criada);
                }
                else{
                    System.out.println("Tipo de dado inválido ao fazer a atribuicao");
                }
                   break;
                }
            }
          case "palavra":{
             if (ctx.texto()!=null){
                 DeclararVariavel(ctx.id(0).getText(),tipo,var_criada);
             }else if (ctx.id(1) !=null){
               checarTipovariaveisDeclaradas(ctx.id(0).getText(),ctx.id(1).getText(),tipo,var_criada);
            }
           else{
               System.out.println("Tipo de dado inválido ao fazer a atribuicao");
           }
           break;
          }
         
          /*case "inteiro":{
           if (ctx.numero()!=null){
              if((ctx.numero().getText()).contains(".")==true || isDigit(ctx.numero().getText())==false){
                   System.out.println("TA errado inteiro");
              }else{
                  DeclararVariavel(ctx.id(0).getText(),ctx.tipo().getText());
              }
              
           }else if (ctx.id(1) !=null){
               checarTipovariaveisDeclaradas(ctx.id(0).getText(),ctx.id(1).getText(),ctx.tipo().getText());
            }
           else{
               System.out.println("Tipo de dado inválido ao fazer a atribuicao");
           }
            break;
          }
             
          case "flutuante":{
              if (ctx.numero()!=null){
                  long quantidade_pontos= ctx.numero().getText().chars().filter(ch -> ch == '.').count();
                  if((ctx.numero().getText()).contains(".")==false || isDigit(ctx.numero().getText())==false || quantidade_pontos!=1){
                  System.out.println("TA errado flutuate");
              }else{
                      DeclararVariavel(ctx.id(0).getText(),ctx.tipo().getText());
                  }
              }else if (ctx.id(1) !=null){
               checarTipovariaveisDeclaradas(ctx.id(0).getText(),ctx.id(1).getText(),ctx.tipo().getText());
            }
           else{
               System.out.println("Tipo de dado inválido ao fazer a atribuicao");
           }
              break;
          }
              
          case "palavra":{
             if (ctx.texto()!=null){
                 DeclararVariavel(ctx.id(0).getText(),ctx.tipo().getText());
             }else if (ctx.id(1) !=null){
               checarTipovariaveisDeclaradas(ctx.id(0).getText(),ctx.id(1).getText(),ctx.tipo().getText());
            }
           else{
               System.out.println("Tipo de dado inválido ao fazer a atribuicao");
           }
             break;
          }*/
            }
        
        
    }
    /*public void ChecarTipodeDados(atribuicaoParser.CmdAtribuiContext ctx ){
        
        switch(ctx.tipo().getText()){
          case "booleano":{
            if (ctx.booleano()!=null){
              if(ctx.booleano().getText().equals("true") || ctx.booleano().getText().equals("false")){
                  //DeclararVariavel(ctx.id(0).getText(),ctx.tipo().getText());
              }else{
                  System.out.println("TA errado bool");
              }
              
            }else if (ctx.id(1) !=null){
               checarTipovariaveisDeclaradas(ctx.id(0).getText(),ctx.id(1).getText(),ctx.tipo().getText());
            }
           else{
               System.out.println("Tipo de dado inválido ao fazer a atribuicao");
           }
             break;
          }
          case "inteiro":{
           if (ctx.numero()!=null){
              if((ctx.numero().getText()).contains(".")==true || isDigit(ctx.numero().getText())==false){
                   System.out.println("TA errado inteiro");
              }else{
                  DeclararVariavel(ctx.id(0).getText(),ctx.tipo().getText());
              }
              
           }else if (ctx.id(1) !=null){
               checarTipovariaveisDeclaradas(ctx.id(0).getText(),ctx.id(1).getText(),ctx.tipo().getText());
            }
           else{
               System.out.println("Tipo de dado inválido ao fazer a atribuicao");
           }
            break;
          }
             
          case "flutuante":{
              if (ctx.numero()!=null){
                  long quantidade_pontos= ctx.numero().getText().chars().filter(ch -> ch == '.').count();
                  if((ctx.numero().getText()).contains(".")==false || isDigit(ctx.numero().getText())==false || quantidade_pontos!=1){
                  System.out.println("TA errado flutuate");
              }else{
                      DeclararVariavel(ctx.id(0).getText(),ctx.tipo().getText());
                  }
              }else if (ctx.id(1) !=null){
               checarTipovariaveisDeclaradas(ctx.id(0).getText(),ctx.id(1).getText(),ctx.tipo().getText());
            }
           else{
               System.out.println("Tipo de dado inválido ao fazer a atribuicao");
           }
              break;
          }
              
          case "palavra":{
             if (ctx.texto()!=null){
                 DeclararVariavel(ctx.id(0).getText(),ctx.tipo().getText());
             }else if (ctx.id(1) !=null){
               checarTipovariaveisDeclaradas(ctx.id(0).getText(),ctx.id(1).getText(),ctx.tipo().getText());
            }
           else{
               System.out.println("Tipo de dado inválido ao fazer a atribuicao");
           }
             break;
          }
        }
        
    }*/
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
       boolean var=VariavelDeclarada(ctx.id().getText());
       if (var==false){
          System.out.println("ERRO: A variavel que voce esta tentando criar nao foi declarada ainda");
       }else{
        this.variaveis_declaradas.get(ctx.id().getText());
        String tipo=this.variaveis_declaradas.get(ctx.id().getText()).toString();
        if (tipo=="inteiro"){
            tipo="int";
            this.aux_tipo_scanner="inteiro";
        }else if(tipo=="flutuante"){
            tipo="double";
            this.aux_tipo_scanner="flutuante";
        }else if (tipo=="palavra"){
            tipo="String";
            this.aux_tipo_scanner="palavra";
        }   
        else {
            tipo="boolean";
            this.aux_tipo_scanner="booleano";
        }
        System.out.println("      Scanner scanner = new Scanner(System.in);");
        System.out.print("      "+tipo+" ");  
       }
        
    }
 
    @Override 
       public void enterComplementoLeia(atribuicaoParser.ComplementoLeiaContext ctx) { 
          String tipo=this.aux_tipo_scanner;
          if (tipo=="inteiro"){
                System.out.print(" = scanner.nextInt()"); 
           }else if(tipo=="flutuante"){
                System.out.print(" = scanner.nextDouble()"); 
           }else if (tipo=="palavra"){
                System.out.print(" = scanner.nextLine()"); 
           }   
           else if(tipo=="booleano"){
                System.out.print(" = scanner.nextBoolean()"); 
           }
       }
    
    //cmdEnquanto: 'enquanto' leftParen ((expr (compIgual|compMaior|compMenor|compMeIgual|compMaIgual|compDifer) expr)| booleano) rightParen leftChave cmd+ rightChave;

 
    @Override 
    public void enterCmdEnquanto(atribuicaoParser.CmdEnquantoContext ctx) {
        if (ctx.expr(0)!= null && ctx.expr(1) != null){
            //expr: id operadorAtri expressao;
            if (ctx.expr(0).id()==null){
                System.out.println("ERRO: Id nulo.");   
            }else{
                if (ctx.expr(0).expressao().termo().fator().numero()){
                ctx.expr(0).expressao().termo().fator().numero();
                ctx.expr(0).expressao().termo().fator().id();
                ctx.expr(1).expressao().termo().fator().numero();
                ctx.expr(1).expressao().termo().fator().id();
            }
            
            
        }
        else if (ctx.booleano() != null && "true".equals(ctx.booleano().getText()) ){
            
        }
    }
   
    
    @Override 
    public void enterCmdSe(atribuicaoParser.CmdSeContext ctx) { 
        String[] tipos_variaveis_expressoes = null;
        for (int i=0;i<ctx.expressao().toArray().length;i++){
           boolean var=VariavelDeclarada(ctx.expressao(i).getText());
           if (var==false){
               System.out.println("Você está tentando comparar variavel que nao existe: "+ctx.expressao(i).getText());
               return;
           }else{
               tipos_variaveis_expressoes[i]=this.variaveis_declaradas.get(ctx.expressao(i).getText()).toString();
           }
        }
        
        boolean tipos_diferentes = new HashSet<String>(Arrays.asList(tipos_variaveis_expressoes)).size()==1;
        if(tipos_diferentes){
            System.out.println("ERRO: Você está comparando tipos de dados diferentes");
            return;
        }else{
            this.controle_tipo="if";
            System.out.print(CaminharEspacos("if")+"if");
        }
        
        
       

    }
    
    @Override 
    public void enterCmdSenao(atribuicaoParser.CmdSenaoContext ctx) {
         this.controle_tipo="else";
         //AumentarControleDicionario(this.controle_tipo);
         System.out.print(CaminharEspacos("else")+"else");
    }
    
    @Override 
    
    public void enterExpr(atribuicaoParser.ExprContext ctx) { 
        
    }
    
    @Override 
    public void exitCmdPara(atribuicaoParser.CmdParaContext ctx) { 
        System.out.println("oiiiexit "+ctx.exception);
    
    }
    @Override 
    public void enterCmdPara(atribuicaoParser.CmdParaContext ctx) { 
        //cmdPara: 'para' leftParen tipo id operadorAtri numero fim id (compIgual|compMaior|compMenor|compMeIgual|compMaIgual|compDifer) numero fim expr rightParen leftChave cmd+ rightChave;
        boolean numero_atribuido=checarConteudoInteiro(ctx.numero(0).getText());
        boolean numero_comparativo=checarConteudoInteiro(ctx.numero(1).getText());
        
        //Verificação se os dois numeros enviados são inteiros
        if ((numero_atribuido==false) ||(numero_comparativo==false)){
            System.out.println("ERRO: os numeros digitados não correspondem com numeros inteiros.");
            return;
        }
        
        //Verificação se existe ou não o Id enviado e se o tipo de dado informado está correto
        if ((VariavelDeclarada(ctx.id(0).getText())==false) &&("inteiro".equals(ctx.tipo().getText()))){
            DeclararVariavel(ctx.id(0).getText(),ctx.tipo().getText(),false);
        }else{
            String tipo=this.variaveis_declaradas.get(ctx.id(0).getText()).toString();
            if (!"inteiro".equals(tipo)){
                System.out.println("ERRO: Você está tentando sobrescrever uma váriavel com o tipo diferente de inteiro");
                return;
            }
        }
        
        //Verificar se os IDs enviados são os mesmos.
        if(!ctx.id(0).getText().equals(ctx.id(1).getText())){
            System.out.println("ERRO: Variavel esperada: "+ctx.id(0).getText()+",variavel encontrada: "+ctx.id(1).getText());
            return;
        }
        
        //Verificacao do contador
         String contador_atribuicao=ctx.expr().id().getText();
         
         if (!contador_atribuicao.equals(ctx.id(0).getText())){
            System.out.println("ERRO:a variavel que voce esta tentando atribuir é diferente da delcrada.");
            return;
         }else{
             if (ctx.expr().expressao().termo().fator().id() != null){
                 String contador_auto_atribuicao=ctx.expr().expressao().termo().fator().id().getText();
                 if (!contador_auto_atribuicao.equals(ctx.id(0).getText())){
                      System.out.println("ERRO:a variavel que voce esta tentando criar uma atribuicao é diferente da delcrada.");
                      return;
                 }else{
                     if (ctx.expr().expressao().expreLinha().termo().fator().id() != null){
                         String id=ctx.expr().expressao().expreLinha().termo().fator().id().getText();
                          if (VariavelDeclarada(id)==false){
                             System.out.println("ERRO:a variavel que voce esta tentando jogar na atribuicao nao esta definida.");
                             return;
                         }

                         if (!"inteiro".equals(this.variaveis_declaradas.get(id).toString())){
                            System.out.println("ERRO:a variavel que voce esta tentando jogar na atribuicao nao é do tipo inteiro.");
                            return;
                        } 
                         
                     }
                     if (ctx.expr().expressao().termo().termoLinha().fator().id() !=null){
                         String id=ctx.expr().expressao().termo().termoLinha().fator().id().getText();
                         if (VariavelDeclarada(id)==false){
                             System.out.println("ERRO:a variavel que voce esta tentando jogar na atribuicao nao esta definida.");
                             return;
                         }

                         if (!"inteiro".equals(this.variaveis_declaradas.get(id).toString())){
                            System.out.println("ERRO:a variavel que voce esta tentando jogar na atribuicao nao é do tipo inteiro.");
                            return;
                        } 
                     }
                     
                     if(ctx.expr().expressao().expreLinha().termo().fator().numero() !=null){
                         String id=ctx.expr().expressao().expreLinha().termo().fator().numero().getText();
                         if (checarConteudoInteiro(id)==false){
                             System.out.println("ERRO:O valor que voce esta tentando jogar na atribuicao nao é inteiro.");
                             return;
                         };
                     }
                     if(ctx.expr().expressao().termo().termoLinha().fator().numero() != null){
                         String id=ctx.expr().expressao().termo().termoLinha().fator().numero().getText();
                         if (checarConteudoInteiro(id)==false){
                             System.out.println("ERRO:O valor que voce esta tentando jogar na atribuicao nao é inteiro.");
                             return;
                         };
                     }
                 }
             }
         }
         
         
         
         
         
         
         
            
        this.controle_tipo="for";
        //AumentarControleDicionario(this.controle_tipo);
        System.out.println(CaminharEspacos("for")+"for");
    }
    
    @Override 
    public void enterCmdEnquanto(atribuicaoParser.CmdEnquantoContext ctx) { 
        this.controle_tipo="while";
        //AumentarControleDicionario(this.controle_tipo);
        System.out.println(CaminharEspacos("while")+"while");
    }
   
    @Override 
    public void enterCmdImprime(atribuicaoParser.CmdImprimeContext ctx) { 
        if (ctx.id()!=null){
                boolean var=VariavelDeclarada(ctx.id().getText());
                if (var==false){
                   System.out.println("Você está tentando imprimir uma variavel que nao existe: "+ctx.id().getText());
                   return;
               }
            }
        
        System.out.print("      System.out.println");
    }
    
    @Override
    public void enterTipo(atribuicaoParser.TipoContext ctx) {
        String tipo = ctx.getText();
        switch(tipo){
          case "booleano":{
              System.out.print("      boolean ");
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
          case "true":{
              System.out.print("true");
              break;
          }   
          case "false":{
              System.out.print("false");
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
        System.out.print(ctx.ID().getText());
    }
    
    
    @Override 
    
    public void exitCmdDeclara(atribuicaoParser.CmdDeclaraContext ctx){
        this.variaveis_declaradas.put("x","inteiro");
        if (ctx.id()!=null){
            if (VariavelDeclarada(ctx.id().getText())==true){
                System.out.println("ERRO: O nome da variavel informada já existe.");
            }else{
                DeclararVariavel(ctx.id().getText(),ctx.tipo().getText(),false);
            }
        }
    }
     
    @Override 
    public void exitCmdAtribui(atribuicaoParser.CmdAtribuiContext ctx){
      
       
       if (ctx.tipo() == null){
           //Teste();
           ChecarTipodeDados(ctx,true);
           
       }else{
            if (VariavelDeclarada(ctx.id(0).getText())==false){
              //  ChecarTipodeDados(ctx);
            }else{
                System.out.println("ERRO: O nome da variável informada já existe.");
            }
       } 
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
