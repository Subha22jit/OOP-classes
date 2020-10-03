package codes;

public enum Rectangle2 {
    int length;
    int bredth;

    int area() {
        return this.length * this.bredth;
    }

    Rectangle2() {
        this.length = 0;
        this.bredth = 0;
    }

    Rectangle2(int l, int b) {
        this.length = l;
        this.bredth = b;
    }

    Rectangle2(int side) {
        this.length = side;
        this.bredth = side;
    }
}
