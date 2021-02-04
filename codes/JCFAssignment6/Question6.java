import java.util.*;

public class Question6 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Hello", 1);
        hm.put("World", 2);
        hm.put("New", 2);
        System.out.println(hm.get("Hello"));
        System.out.println(hm.get("Cello"));
    }
}