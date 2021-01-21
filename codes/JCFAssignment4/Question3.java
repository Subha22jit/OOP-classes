import java.util.*;

public class Question3 {
    public static void main(String[] args) {
        LinkedList<Integer> LL = new LinkedList<>(Arrays.asList(new Integer[] { 21, 232, 34, 94, 5 }));
        System.out.println(LL);
        LL.sort(null);
        System.out.println(LL);
    }
}
