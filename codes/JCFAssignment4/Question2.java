import java.util.*;

public class Question2 {
    public static void main(String[] args) {
        LinkedList<Integer> LL = new LinkedList<>(Arrays.asList(new Integer[] { 21, 23, 34, 49, 65 }));
        System.out.println(LL);
        LL.addLast(LL.get(2));
        LL.remove(2);
        System.out.println(LL);
    }
}
