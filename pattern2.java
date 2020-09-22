/*
>java pattern2 6    
1111112
3222222
3333334
5444444
5555556
7666666
*/


public class pattern2 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for(int i=1;i<=n;i++){
            String s="";
            if(i%2!=0){
                for(int j=0;j<n;j++)
                    s=s+String.valueOf(i);
                s=s+String.valueOf(i+1);
            }  
            else{
                s=s+String.valueOf(i+1);
                for(int j=0;j<n;j++)
                    s=s+String.valueOf(i);

            }
            System.out.println(s);
        }
    }
}
