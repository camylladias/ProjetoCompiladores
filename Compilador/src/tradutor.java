public class tradutor  extends atribuicaoBaseListener{
    
    @Override 
    public void enterCmd(atribuicaoParser.CmdContext ctx) { 
        if(ctx.cmdLeia()!= null){
            System.out.println("import java.util.Scanner;");
        }
        System.out.println("public class Code{");
        System.out.println("    public static void main(String[] args){");  
    }
    

    
    @Override 
    public void exitCmd(atribuicaoParser.CmdContext ctx) { 
        System.out.println("\n  }");
        System.out.println("\n}");   
    }

    public void exitCmdLeia(atribuicaoBaseListener.CmdLeiaContext ctx){
        System.out.println("= scanner.next();\n ");
    }
    
    @Override 
    public void enterCmdLeia(atribuicaoParser.CmdLeiaContext ctx) { 
        System.out.println("      Scanner scanner = new Scanner(System.in);");
        System.out.print("      String ");
        exitCmdLeia();
        ctx.id();   
    }
    

    @Override 
    public void enterCmdImprime(atribuicaoParser.CmdImprimeContext ctx) { 
        System.out.print("      System.out.print");
    }
    
    
    @Override
    public void enterTipo(atribuicaoParser.TipoContext ctx) {
        String tipo = ctx.getText();

        switch(tipo){

          case "booleano":
            System.out.print("      Boolean ");
            break;
          case "inteiro":
            System.out.print("      int ");
            break;

          case "flutuante":
            System.out.print("      double ");
            break;

          case "palavra":
            System.out.print("      String ");
            break;
        }
  }
    
    @Override
    public void enterOperadorMat(atribuicaoParser.OperadorMatContext ctx) { 
        String mat =ctx.getText();
        
        switch(mat){
            case "+":
                System.out.print("+ ");
                break;
            case "-":
                System.out.print("- ");
            case "*":
                System.out.print("* ");
            case "/":
                System.out.print("/ ");
        }
        
    }
    
    @Override 
    public void enterOperadorAtri(atribuicaoParser.OperadorAtriContext ctx) { 
        System.out.print(" = ");
    }
    
    @Override
    public void exitFim(atribuicaoParser.FimContext ctx){
        System.out.print("; ");
    }
    
    @Override 
    public void enterComparador(atribuicaoParser.ComparadorContext ctx) { 
        String com = ctx.getText();
        
        switch(com){
            case "==":
                System.out.print(" == ");
                break;
            case "<":
                System.out.print(" < ");
                break;
            case ">":
                System.out.print(" > ");
                break;
            case "<=":
                System.out.print(" <= ");
                break;
            case ">=":
                System.out.print(" >= ");
                break;
            case "!=":
                System.out.print(" != ");
                break;
        }        
    }
    
    @Override 
    public void enterNumero(atribuicaoParser.NumeroContext ctx) { 
        System.out.print(ctx.NUM().getText());
    }
    
    @Override 
    public void enterId(atribuicaoParser.IdContext ctx) { 
        System.out.print(ctx.ID().getText());
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
    public void enterExpressao(atribuicaoParser.ExpressaoContext ctx) {
        System.out.print(ctx.termo().getText()+ ctx.expreLinha().getText());

    }
    
    /*@Override 
    public void enterTermo(atribuicaoParser.TermoContext ctx) { 
        System.out.print(ctx.fator().getText()+ ctx.termoLinha().getText());
    }*/
    
    /*@Override 
    public void enterExpreLinha(atribuicaoParser.ExpreLinhaContext ctx) {
        System.out.println(" + "+ctx.termo().getText()+ctx.expreLinha().getText());  
    }*/
}
