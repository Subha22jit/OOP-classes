import java.util.*;

public class Question2 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Hello", 1);
        hm.put("World", 2);
        hm.put("New", 2);
        System.out.println("Keys: " + hm.keySet().size());
        System.out.println("Values: " + new HashSet(hm.values()).size());
    }
}