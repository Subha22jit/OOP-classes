package codes;

public class Rectangle {
    int l, b;

    Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    int area() {
        return this.l * this.b;
    }

    int perimeter() {
        return 2 * (this.l + this.b);
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(2, 4);
        Square s = new Square(2);
        System.out.printf("RECT: Area %d Perimeter %d\n", r.area(), r.perimeter());
        System.out.printf("SQR: Area %d Perimeter %d\n", s.area(), s.perimeter());

        System.out.println("Let's make 10 squares now!");
        Square sa[] = new Square[10];
        for (int i = 0; i < 10; i++) {
            sa[i] = new Square((int) (Math.random() * 50));
        }
        for (int i = 0; i < 10; i++) {
            System.out.printf("SQuARE %d [Side: %d]: Area: %d Perimeter %d\n", i + 1, sa[i].l, sa[i].area(),
                    sa[i].perimeter());
        }
    }

}

class Square extends Rectangle {
    Square(int s) {
        super(s, s);
    }
}
