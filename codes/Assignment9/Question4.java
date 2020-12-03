public class Question4 {
    public static void main(String[] args) {
        StringBuffer sb = null;
        try {
            sb.reverse();
        } catch (NullPointerException e) {
            System.out.printf("NullPointerException in : Line %s, %s:%s", e.getStackTrace()[0].getLineNumber(),
                    e.getStackTrace()[0].getClassName(), e.getStackTrace()[0].getMethodName());
        }
    }
}
