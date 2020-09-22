/*
>java pattern 5     
1
3*2
4*5*6
10*9*8*7
11*12*13*14*15

*/

public class pattern {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        String temp="";
        int count = 1;
        for(int i=0;i<n;i++){
            boolean b=false;
            if(i%2==0)
                for(int j=0;j<=i;j++){
                    temp=temp+""+(count++)+"*";
                    b=false;}
            else
                for(int j=i;j>=0;j--){
                    temp=temp+""+(count+j)+"*";
                    b=true;}
            if(b)
                count=count+i+1;
            temp=temp.substring(0,temp.length()-1)+"\n";
        }
        System.out.println(temp);
    }
}
