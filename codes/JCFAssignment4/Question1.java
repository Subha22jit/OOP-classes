import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        LinkedList<Integer> LL = new LinkedList<>(Arrays.asList(new Integer[] { 21, 23, 34, 49, 65 }));
        for (int i = LL.size() - 1; i >= 0; i--) {
            System.out.printf("%d - %d%n", i, LL.get(i));
        }
    }
}
