public class ThisKeyword {
    public static class Car {
        int price; // 0
        String name; // null

        Car(){

        }

        Car(int price, String name) {
            this.price = price;
            this.name = name;
        }

        Car(String s, int x) {
            price=x;
            name=s;
       }

        void print() {
            System.out.println(price + " " + name);
        }
    }

    public static void main(String[] args) {
        Car c1 = new Car(1250000, "Kia Sonet");
        c1.print();

        Car c2 = new Car("Lord Alto", 400000);
        c2.print();

        Car c3 = new Car();
        c3.name = "Honda Amaze";
    }

}
