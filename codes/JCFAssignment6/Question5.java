import java.util.*;

public class Question5 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Hello", 1);
        hm.put("World", 2);
        hm.put("New", 2);
        System.out.println(hm.values().contains(1));
        System.out.println(hm.values().contains(3));
    }
}