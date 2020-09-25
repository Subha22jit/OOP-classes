package codes;

public class DecBin {
    static String getBinary(int i) {
        String bin = "";
        while (i > 0) {
            bin = (i % 2) + bin;
            i = i / 2;
        }
        int t = 0;
        while (Math.pow(2, t) < bin.length())
            t++;
        String toAdd = "";
        for (int j = 0; j < (Math.pow(2, t) - bin.length()); j++)
            toAdd = toAdd + "0";
        return toAdd + bin;
    }

    static int getDecimal(String bin) {
        int dec = 0;
        int binint = Integer.parseInt(bin);
        int n = 0;
        while (true) {
            if (binint == 0) {
                break;
            } else {
                int temp = binint % 10;
                dec += temp * Math.pow(2, n);
                binint = binint / 10;
                n++;
            }
        }
        return dec;
    }

    public static void main(String[] args) {
        System.out.println("Binary of " + args[0] + " is: " + getBinary(Integer.parseInt(args[0])));
        System.out.println("Decimal of " + args[1] + " is: " + getDecimal(args[1]));
    }
}
