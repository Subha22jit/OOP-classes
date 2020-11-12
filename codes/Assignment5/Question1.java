package codes.Assignment5;

public class Question1 {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Rectangle r = new Rectangle(5, 10);
        System.out.printf("Circle: %.2f%nRectangle: %.2f%n", c.area(), r.area());
    }
}

public interface Shape {
    float pi = 3.14F;

    float area();
}

public class Circle implements Shape {
    float radius;

    Circle(float radius) {
        this.radius = radius;
    }

    Circle() {
        this.radius = 0.0F;
    }

    public float area() {
        return pi * this.radius * this.radius;
    }
}

public class Rectangle implements Shape {
    float width;
    float length;

    Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    Rectangle() {
        this.length = 0.0F;
        this.width = 0.0F;
    }

    public float area() {
        return this.length * this.width;
    }
}