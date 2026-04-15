class ComplexNumber {
    double x;
    double y;

    ComplexNumber(){ }

    ComplexNumber(double x, double y) {
        this.x = x;
        this.y = y;
    }

    void add(ComplexNumber z) {
        x += z.x;
        y += z.y;
    }

    void multiply(ComplexNumber z) {
        x = x * z.x - y * z.y;
        y = x * z.y + y * z.x;
    }

    void print() {
        System.out.println(x + " + " + y+"i");
    }
}

public class ComplexNumberClass {
    public static void main(String[] args) {
        ComplexNumber z1 = new ComplexNumber(2, 5);
        ComplexNumber z2 = new ComplexNumber(3,-7);
        z1.print();
        z2.print();
        z1.add(z2);
        z1.print();
        z2.print();
        z1.multiply(z2);
        z1.print();
        z2.print();
    }
}
