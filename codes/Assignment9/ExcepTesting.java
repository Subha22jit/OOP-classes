
public class ExcepTesting {
    public static void main(String[] args) {
        try {
            throw getexcp();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static CustomExcp getexcp() {
        return new CustomExcp();
    }
}

class CustomExcp extends Exception {

}