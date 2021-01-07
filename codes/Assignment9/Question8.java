public class Question8 {
    public static void main(String[] args) {
        String str = null;
        int start = 0;
        int end = 0;
        StringBuffer sb = null;
        try {
            str = args[0];
            start = Integer.parseInt(args[1]);
            end = Integer.parseInt(args[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.printf("Input Format: java .\\%s <string> <start> <end>%n", Question8.class.getSimpleName());
            System.exit(0);
        }

        try {
            sb = new StringBuffer(str.substring(start - 1, end));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Indices are wrong, please fix");
            System.exit(0);
        }
        System.out.println(sb.reverse());
    }
}