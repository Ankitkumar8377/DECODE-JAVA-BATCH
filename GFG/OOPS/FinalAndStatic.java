//1. Final '

// class Cricketer {
//     final String country = "India";
//     int runs;
//     String name;
//     double avg;
//     }
// public class FinalAndStatic {
//     public static void main(String[] args) {

//         Cricketer c1 = new Cricketer();
//         // c1.country = "England"; // Error (country is final and cannot be changed)

//         System.out.println(c1.country);

//         Cricketer c2 = new Cricketer();
//         System.out.println(c2.country);
//       }
//    }

//2. Static


class Cricketer {
    static String country = "NZ";
    int runs;
    String name;
    double avg;

    static void greet() {
    System.out.println("I only believe in Jassi bhai");
    }
}

public class FinalAndStatic {
    public static void main(String[] args) {

        Cricketer c1 = new Cricketer();
        // c1.country = "England"; // Error (if final, but here it's static so allowed)

        Cricketer c2 = new Cricketer();

        c1.country = "India"; // modifies static variable for ALL objects

        System.out.println(c2.country);
        c2.greet();
        Cricketer.greet();
    }
}
