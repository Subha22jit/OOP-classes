package codes;

import java.util.Arrays;

public class SecondLargestSmallest {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Too few elements to find 2nd (low&high)est!");
            System.exit(0);
        }

        int arr[] = Arrays.stream(args).mapToInt(Integer::parseInt).toArray();
        int low1 = Integer.MAX_VALUE, low2 = Integer.MAX_VALUE;
        int high1 = Integer.MIN_VALUE, high2 = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i < low1) {
                low2 = low1;
                low1 = i;
            } else if (i < low2) {
                low2 = i;
            }
            if (i > high1) {
                high2 = high1;
                high1 = i;
            } else if (i > high2) {
                high2 = i;
            }
        }
        System.out.printf("Second lowest: %d\nSecond highest: %d\n", low2, high2);
    }
}
