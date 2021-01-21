import java.util.*;

public class Question8 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(new Integer[] { 10, 20, 30, 40 }));
        System.out.println(al);
        al.set(1, (al.get(1) + al.get(3)));
        System.out.println(al);
    }
}
