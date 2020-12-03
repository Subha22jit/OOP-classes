public class Question5 {
    public static void main(String[] args) {
        try {
            System.out.println("THROWING EXCEPTION");
            throw new Exception("NO DESCRIPTION");
        } catch (Exception e) {
            System.out.printf("ERROR in : Line %s, %s:%s%n", e.getStackTrace()[0].getLineNumber(),
                    e.getStackTrace()[0].getClassName(), e.getStackTrace()[0].getMethodName());
            System.out.println(e);
        }
        System.exit(1);
    }
}
