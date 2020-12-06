import java.util.Scanner;
import java.util.Arrays;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first_name = sc.next() + sc.nextLine();
        String middle_name = sc.nextLine();
        if (middle_name.length() <= 0)
            middle_name = "\0";
        String last_name = sc.next() + sc.nextLine();
        if (!sc.hasNextLong()) {
            sc.nextLine();
        }
        // long roll_numer = sc.nextLong();
        String roll_number2 = sc.next() + sc.nextLine();
        // System.out.printf("%s%s%s%d%n", first_name.charAt(0), middle_name.charAt(0), last_name.charAt(0),
        //         (roll_numer % 10000));
        System.out.printf("%s%s%s%s%n", first_name.charAt(0), middle_name.charAt(0), last_name.charAt(0),
                (roll_number2.substring(roll_number2.length() - 4)));
    }
}
