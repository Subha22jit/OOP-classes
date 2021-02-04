import java.util.*;

public class Question3 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        HashMap<String, Integer> hm2 = new HashMap<>();
        hm.put("Hello", 1);
        hm.put("World", 2);
        hm.put("New", 2);
        hm.put("New2", 2);
        hm.forEach((String k, Integer v) -> {
            if (hm2.values().contains(v)) {
                Integer in = v;
                while (hm2.values().contains(in)) {
                    in = in * 2;
                }
                hm2.put(k, in);
            } else
                hm2.put(k, v);
        });
        System.out.println("OLD: " + hm);
        System.out.println("NEW: " + hm2);
    }
}