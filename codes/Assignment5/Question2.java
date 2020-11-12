public class Question2 {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.show();
        Outer.Inner i = new Outer().new Inner();
        i.show();
    }
}

class Outer {
    int outerVal = 2;

    void show() {
        System.out.printf("[OT] Outer Class Value: %d%n", outerVal);
        System.out.printf("Inner Class Static Value: %d%n", Inner.innerValStatic);
        System.out.printf("Inner Class Instance Value: %d%n", new Inner().innerValInstance);
    }

    class Inner {
        static final int innerValStatic = 3;
        int innerValInstance = 1;

        void show() {
            System.out.printf("[IN] Inner Class Value: %d%nOuter Class Value: %d%n", innerValStatic, outerVal);
        }
    }
}
