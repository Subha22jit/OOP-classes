import java.util.*;

public class Question4 {
    public static void main(String[] args) {
        HashSet<Integer> HS1 = new HashSet<>();
        HashSet<Integer> HS2 = new HashSet<>();
        HS1.add(10);
        HS1.add(20);
        HS1.add(30);
        HS2.add(10);
        HS2.add(20);
        HS1.removeIf(n -> (!HS2.contains(n)));
        System.out.println(HS1);
    }
}