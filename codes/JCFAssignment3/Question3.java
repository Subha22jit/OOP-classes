import java.util.*;

public class Question3 {
    public static void main(String[] args) {
        LinkedList<Integer> LL = new LinkedList<>();
        LL.add(1);
        LL.add(2);
        LL.add(3);
        LL.add(4);
        LL.add(5);
        System.out.println(LL);
        System.out.println(LL.getFirst());
        System.out.println(LL.get(2));
        System.out.println(LL.getLast());
    }
}
