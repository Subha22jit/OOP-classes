package codes;

public class CallByValue {
    static void call(int a) {
        System.out.println("CALL PRE:" + a);
        a++;
        System.out.println("CALL POST:" + a);
    }

    public static void main(String[] args) {
        int a = 1;
        System.out.println("ROOT PRE:" + a);
        call(a);
        System.out.println("ROOT POST:" + a);
    }
}
