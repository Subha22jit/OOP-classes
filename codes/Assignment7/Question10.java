import java.util.Scanner;

public class Question10 {
    static String deleteMe(String str, int m) {
        char c[] = str.toCharArray();
        c[m] = '\0';
        return new String(c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next() + sc.nextLine();
        int m = sc.nextInt();
        str = deleteMe(str, m - 1);
        System.out.println(str);
    }
}
