import java.util.*;

public class Question4 {
    public static void main(String[] args) {
        LinkedList<Integer> LL = new LinkedList<>();
        LL.add(1);
        LL.add(2);
        LL.add(3);
        LL.add(4);
        LL.add(5);
        System.out.println(LL);
        Integer ar[] = new Integer[5];
        LL.toArray(ar); 
        int startingIndex = 2;
        for (int i = startingIndex; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
        for (ListIterator LI = LL.listIterator(startingIndex); LI.hasNext();) {
            System.out.println(LI.next());
        }
    }
}
