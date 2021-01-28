import java.util.*;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> LL1 = new LinkedList<Integer>();
        while (true) {
            System.out.print("[FIRST] Enter a number, or enter \'q\' to stop: ");
            try {
                LL1.add(Integer.parseInt(sc.next()));
            } catch (NumberFormatException e) {
                break;
            }
        }

        LinkedList<Integer> LL2 = new LinkedList<Integer>();
        while (true) {
            System.out.print("[SECOND] Enter a number, or enter \'q\' to stop: ");
            try {
                LL2.add(Integer.parseInt(sc.next()));
            } catch (NumberFormatException e) {
                break;
            }
        }
        // for (Integer i : LL2) {
        // // System.out.println(i + " is contained in LL1: " + LL1.contains(i));
        // if (!LL1.contains(i))
        // LL1.add(i);
        // }
        LL1.addAll(LL2);
        System.out.println(LL1);
    }
}
