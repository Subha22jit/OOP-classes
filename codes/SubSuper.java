class SubSuper2 extends SuperSub {

    void show() {
        System.out.println("This is child class");
    }

    void showSuper() {
        super.show();
    }

    public static void main(String[] args) {
        SubSuper2 sub = new SubSuper2();
        sub.show();
        sub.showSuper();
        SuperSub superC = new SuperSub();
        superC.show();
        main(1);
    }

    public static void main(int i) {
        System.out.println("Overloaded started");
    }

}

class SuperSub {
    void show() {
        System.out.println("This is parent class");
    }
}