public class Question3 {
    public static void main(String[] args) {
        int a[];
        try {
            a = new int[-1];
        } catch (NegativeArraySizeException e) {
            System.out.printf("Negative size in : Line %s, %s:%s", e.getStackTrace()[0].getLineNumber(),
                    e.getStackTrace()[0].getClassName(), e.getStackTrace()[0].getMethodName());
        }
    }
}
