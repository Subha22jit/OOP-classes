import java.util.*;

public class Question2 {
    public static void main(String[] args) {
        LinkedList<Integer> LL = new LinkedList<>(Arrays.asList(new Integer[] { 1, 2, 3, 4, 5 }));
        System.out.println(LL);
        LL.removeFirst();
        System.out.println(LL);
        LL.removeLast();
        System.out.println(LL);
        LL.remove(1);
        System.out.println(LL);
    }
}
