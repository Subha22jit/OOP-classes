import java.util.Scanner;

public class TripletSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[args.length];
        for(int i=0;i<args.length;i++)
            arr[i]=Integer.parseInt(args[i]);
        System.out.print("Enter the required sum: ");
        int sumreq = sc.nextInt();
        sc.close();
        String op = findTriplets(arr, sumreq);
        if(op=="")
            System.out.println("No Triplets Found");
        else
            System.out.println("The triplets with sum = "+sumreq+" are "+op.substring(2));        
    }   
    static String findTriplets(int arr[],int sum) 
    {
        String op="";
        String last ="";
        for (int i = 0;i < arr.length - 2; i++) {
            for (int j = i + 1;j < arr.length - 1; j++) { 
                for (int k = j + 1;k < arr.length; k++) { 
                    if (arr[i] + arr[j] + arr[k] == sum) { 
                    // System.out.println(arr[i]+" "+arr[j]+" "+ arr[k]);
                    op=op+", ("+arr[i]+"+"+arr[j]+"+"+ arr[k]+")";
                    last = ", ("+arr[i]+"+"+arr[j]+"+"+ arr[k]+")";
                    } 
                } 
            } 
        }
        op=op.replace(last," and"+last.substring(1));
        return op;
    }
}
