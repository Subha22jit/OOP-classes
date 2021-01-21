import java.util.*;

public class Question9 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(new Integer[] { 10, 20, 30, 40 }));
        System.out.println(al);
        al.add(al.get(2));
        al.remove(2);
        System.out.println(al);
    }
}
