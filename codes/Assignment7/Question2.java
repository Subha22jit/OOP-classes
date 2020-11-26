import java.util.Scanner;
import java.util.Arrays;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c[] = new char[5];
        for (int i = 0; i < c.length; i++)
            c[i] = sc.next().charAt(0);
        String str = sc.next() + sc.nextLine();
        System.out.printf("Before:%nSTR=%s%nC[]=%s%n", str, Arrays.toString(c));
        char c2[] = new char[5 + str.length()];
        int i = 0;
        for (char ch : c)
            c2[i++] = ch;
        for (char ch : str.toCharArray())
            c2[i++] = ch;
        c = c2;
        System.out.printf("After:%nSTR=%s%nC[]=%s%n", str, Arrays.toString(c));

    }
}
