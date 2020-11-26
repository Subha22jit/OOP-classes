import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next() + sc.nextLine();
        StringBuffer sb = new StringBuffer(str);
        int previous_hashCode = str.hashCode();
        str = str.concat("HELLOOOOOOO");
        System.out.printf("[STRING]%nPrevious Hash: %d%nNew Hash: %d%nSame: %s%n", previous_hashCode, str.hashCode(),
                str.hashCode() == previous_hashCode);
        previous_hashCode = sb.hashCode();
        sb.append("HELLOOOOOOO");
        System.out.printf("[STRINGBUFFER]%nPrevious Hash: %d%nNew Hash: %d%nSame: %s%n", previous_hashCode,
                sb.hashCode(), sb.hashCode() == previous_hashCode);

    }
}
