public class RefCheck {
    static void rev(StringBuffer b){
        b.reverse();
    }

    public static void main(String[] args) {
        StringBuffer b = new StringBuffer("Hello");
        rev(b);
        System.out.println(b);
    }
}
