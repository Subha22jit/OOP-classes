public class AbsClass extends Parent {
    void show1() {
        System.out.println("Modified Show 1");
    }

    void show2() {
        System.out.println("Modified Show 2");
    }

    public static void main(String[] args) {
        AbsClass abc = new AbsClass();
        abc.show1();
        abc.show2();
        abc.show3();
    }
}

abstract class Parent {
    abstract void show1();

    abstract void show2();

    void show3() {
        System.out.println("Original Show 3");
    }
}