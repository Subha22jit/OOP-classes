
public class AbsTesting {
    public static void main(String[] args) {
        ABS.showS();
        new ABSopener().showI();
    }
}

abstract class ABS {
    public void showI() {
        System.out.println("Instance Method");
    }

    public static void showS() {
        System.out.println("Static Method");
    }
}

class ABSopener extends ABS {
}
