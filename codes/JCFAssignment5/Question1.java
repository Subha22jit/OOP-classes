import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        HashSet<Integer> HS = new HashSet<>();
        HS.add(10);
        HS.add(20);
        HS.add(30);
        System.out.println(HS.contains(10));
        System.out.println(HS.contains(1));
    }
}