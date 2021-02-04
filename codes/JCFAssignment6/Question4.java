import java.util.*;

public class Question4 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Hello", 1);
        hm.put("World", 2);
        hm.put("New", 2);
        System.out.println(hm.keySet().contains("Hello"));
        System.out.println(hm.keySet().contains("Cello"));
    }
}