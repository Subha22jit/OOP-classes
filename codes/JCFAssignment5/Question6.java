import java.util.*;

public class Question6 {
    public static void main(String[] args) {
        HashSet<Integer> HS1 = new HashSet<>();
        HashSet<Integer> HS2 = new HashSet<>();
        HashSet<Integer> HS3 = new HashSet<>();
        HS1.add(10);
        HS1.add(20);
        HS1.add(30);
        HS2.add(10);
        HS2.add(20);
        HS3.add(10);
        HS3.add(20);
        HS3.add(30);
        System.out.println(HS1.equals(HS2));
        System.out.println(HS1.equals(HS3));
    }
}