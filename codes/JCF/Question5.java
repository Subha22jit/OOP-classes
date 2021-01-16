import java.util.*;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyCustomList a = new MyCustomList();
        for (String s2 : args)
            a.add(Integer.parseInt(s2));
        System.out.print("Enter the index: ");
        int i = sc.nextInt();
        try {
            System.out.println(a.getval(i));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

class MyCustomList extends ArrayList<Integer> {
    ArrayList<Integer> ar;

    MyCustomList() {
        ar = new ArrayList<>();
    }

    void add(int a) {
        this.ar.add(a);
    }

    int getval(int index) throws BoddoBeshiBenrePakaException {
        if (index < 0 || index > (this.ar.size() - 1))
            throw new BoddoBeshiBenrePakaException();
        else
            return this.ar.get(index);
    }
}

class BoddoBeshiBenrePakaException extends Exception {

}