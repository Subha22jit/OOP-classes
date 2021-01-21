import java.util.*;

public class Question2 {
    public static void main(String[] args) {
        LinkedList<Integer> LL = new LinkedList<>();
        LL.add(1);
        LL.add(2);
        LL.add(3);
        LL.add(4);
        LL.add(5);
        System.out.println(LL);
        LL.removeFirst();
        System.out.println(LL);
        LL.removeLast();
        System.out.println(LL);
        LL.remove(1);
        System.out.println(LL);
    }
}
