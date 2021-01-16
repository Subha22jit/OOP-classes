import java.util.*;

public class Question1234 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        for (String s2 : args)
            a.add(Integer.parseInt(s2));
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        System.out.println(sum);
        Collections.sort(a);
        System.out.println(a);
        Collections.sort(a, Collections.reverseOrder());
        System.out.println(a);
        Collections.shuffle(a);
        System.out.println(a);
    }
}