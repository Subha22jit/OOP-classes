import java.util.Scanner;

public class Question10 {
    static String deleteMe(String str, int m) {
        char c2[] = new char[str.length()-1];
        int add=0;
        for(int i=0;i<str.length();i++){
            if(i!=m){
                c2[i-add]=str.charAt(i);
            }
            else{
                add++;
            }
        }
        return new String(c2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next() + sc.nextLine();
        int m = sc.nextInt();
        System.out.println(str.length());
        str = deleteMe(str, m - 1);
        System.out.println(str.length());
        System.out.println(str);
    }
}
