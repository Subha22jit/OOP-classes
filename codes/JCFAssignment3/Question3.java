import java.util.*;

public class Question3 {
    public static void main(String[] args) {
        LinkedList<Integer> LL = new LinkedList<>(Arrays.asList(new Integer[] { 1, 2, 3, 4, 5 }));
        System.out.println(LL);
        System.out.println(LL.getFirst());
        System.out.println(LL.get(2));
        System.out.println(LL.getLast());
    }
}
