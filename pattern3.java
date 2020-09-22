/*

> java pattern3 5    
A 
A B A
A B C B A
A B C D C B A
A B C D E D C B A
*/


public class pattern3 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for(int i=0;i<n;i++){
            char c = 'A'-1;
            int j=0;
            for(;j<=i;j++){
                c++;
                System.out.print(c+" ");
            }
            c--;
            for(;c>='A';c--){
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}
