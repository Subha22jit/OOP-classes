public class Question2 {
    public static void main(String[] args) {
        int arr[] = { 1, 2 };
        String str = "hello blyat";
        try {
            System.out.println(str.charAt(90));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.printf("String Index out of Bound in : Line %s, %s:%s%n", e.getStackTrace()[0].getLineNumber(),
                    e.getStackTrace()[0].getClassName(), e.getStackTrace()[0].getMethodName());

            try {
                System.out.println(arr[4]);
            } catch (ArrayIndexOutOfBoundsException e2) {
                System.out.printf("Array Index out of Bound in : Line %s, %s:%s%n",
                        e2.getStackTrace()[0].getLineNumber(), e2.getStackTrace()[0].getClassName(),
                        e2.getStackTrace()[0].getMethodName());
            }
        } catch (Exception e) {
            System.out.printf("ERROR in : Line %s, %s:%s%n", e.getStackTrace()[0].getLineNumber(),
                    e.getStackTrace()[0].getClassName(), e.getStackTrace()[0].getMethodName());
        }
    }
}
