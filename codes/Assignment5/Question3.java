public class Question3 {
    public static void main(String[] args) {
        WorkingClass wc = new WorkingClass();
        wc.show1();
        wc.show2();
        wc.show3(1000);
        wc.show4();
        wc.showConcOut();
    }
}

interface Inner1 {
    void show1();

    void show2();
}

interface Inner2 {
    void show3(int a);

    void show4();
}

interface OuterInt extends Inner1, Inner2 {

}

class ConcreteOuter {
    int val = 10;

    void showConcOut() {
        System.out.println("Concrete Outer Class here");
    }
}

class WorkingClass extends ConcreteOuter implements OuterInt {
    public void show1() {
        System.out.println("Showing 1");
    }

    public void show2() {
        System.out.println("Showing 2");
    }

    public void show3(int a) {
        System.out.printf("Showing 3 %d%n", a);
    }

    public void show4() {
        System.out.println("Showing 4");
    }
}