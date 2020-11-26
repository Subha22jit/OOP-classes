import java.util.Scanner;

class Question1 {
    static void printArray(char[] c) {
        System.out.print("[");
        for (char ch : c) {
            System.out.print("'" + ch + "'");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next() + sc.nextLine();
        char c[] = new char[str.length()];
        char c2[] = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            c[i] = str.charAt(i);
        }
        printArray(c);
        printArray(c2);
    }
}