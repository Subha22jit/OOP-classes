public class ShowMe {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please supply question number! ");
            return;
        }
        if (Integer.parseInt(args[0]) == 6) {
            Master m1 = new Master();
            m1.show();
            m1 = new Slave1();
            m1.show();
            m1 = new Slave2();
            m1.show();
            m1 = new Slave3();
            m1.show();
        } else if (Integer.parseInt(args[0]) == 5) {
            Master m1 = new Master();
            Slave1 s1 = new Slave1();
            Slave2 s2 = new Slave2();
            Slave3 s3 = new Slave3();
            m1.show();
            s1.show();
            s2.show();
            s3.show();
        } else
            System.out.println("Use 5 for Question 5 or 6 for Question 6.");
    }

}

class Master {
    void show() {
        System.out.println("Showing from Master " + this.getClass().getSimpleName());
    }
}

class Slave1 extends Master {
    void show() {
        System.out.println("Showing from Slave #1 " + this.getClass().getSimpleName());
    }
}

class Slave2 extends Master {
    void show() {
        System.out.println("Showing from Slave #2 " + this.getClass().getSimpleName());
    }
}

class Slave3 extends Master {
    void show() {
        System.out.println("Showing from Slave #3 " + this.getClass().getSimpleName());
    }
}