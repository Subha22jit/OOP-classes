package codes;

public class Box {
    int h, r;
    boolean isCube;

    Box(int h) {
        this.h = h;
        this.isCube = true;
    }

    Box(int r, int h) {
        this.r = r;
        this.h = h;
        this.isCube = false;
    }

    double getVolume(boolean chck) {
        return 0.00;
    }

    double getVolume() {
        return this.isCube ? Math.pow(this.h, 3) : Math.PI * Math.pow(this.r, 2) * (this.h / 3);
    }

    public static void main(String[] args) {
        Box cube = new Box(2);
        Box cone = new Box(2, 3);
        System.out.println("Cube : " + String.format("%.2f", cube.getVolume()));
        System.out.println("Cone : " + String.format("%.2f", cone.getVolume()));
        System.out.println("Nulled : " + String.format("%.2f", cone.getVolume(true)));

    }
}
