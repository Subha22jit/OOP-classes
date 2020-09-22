public class GCDLCM {
    public static void main(String[] args) {
        System.out.println("GCD: "+gcd(Integer.parseInt(args[0]),Integer.parseInt(args[1])));
        System.out.println("LCM: "+lcm(Integer.parseInt(args[0]),Integer.parseInt(args[1])));
    }

    static int gcd(int a, int b){
        if(b!=0)
            return gcd(b,a%b);
        return a;
    }
    
    static int lcm(int a, int b){
        return (a*b)/gcd(a,b);
    }
}
