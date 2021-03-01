import java.util.*;

public class tester {
    public static void main(String[] args) throws InterruptedException { // Using Generics
        Thread t = new Thread();
        t.start();
        System.out.println("X");
        t.wait(1000);
        System.out.println("Y");
    }

}
