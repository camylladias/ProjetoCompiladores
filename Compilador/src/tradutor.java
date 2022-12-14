
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
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashSet;
import java.util.Hashtable;

 

public class tradutor  extends atribuicaoBaseListener{    
    String aux_tipo_scanner="";
    String controle_tipo="";
    String controle_tipo_aux="";
    Dictionary controle_espacos = new Hashtable();
    Dictionary variaveis_declaradas=new Hashtable();
    Boolean scanner_criado=null;
 
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
        return this.variaveis_declaradas.get(pesquisar_variavel) != null;  
    }
    public void DeclararVariavel(String nome_var,String tipo,Boolean var_criada){
        Object checar_dec=this.variaveis_declaradas.get(nome_var);
        if (var_criada==false && checar_dec==null){
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
      
        return conteudo.contains("\"")==false && (conteudo.equals("true") || conteudo.equals("false")); 
       
    }
    
    public Boolean checarConteudoFlutuante(String conteudo){
        long quantidade_pontos= conteudo.chars().filter(ch -> ch == '.').count();
        return conteudo.contains(".")==true && isDigit(conteudo)==true && quantidade_pontos==1; 
        
    }
    
    public Boolean checarConteudoInteiro(String conteudo){
        return (conteudo.contains(".")==false) && isDigit(conteudo)==true; 
    }
    
    public Boolean checarConteudoPalavra(String conteudo){
        long quantidade_quotes= conteudo.chars().filter(ch -> ch == '"').count();
        return conteudo.contains("\"")==true && conteudo.startsWith("\"")==true && conteudo.endsWith("\"")==true && quantidade_quotes==2; 
    }
    public String checarTipovariaveisDeclaradas(String id_atribuicao,String id_atribuida, String tipo,Boolean declarada){
        boolean var_declarada=VariavelDeclarada(id_atribuida);
        if (var_declarada==false){
            //System.out.println("System.out.println("+"\""+"ERRO: Voce esta tentando atribuir valor de uma variavel inexistente."+"\""+");");
            throw new RuntimeException("ERRO: Voce esta tentando atribuir valor de uma variavel inexistente.");
        }else{
            String tipo_atribuida=this.variaveis_declaradas.get(id_atribuida).toString();
                if (!tipo_atribuida.equals(tipo) & !tipo.equals("flutuante") & !tipo_atribuida.equals("inteiro")){
                    
                    //System.out.println("System.out.println("+"\""+"ERRO: Os tipos de atribuicoes sao diferentes. Tipo esperado -> "+tipo+"\""+"\""+", tipo fornecido ->"+tipo_atribuida+"\""+");");
                    throw new RuntimeException("ERRO: Os tipos de atribuicoes sao diferentes. Tipo esperado -> "+tipo+", tipo fornecido ->"+tipo_atribuida);
                }else{
                    return "OK";
                }
        }
    }
    
    public Boolean Checar_Var_Com_Multiplos_Conteudos(String variavel_expr,String conteudo,String tipo_var_expr,Boolean expr_criada){
        if (conteudo.contains("\"") && !"palavra".equals(tipo_var_expr)){
            //System.out.println("System.out.println("+"\""+"ERRO: Voce esta tentando inserir uma string numa variavel do tipo -> "+tipo_var_expr+"\""+"\""+". String -> "+conteudo+"\""+");");
            throw new RuntimeException("ERRO: Voce esta tentando inserir um valor com um tipo diferente de -> "+tipo_var_expr+". String -> "+conteudo);
        }else if(conteudo.contains("\"") &&"palavra".equals(tipo_var_expr)){
           if (checarConteudoPalavra(conteudo)==false){
                    //System.out.println("System.out.println("+"\""+"ERRO: Voce esta tentando inserir um valor com um tipo diferente de ->"+tipo_var_expr+"\""+"\""+". Valor -> "+conteudo+"\""+");");
                    throw new RuntimeException("ERRO: Voce esta tentando inserir um valor com um tipo diferente de -> "+tipo_var_expr+". Valor -> "+conteudo);
                }
            
        }else if (isDigit(conteudo)==true){
            if (tipo_var_expr.equals("inteiro")){
                if (checarConteudoInteiro(conteudo)==false){
                    //System.out.println("System.out.println("+"\""+"ERRO: Voce esta tentando inserir um valor com um tipo diferente de -> "+tipo_var_expr+"\""+"\""+". Valor -> "+conteudo+"\""+");");
                    throw new RuntimeException("ERRO: Voce esta tentando inserir um valor com um tipo diferente de -> "+tipo_var_expr+". Valor -> "+conteudo);
                }
            }
            
            if (tipo_var_expr.equals("flutuante")){
                if (checarConteudoFlutuante(conteudo)==false){
                    //System.out.println("System.out.println("+"\""+"ERRO: Voce esta tentando inserir um valor com um tipo diferente de -> "+tipo_var_expr+"\""+"\""+". Valor -> "+conteudo+"\""+");");
                    throw new RuntimeException("ERRO: Voce esta tentando inserir um valor com um tipo diferente de -> "+tipo_var_expr+". Valor -> "+conteudo);
                }
            }
            if (tipo_var_expr.equals("palavra") ||tipo_var_expr.equals("booleano")){
                    //System.out.println("System.out.println("+"\""+"ERRO: Voce esta tentando inserir um valor com um tipo diferente de -> "+tipo_var_expr+"\""+"\""+". Valor -> "+conteudo+"\""+");");
                    throw new RuntimeException("ERRO: Voce esta tentando inserir um valor com um tipo diferente de -> "+tipo_var_expr+". Valor -> "+conteudo);
                
            }
            
        }else {
            String retorno_tipo=checarTipovariaveisDeclaradas(variavel_expr,conteudo,tipo_var_expr,expr_criada);
            if (retorno_tipo.equals("ERRO")){
                //System.out.println("System.out.println("+"\""+"ERRO: O tipo da variavel que sendo atribuida ?? diferente de -> "+tipo_var_expr+"\""+"\""+". ID ->"+conteudo+"\""+");");
                throw new RuntimeException("ERRO: O tipo da variavel que sendo atribuida ?? diferente de -> "+tipo_var_expr+". ID ->"+conteudo);
            }
        } 
       return false; 
    }
   
    public void checarTipoDadosComparacoes(ArrayList tipos_variaveis_expressao_0,ArrayList tipos_variaveis_expressao_1){
        if ((tipos_variaveis_expressao_0.get(0)).equals(tipos_variaveis_expressao_1.get(0))==false){
            throw new RuntimeException("ERRO: Voce esta comparando tipos de dados diferentes. Tipos encontrados: "+tipos_variaveis_expressao_0.get(0)+", "+tipos_variaveis_expressao_1.get(0));
            //System.out.println("System.out.println("+"\""+"ERRO: Voce esta comparando tipos de dados diferentes. Tipos encontrados: "+tipos_variaveis_expressao_0.get(0)+"\""+"\""+", "+tipos_variaveis_expressao_1.get(0)+"\""+");");
            }
    }
            
        
    
    
    public ArrayList percorrerPrimeiraComparacao(String[] conteudo_expr_0 ){
        ArrayList<String> tipos_variaveis_expressao_0 = new ArrayList();    
        for(String conteudo_0:conteudo_expr_0){       
            if (conteudo_0.isEmpty()==false){
                    if (isDigit(conteudo_0)==true){
                        if (checarConteudoInteiro(conteudo_0)==true){
                            tipos_variaveis_expressao_0.add("inteiro");
                        }else if (checarConteudoFlutuante(conteudo_0)==true){
                            tipos_variaveis_expressao_0.add("flutuante");
                        }
                    }else if (checarConteudoPalavra(conteudo_0)==true){
                        tipos_variaveis_expressao_0.add("palavra");
                    }else{
                        if (VariavelDeclarada(conteudo_0)==false){
                            throw new RuntimeException("ERRO: A variavel informada na expressao nao foi declarada -> "+conteudo_0);
                            //System.out.println("System.out.println("+"\""+"ERRO: A variavel informada na expressao nao foi declarada -> "+conteudo_0+"\""+");");                      
                            
                        }else{
                            String tipo_var=this.variaveis_declaradas.get(conteudo_0).toString();
                            tipos_variaveis_expressao_0.add(tipo_var);
                        }
                    }
                }   
            }
        
        boolean tipos_diferentes_expr0 = new HashSet<String>(tipos_variaveis_expressao_0).size()==1;
        if(tipos_diferentes_expr0==false){
            throw new RuntimeException("ERRO:Voce esta comparando tipos de dados diferentes ");
            //System.out.println("System.out.println("+"\""+"ERRO:Voce esta comparando tipos de dados diferentes "+"\""+");");
            
        }
        return tipos_variaveis_expressao_0;
    }
    
    public ArrayList percorrerSegundaComparacao(String[] conteudo_expr_1){
        ArrayList<String> tipos_variaveis_expressao_1 = new ArrayList();
        for(String conteudo_1:conteudo_expr_1){
            if (conteudo_1.isEmpty()==false){
                if (isDigit(conteudo_1)==true){
                    if (checarConteudoInteiro(conteudo_1)==true){
                        tipos_variaveis_expressao_1.add("inteiro");
                    }else if (checarConteudoFlutuante(conteudo_1)==true){
                        tipos_variaveis_expressao_1.add("flutuante");
                    }
                }else if (checarConteudoPalavra(conteudo_1)==true){
                    tipos_variaveis_expressao_1.add("palavra");
                }else{
                    if (VariavelDeclarada(conteudo_1)==false){
                        throw new RuntimeException("ERRO: A variavel informada na expressao nao foi declarada -> "+conteudo_1);
                        //System.out.println("System.out.println("+"\""+"ERRO: A variavel informada na expressao nao foi declarada -> "+conteudo_1+"\""+");");                        
                    }else{
                        String tipo_var=this.variaveis_declaradas.get(conteudo_1).toString();
                        tipos_variaveis_expressao_1.add(tipo_var);
                    }
                }
            }
        }
        boolean tipos_diferentes_expr1 = new HashSet<String>(tipos_variaveis_expressao_1).size()==1;
        if(tipos_diferentes_expr1==false){
            throw new RuntimeException("ERRO:Voce esta comparando tipos de dados diferentes ");
            //System.out.println("System.out.println("+"\""+"ERRO:Voce esta comparando tipos de dados diferentes "+"\""+");");

            
        }
          return tipos_variaveis_expressao_1;      
   
    }
    
    public void ChecarTipodeDados(atribuicaoParser.CmdAtribuiContext ctx,Boolean var_criada){
        String [] conteudo_expr=null;
        String tipo="";
        Boolean houve_declaracao_errada=null;
        if (var_criada==true){
            tipo=this.variaveis_declaradas.get(ctx.expr().id().getText()).toString();
            for (int i=0;i<ctx.expr().depth();i++){
                conteudo_expr=ctx.expr().expressao().getText().split("\\(|\\)|\\+|\\-|\\/|\\*");
            }
        }else{
            tipo=ctx.tipo().getText();
        }
        switch(tipo){
            case "booleano":{
                if (ctx.booleano()!=null){
                    if(checarConteudoBooleano(ctx.booleano().getText())==true){
                         DeclararVariavel(ctx.id(0).getText(),tipo,var_criada);
                    }else{
                        throw new RuntimeException("ERRO: Voce esta tentando inserir um valor com um tipo diferente de booleano. Valor -> "+ctx.booleano().getText());
                        //System.out.println("System.out.println("+"\""+"ERRO: Voce esta tentando inserir um valor com um tipo diferente de booleano. Valor -> "+ctx.booleano().getText()+"\""+");");
                }
                  }else if (ctx.id(1) !=null){
                      String retorno=checarTipovariaveisDeclaradas(ctx.id(0).getText(),ctx.id(1).getText(),tipo,var_criada);
                      if (retorno.equals("OK")){
                          DeclararVariavel(ctx.id(0).getText(),tipo,var_criada);
                      }
                      
                   }
                  else if (conteudo_expr !=null && conteudo_expr.length>1){
                      throw new RuntimeException("ERRO: Variaveis do tipo booleano suportam apenas um valor de atribuicao.");
                      //System.out.println("System.out.println("+"\""+"ERRO: Variaveis do tipo booleano suportam apenas um valor de atribuicao."+"\""+");");

                  
                  }else if (conteudo_expr !=null && conteudo_expr.length==1){
                        for(String conteudo:conteudo_expr){
                            if (conteudo.isEmpty()==false){
                                if(checarConteudoBooleano(conteudo)==true){
                                    DeclararVariavel(ctx.expr().id().getText(),tipo,var_criada);
                                }else{
                                    throw new RuntimeException("ERRO: Voce esta tentando inserir um valor com um tipo diferente de booleano. Valor ->"+conteudo);
                                    //System.out.println("System.out.println("+"\""+"ERRO: Voce esta tentando inserir um valor com um tipo diferente de booleano. Valor ->"+conteudo+"\""+");");
                                }
                            }    
                        }
                  
                  }else{
                      throw new RuntimeException("ERRO: Tipo de dado invalido ao fazer a atribuicao.");
                       //System.out.println("System.out.println("+"\""+"ERRO: Tipo de dado invalido ao fazer a atribuicao."+"\""+");");
                  }
                   break;
                 }
                
            case "inteiro":{
            if (ctx.numero()!=null){
                if(checarConteudoInteiro(ctx.numero().getText())==true){
                   DeclararVariavel(ctx.id(0).getText(),tipo,var_criada);
                }else{
                    throw new RuntimeException("ERRO: Voce esta tentando inserir um valor com um tipo diferente de inteiro. Valor ->"+ctx.numero().getText());
                    //System.out.println("System.out.println("+"\""+"ERRO: Voce esta tentando inserir um valor com um tipo diferente de inteiro. Valor ->"+ctx.numero().getText()+"\""+");");
                }
            }else if (ctx.id(1) !=null){
                String declarar=checarTipovariaveisDeclaradas(ctx.id(0).getText(),ctx.id(1).getText(),tipo,var_criada);
                if (declarar.equals("OK")){
                    DeclararVariavel(ctx.id(0).getText(),tipo,var_criada);
                }
            }else if (conteudo_expr !=null && conteudo_expr.length>0){
                String var_expr=ctx.expr().id().getText();
                for(String conteudo:conteudo_expr){
                    if (conteudo.isEmpty()==false){
                        houve_declaracao_errada=Checar_Var_Com_Multiplos_Conteudos(var_expr,conteudo,tipo,var_criada);
                    }    
                }
                if (houve_declaracao_errada==false){
                    DeclararVariavel(ctx.expr().id().getText(),tipo,var_criada);
                }
            }
            else{
                throw new RuntimeException("ERRO: Tipo de dado invalido ao fazer a atribuicao.");
               //System.out.println("System.out.println("+"\""+"ERRO: Tipo de dado invalido ao fazer a atribuicao."+"\""+");");
               
            }
             break;
           }
          case "flutuante":{
            if (ctx.numero()!=null){
                if(checarConteudoFlutuante(ctx.numero().getText())==true){
                   DeclararVariavel(ctx.id(0).getText(),tipo,var_criada);
                }else{
                    throw new RuntimeException("ERRO: Voce esta tentando inserir um valor com um tipo diferente de flutuante. Valor -> "+ctx.numero().getText());
                    //System.out.println("System.out.println("+"\""+"ERRO: Voce esta tentando inserir um valor com um tipo diferente de flutuante. Valor -> "+ctx.numero().getText()+"\""+");");
                }
            }else if (ctx.id(1) !=null){
                String declarar=checarTipovariaveisDeclaradas(ctx.id(0).getText(),ctx.id(1).getText(),tipo,var_criada);
                if (declarar.equals("OK")){
                    DeclararVariavel(ctx.id(0).getText(),tipo,var_criada);
                }
            }else if (conteudo_expr !=null && conteudo_expr.length>0){
                String var_expr=ctx.expr().id().getText();
                for(String conteudo:conteudo_expr){
                    if (conteudo.isEmpty()==false){
                        houve_declaracao_errada=Checar_Var_Com_Multiplos_Conteudos(var_expr,conteudo,tipo,var_criada);
                    }    
                }
                if (houve_declaracao_errada==false){
                    DeclararVariavel(ctx.expr().id().getText(),tipo,var_criada);
                }
            }
            else{
                throw new RuntimeException("ERRO: Tipo de dado invalido ao fazer a atribuicao. ");
               //System.out.println("System.out.println("+"\""+"ERRO: Tipo de dado invalido ao fazer a atribuicao. "+"\""+");");
            }
             break;
            }
          case "palavra":{
          if (ctx.texto()!=null){
                if(checarConteudoPalavra(ctx.texto().getText())==true){
                   DeclararVariavel(ctx.id(0).getText(),tipo,var_criada);
                }else{
                    throw new RuntimeException("ERRO: Voce esta tentando inserir um valor com um tipo diferente de palavra. Valor -> "+ctx.texto().getText());
                //System.out.println("System.out.println("+"\""+"ERRO: Voce esta tentando inserir um valor com um tipo diferente de palavra. Valor -> "+ctx.texto().getText()+"\""+");");
                }
            }else if (ctx.id(1) !=null){
                
                String declarar=checarTipovariaveisDeclaradas(ctx.id(0).getText(),ctx.id(1).getText(),tipo,var_criada);
                if (declarar.equals("OK")){
                    DeclararVariavel(ctx.id(0).getText(),tipo,var_criada);
                }
            }else if (conteudo_expr !=null && conteudo_expr.length>0){
                String var_expr=ctx.expr().id().getText();
                for(String conteudo:conteudo_expr){
                    if (conteudo.isEmpty()==false){
                        houve_declaracao_errada=Checar_Var_Com_Multiplos_Conteudos(var_expr,conteudo,tipo,var_criada);
                    }    
                }
                if (houve_declaracao_errada==false){
                    DeclararVariavel(ctx.expr().id().getText(),tipo,var_criada);
                }
            }
            else{
                throw new RuntimeException("ERRO: Tipo de dado invalido ao fazer a atribuicao.");
    
               //System.out.println("System.out.println("+"\""+"ERRO: Tipo de dado invalido ao fazer a atribuicao."+"\""+");");

            }
             break;
        }    
    }
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
       boolean var=VariavelDeclarada(ctx.id().getText());
       if (var==false){
           throw new RuntimeException("ERRO: A variavel que voce esta tentando ler nao foi declarada ainda.");
           //System.out.println("System.out.println("+"\""+"ERRO: A variavel que voce esta tentando ler nao foi declarada ainda."+"\""+");");
       }else{
        this.variaveis_declaradas.get(ctx.id().getText());
        String tipo=this.variaveis_declaradas.get(ctx.id().getText()).toString();
        if (null == tipo){
            tipo="boolean";
            this.aux_tipo_scanner="booleano";
        }else switch (tipo) {
               case "inteiro":
                   tipo="int";
                   this.aux_tipo_scanner="inteiro";
                   break;
               case "flutuante":
                   tipo="double";
                   this.aux_tipo_scanner="flutuante";
                   break;
               case "palavra":
                   tipo="String";
                   this.aux_tipo_scanner="palavra";
                   break;
               default:
                   tipo="boolean";
                   this.aux_tipo_scanner="booleano";
                   break;
           }
        if (this.scanner_criado==null){
            this.scanner_criado=true;
             System.out.println("      Scanner scanner = new Scanner(System.in);");
        }
       
       }
        
    }
    
    @Override 
    public void enterCmdEnquanto(atribuicaoParser.CmdEnquantoContext ctx) {
        String [] conteudo_expr_0=null;
        String [] conteudo_expr_1=null;
        //cmdEnquanto: 'enquanto' leftParen ((expr (compIgual|compMaior|compMenor|compMeIgual|compMaIgual|compDifer) expr)| booleano) rightParen leftChave cmd+ rightChave;
        if (ctx.expressao(0)!= null && ctx.expressao(1) != null){
            //expr: id operadorAtri expressao;
            if (ctx.expressao(0)==null || ctx.expressao(1)==null) {
                //System.out.println("System.out.println("+"\""+"ERRO: Id nulo."+"\""+");");
                throw new RuntimeException("ERRO: Id nulo.");
            }else{
                for (int i=0;i<ctx.expressao(0).depth();i++){
                    conteudo_expr_0=ctx.expressao(0).getText().split("\\(|\\)|\\+|\\-|\\/|\\*"); 
                }
                
                for (int i=0;i<ctx.expressao(1).depth();i++){
                    conteudo_expr_1=ctx.expressao(1).getText().split("\\(|\\)|\\+|\\-|\\/|\\*"); 
                }
                ArrayList tipos_de_dados_0=percorrerPrimeiraComparacao(conteudo_expr_0);
                ArrayList tipos_de_dados_1=percorrerSegundaComparacao(conteudo_expr_1);
                checarTipoDadosComparacoes(tipos_de_dados_0,tipos_de_dados_1);
                
            }
        }else if (ctx.booleano() != null && "false".equals(ctx.booleano().getText().toLowerCase()) ){
            //System.out.println("System.out.println("+"\""+"ERRO: Nao ?? possivel o controle ser falso. Valor enviado ->  "+ctx.booleano().getText().toLowerCase()+"\""+");");
            throw new RuntimeException("ERRO: Nao ?? possivel o controle ser falso. Valor enviado ->"+ctx.booleano().getText().toLowerCase());
        }
        else{
            //System.out.println("System.out.println("+"\""+"ERRO: A expressao enviada nao ?? valida."+"\""+");");
            throw new RuntimeException("ERRO: A expressao enviada nao ?? valida.");
            
            
        }
        
        this.controle_tipo="while";
        System.out.print(CaminharEspacos("while")+"while");
    }
    
    
    @Override 
    public void enterCmdSe(atribuicaoParser.CmdSeContext ctx) { 
        String [] conteudo_expr_0=null;
        String [] conteudo_expr_1=null;
         if (ctx.expressao(0)==null || ctx.expressao(1)==null) {
                //System.out.println("System.out.println("+"\""+"ERRO: Id nulo."+"\""+");");
                throw new RuntimeException("ERRO: Id nulo.");
            }else{
                for (int i=0;i<ctx.expressao(0).depth();i++){
                    conteudo_expr_0=ctx.expressao(0).getText().split("\\(|\\)|\\+|\\-|\\/|\\*"); 
                }
                
                for (int i=0;i<ctx.expressao(1).depth();i++){
                    conteudo_expr_1=ctx.expressao(1).getText().split("\\(|\\)|\\+|\\-|\\/|\\*"); 
                }
                ArrayList tipos_de_dados_0=percorrerPrimeiraComparacao(conteudo_expr_0);
                ArrayList tipos_de_dados_1=percorrerSegundaComparacao(conteudo_expr_1);
                checarTipoDadosComparacoes(tipos_de_dados_0,tipos_de_dados_1);
                
            }
            this.controle_tipo="if";
            System.out.print(CaminharEspacos("if")+"if");
        
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
    
    }
    @Override 
    public void enterCmdPara(atribuicaoParser.CmdParaContext ctx) { 
        String [] conteudo_expr=null;
        //cmdPara: 'para' leftParen tipo id operadorAtri numero fim id (compIgual|compMaior|compMenor|compMeIgual|compMaIgual|compDifer) numero fim expr rightParen leftChave cmd+ rightChave;
        
        boolean numero_atribuido=checarConteudoInteiro(ctx.numero(0).getText());
        boolean numero_comparativo=checarConteudoInteiro(ctx.numero(1).getText());
        
        //Verifica????o se os dois numeros enviados s??o inteiros
        if ((numero_atribuido==false) ||(numero_comparativo==false)){
            //System.out.println("System.out.println("+"\""+"ERRO: Algum dos numeros digitados nao correspondem com numeros inteiros. "+numero_atribuido+numero_comparativo+"\""+");");
            throw new RuntimeException("ERRO: Algum dos numeros digitados nao correspondem com numeros inteiros. "+numero_atribuido+numero_comparativo);
        }
        
        //Verifica????o se existe ou n??o o Id enviado e se o tipo de dado informado est?? correto
        if ((VariavelDeclarada(ctx.id(0).getText())==false) &&("inteiro".equals(ctx.tipo().getText()))){
            DeclararVariavel(ctx.id(0).getText(),ctx.tipo().getText(),false);
        }else{
            String tipo=this.variaveis_declaradas.get(ctx.id(0).getText()).toString();
            if (!"inteiro".equals(tipo)){
                throw new RuntimeException("ERRO: Voc?? est?? tentando sobrescrever uma variavel com o tipo diferente de inteiro. Tipo encontrado -> "+tipo);
                //System.out.println("System.out.println("+"\""+"ERRO: Voc?? est?? tentando sobrescrever uma variavel com o tipo diferente de inteiro. Tipo encontrado -> "+tipo+"\""+");");
            }
        }
        
        //Verificar se os IDs enviados s??o os mesmos.
        if(!ctx.id(0).getText().equals(ctx.id(1).getText())){
            throw new RuntimeException("ERRO:a variavel que voce esta indicando como o contador difere da declarada. Variavel esperada ->"+ctx.id(0).getText()+", variavel encontrada -> "+ctx.id(1).getText());
            //System.out.println("System.out.println("+"\""+"ERRO:a variavel que voce esta indicando como o contador difere da declarada. Variavel esperada ->"+ctx.id(0).getText()+"\""+"\""+", variavel encontrada -> "+ctx.id(1).getText()+"\""+");");

        }
         
        //Verificacao do contador
        String contador_atribuicao=ctx.expr().id().getText();
        if (!contador_atribuicao.equals(ctx.id(0).getText())){
            throw new RuntimeException("ERRO:a variavel que voce esta indicando como o contador difere da declarada. Variavel esperada ->"+ctx.id(0).getText()+", variavel encontrada -> "+contador_atribuicao+");");
            //System.out.println("System.out.println("+"\""+"ERRO:a variavel que voce esta indicando como o contador difere da declarada. Variavel esperada ->"+ctx.id(0).getText()+"\""+"\""+", variavel encontrada -> "+contador_atribuicao+"\""+");");
        }else{
            for (int i=0;i<ctx.expr().depth();i++){
                conteudo_expr=ctx.expr().expressao().getText().split("\\(|\\)|\\+|\\-|\\/|\\*"); 
            }
            int tamanho_expressao = conteudo_expr.length;
            if (tamanho_expressao>2){
                throw new RuntimeException("ERRO: A express??o aceita 2 parametros. Tamanho encontrado:  "+tamanho_expressao);
                //System.out.println("System.out.println("+"\""+"ERRO: A express??o aceita 2 parametros. Tamanho encontrado:  "+tamanho_expressao+"\""+");");
            }else{
                for (int i=0;i<conteudo_expr.length;i++){
                    if (checarConteudoPalavra(conteudo_expr[i])==true){
                        throw new RuntimeException("ERRO: Nao pode passar uma string para o contador ->  "+conteudo_expr[i]);
                        //System.out.println("System.out.println("+"\""+"ERRO: Nao pode passar uma string para o contador ->  "+conteudo_expr[i]+"\""+");");
                    }else if (isDigit(conteudo_expr[i])==true && checarConteudoInteiro(conteudo_expr[i]) !=true ){
                        throw new RuntimeException("ERRO:a variavel que voce esta tentando jogar na atribuicao nao ?? do tipo inteiro -> "+conteudo_expr[i]);
                        //System.out.println("System.out.println("+"\""+"ERRO:a variavel que voce esta tentando jogar na atribuicao nao ?? do tipo inteiro -> "+conteudo_expr[i]+"\""+");");
                    }else {
                        Boolean houve_erro=Checar_Var_Com_Multiplos_Conteudos(contador_atribuicao,conteudo_expr[i],"inteiro", true);
                        if(houve_erro==true){
                            //System.exit(0);
                        }
                    }
                }                    
            }  
        }
        this.controle_tipo="for";
        //AumentarControleDicionario(this.controle_tipo);
        System.out.println(CaminharEspacos("for")+"for");
    }    
                

    @Override 
    public void enterCmdImprime(atribuicaoParser.CmdImprimeContext ctx) { 
        if (ctx.id()!=null){
                boolean var=VariavelDeclarada(ctx.id().getText());
                if (var==false){
                    throw new RuntimeException("Voc?? est?? tentando imprimir uma variavel que nao existe ->  "+ctx.id().getText());
                   //System.out.println("System.out.println("+"\""+"Voc?? est?? tentando imprimir uma variavel que nao existe ->  "+ctx.id().getText()+"\""+");");
               }
            }
        System.out.print("      System.out.println");
    }
    
    @Override
    public void enterTipo(atribuicaoParser.TipoContext ctx) {
        String tipo = ctx.getText();
        switch(tipo){
          case "booleano":
              System.out.print("      boolean ");
              this.controle_tipo="Boolean";
              break;
  
          case "inteiro":
              System.out.print("      int ");
              this.controle_tipo="int";
              break;
          
          case "flutuante":
              System.out.print("      double ");
              this.controle_tipo="double";
              break;
          
          case "palavra":
              System.out.print("      String ");
              this.controle_tipo="String";
              break;
          default:  
           //System.out.println("System.out.println("+"\""+"ERRO: O tipo de variavel difere de um tipo valido -> "+tipo+"\""+");");
              throw new RuntimeException("ERRO: O tipo de variavel difere de um tipo valido -> "+tipo);
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
    public void enterComplementoLeia(atribuicaoParser.ComplementoLeiaContext ctx) { 
       String tipo=this.aux_tipo_scanner;
       if (null != tipo)switch (tipo) {
            case "inteiro":
                System.out.print(" = scanner.nextInt()");
                break;
            case "flutuante":
                System.out.print(" = scanner.nextDouble()");
                break;
            case "palavra":
                System.out.print(" = scanner.nextLine()"); 
                break;
            case "booleano":
                System.out.print(" = scanner.nextBoolean()");
                break;
            default:
                break;
        }
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
    
    public void enterCmdDeclara(atribuicaoParser.CmdDeclaraContext ctx) {
        if (ctx.id()!=null){
            if (VariavelDeclarada(ctx.id().getText())==true){
                //System.out.println("System.out.println("+"\""+"ERRO: O nome da variavel informada ja existe. ->"+ctx.id().getText()+"\""+");");
                 throw new RuntimeException("ERRO: O nome da variavel informada ja existe. ->"+ctx.id().getText()); 
            }else{
                DeclararVariavel(ctx.id().getText(),ctx.tipo().getText(),false);
            }
        }
    }
        
    
     
    @Override 
    public void enterCmdAtribui(atribuicaoParser.CmdAtribuiContext ctx){
     
       if (ctx.tipo() == null){
            if (VariavelDeclarada(ctx.expr().id().getText())==false){
                //System.out.println("System.out.println("+"\""+"ERRO: Voce esta tentando atribuir valor a uma variavel que nao foi declarada -> "+ctx.expr().id().getText()+"\""+");");
                throw new RuntimeException("ERRO: Voce esta tentando atribuir valor a uma variavel que nao foi declarada -> "+ctx.expr().id().getText());
            }
           ChecarTipodeDados(ctx,true); 
       }else{
            if (VariavelDeclarada(ctx.id(0).getText())==false){
               ChecarTipodeDados(ctx,false);
            }else{
                throw new RuntimeException("ERRO: O nome da variavel informada ja existe ->"+ctx.id(0).getText());
                //System.out.println("System.out.println("+"\""+"ERRO: O nome da variavel informada ja existe ->"+ctx.id(0).getText()+"\""+");");
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