package codes;

// JAVA DOESN"T SUPPORT CALL BY REFERENCE,
// WHAT IS PASSED HERE IS A COPY OF THE REFERENCE TO THE OBJECT

public class CallByReference {
    static void rev(StringBuffer b){
        System.out.println("REV PRE: "+b);
        b.reverse();
        System.out.println("REV POST: "+b);
    }
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("ROOT PRE: "+sb);
        rev(sb);
        System.out.println("ROOT POST: "+sb);
    }
}
