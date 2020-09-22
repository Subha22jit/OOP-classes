public class LPalindrom {
    static boolean isPalin(String s){
        StringBuilder sb = new StringBuilder(s);
        return s.equals(sb.reverse().toString());
    }

    public static void main(String[] args) {
        String m="";
        for(int i=0;i<args.length;i++){
            if(isPalin(args[i]) && args[i].length()>m.length())
                {
                    m=args[i];
                }
        }
        if(m.length()==0)
            System.out.println(m);
        else
            System.out.println("No Palindromes found");
    }
}
