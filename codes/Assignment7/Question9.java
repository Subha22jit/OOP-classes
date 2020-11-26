import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next() + sc.nextLine();
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(str.substring(n - 1, n + m));
    }
}
