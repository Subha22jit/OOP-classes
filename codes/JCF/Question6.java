import java.util.*;

public class Question6 {
    public static void main(String[] args) throws Exception {
        if (args.length != 5)
            throw new CartErModdhe5TaItemLagbe();
        else {
            ArrayList<String> as = new ArrayList<>(Arrays.asList(args));
            System.out.println(as);
        }
    }
}

class CartErModdhe5TaItemLagbe extends Exception {

}