import java.util.Scanner;
import java.util.Arrays;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next() + sc.nextLine();
        char c[] = st.toCharArray();
        Arrays.sort(c);
        System.out.println(c);
    }
}
