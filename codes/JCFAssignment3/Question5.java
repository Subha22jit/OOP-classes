import java.util.*;

public class Question5 {
    public static void main(String[] args) {
        LinkedList<Integer> LL = new LinkedList<>(Arrays.asList(new Integer[] { 1, 2, 3, 4, 5 }));
        System.out.println(LL);
        Integer ar[] = new Integer[5];
        LL.toArray(ar);
        int startingIndex = 2;
        for (int i = startingIndex; i < ar.length; i++) {
            System.out.println(ar[ar.length - i - 1]);
        }
    }
}