import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next() + sc.nextLine();
        System.out.println(str.length());
        System.out.println(str.trim().length());
    }
}
