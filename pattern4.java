/*

1
2*3
4*5*6
7*8*9*10
7*8*9*10
4*5*6
2*3
1

*/


public class pattern4 {
    public static void main(String[] args) {
        int n= Integer.parseInt(args[0]);
        int count = 1;
        for(int i=1;i<=n;i++){
            String op = "";
            for(int j=1;j<=i;j++){
                op = op + String.valueOf(count++) + "*";
            }
            System.out.println(op.substring(0,op.length()-1));
        }
        for(int i=n; i>=1;i--){
            String op = "";
            for(int j=i;j>=1;j--){
                op = op + String.valueOf(count-j) + "*";
            }
            System.out.println(op.substring(0, op.length()-1));
            count = count - i;
        }
    }
}
