
public class Series{
    public static void main(String[] args) {
        int i = Integer.parseInt(args[0]);
        double sum = 0;
        for(int j=1;j<=i;j++){
            sum+=(Math.pow(-1,(j+1))*1/(Math.pow(j,2)));
        }
        System.out.println(sum);
    }
}