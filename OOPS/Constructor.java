public class Constructor {
    public static class Car {
        int seats; // 0
        String name; // null
        double length; // 0.0

        Car(){ //Default Constructor

        }

        Car(int x, String s, double d) { // Parameterized Constructor
            seats = x;
            name = s;
            length = d;
        }
        
        void print() {
            System.out.println(seats + " " + name + " " + length);
        }
    }

    public static void main(String[] args) {
        Car c1 = new Car(5, "Kia Sonet", 3.99);
        c1.print();
        Car c2 = new Car(4, "Lord Alto", 3.75);
        c2.print();
    }
}
