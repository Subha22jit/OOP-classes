package codes;

// import java.util.Locale;

public class Gaadi {
    public static void main(String[] args) {
        // System.out.println(Locale.getDefault());
        Car c = new Car("Maruti", "800", 100000);
        c.discount();
        c.display();
    }

}

class MotorVehicle {
    String modelName;
    String modelNumber;
    double modelPrice;

    MotorVehicle(String modelName, String modelNumber, double modelPrice) {
        this.modelName = modelName;
        this.modelNumber = modelNumber;
        this.modelPrice = modelPrice;
    }

    void display() {
        System.out.printf("[Name: %s]%n[Number: %s]%n[Price: \u20b9%.2f]%n", this.modelName, this.modelNumber,
                this.modelPrice);
    }
}

class Car extends MotorVehicle {
    double discountRate;

    Car(String modelName, String modelNumber, double modelPrice, double discountRate) {
        super(modelName, modelNumber, modelPrice);
        this.discountRate = discountRate;
    }

    Car(String modelName, String modelNumber, double modelPrice) {
        super(modelName, modelNumber, modelPrice);
        this.discountRate = 0;
    }

    void display() {
        super.display();
        System.out.printf("[Discount Rate: %.2f]", this.discountRate);
    }

    void discount() {
        if (this.discountRate == 0) {
            System.err.println("Discount Rate already set!");
            return;
        }
        this.discountRate = Math.random() * 25;
    }
}