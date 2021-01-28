import java.util.*;

public class Question2 {
    public static void main(String[] args) {
        HashSet<Integer> HS = new HashSet<>();
        HS.add(10);
        HS.add(20);
        HS.add(30);
        System.out.println(HS);
        ArrayList<Integer> list = new ArrayList<Integer>(HS);
        Collections.sort(list);
        System.out.println(list);
    }
}