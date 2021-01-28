import java.util.*;

public class Question9 {
    public static void main(String[] args) {
        HashSet<Integer> HS = new HashSet<>();
        HS.add(10);
        HS.add(20);
        HS.add(30);
        System.out.println(HS);
        ArrayList<Integer> list = new ArrayList<Integer>(HS);
        System.out.println(list);
    }
}