/*
java secondsSmallest.java 1 2 3 4 5 6 7 8  
The 2nd Lowest number is: 2
*/

import java.util.Arrays;
public class secondsSmallest {
    public static void main(String[] args) {
        if(args.length<2){
            System.out.println("Too few elements to find 2nd lowest!");
            System.exit(0);
        }

        int arr[] = Arrays.stream(args).mapToInt(Integer::parseInt).toArray();
        int low1= Integer.MAX_VALUE, low2 = Integer.MAX_VALUE;
        for(int i:arr) {
            if(i<low1){
                low2 = low1;
                low1 = i;
            }
            else if(i<low2){
                low2 = i;
            }
        }
        System.out.println("The 2nd Lowest number is: "+String.valueOf(low2));
        
    }
}
