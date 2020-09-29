package codes;

public class Overloading {
    static Integer getNumber(int i) {
        return Integer.valueOf(i);
    }

    static Double getNumber(double i) {
        return Double.valueOf(i);
    }

    public static void main(String[] args) {
        System.out.println(getNumber(1).getClass().getSimpleName());
        System.out.println(getNumber(1.0).getClass().getSimpleName());
    }
}
