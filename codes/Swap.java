public class Swap {
    static void swapIt(Integer a, Integer b){
        a.parseInt("1212");
        b.parseInt("13141");
    }
    public static void main(String[] args) {
        Integer a = Integer.parseInt(args[0]);
        Integer b = Integer.parseInt(args[1]);
        System.out.printf("Before Swap:\n a=%d, b=%d\n",a,b);
        swapIt(a,b);
        System.out.printf("After Swap:\n a=%d, b=%d\n",a,b);
    }
}
