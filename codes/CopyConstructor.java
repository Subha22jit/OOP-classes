package codes;

public class CopyConstructor {
    int a;

    CopyConstructor(int a) {
        this.a = a;
    }

    CopyConstructor(CopyConstructor c) {
        this.a = c.a;
    }

    public static void main(String[] args) {
        CopyConstructor cc1 = new CopyConstructor(21);
        CopyConstructor cc2 = new CopyConstructor(cc1);
        System.out.println("CC1: " + cc1.a + " Details: " + cc1);
        System.out.println("CC2: " + cc2.a + " Details: " + cc2);
    }
}
