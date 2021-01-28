import java.util.*;

public class Question5 {
    public static void main(String[] args) {
        HashSet<Integer> HS1 = new HashSet<>();
        HS1.add(10);
        HS1.add(20);
        HS1.add(30);
        HS1.removeIf(n -> (n > 25));
        System.out.println(HS1);
    }
}