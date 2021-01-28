import java.util.*;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> LL1 = new LinkedList<Integer>();
        while (true) {
            System.out.print("Enter a number, or enter \'q\' to stop: ");
            try {
                Integer i = new Integer(sc.next());
                if (LL1.contains(i)) {
                    System.out.println("LL1 already containts " + i);
                } else
                    LL1.add(i);
            } catch (NumberFormatException e) {
                break;
            }
        }
        System.out.println(LL1);
    }
}
