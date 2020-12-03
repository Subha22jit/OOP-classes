public class Question1 {
    public static void main(String[] args) {
        int a;
        try{
            //Some Arith Expr
            a=5/0;
        }
        catch(ArithmeticException e){
            System.out.printf("ERROR in : Line %s, %s:%s",e.getStackTrace()[0].getLineNumber(),e.getStackTrace()[0].getClassName(),e.getStackTrace()[0].getMethodName());
        }
    }
}
