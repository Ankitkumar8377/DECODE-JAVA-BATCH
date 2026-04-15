//1. Static Variables (Class Variables)

// class Example {
//     static int count = 0;
// }

// public class StaticKeyword {
//     public static void main(String[] args) {
//         Example.count = 5; // Access without creating object
//         System.out.println(Example.count);
//     }
// }


//2. Static Methods

// class Example {
//     static void greet() {
//         System.out.println("Hello!");
//     }
// }

// public class StaticKeyword {
//     public static void main(String[] args) {
//         Example.greet(); // No object needed
//     }
// }


//3. Static Block

// class StaticKeyword {
//     static int data;
//     static {
//         data = 10;
//         System.out.println("Static block executed");
//     }

//     public static void main(String[] args) {
//         System.out.println("Data = " + data);
//     }
// }


//4. Static Nested Class

// class StaticKeyword {
//     static class Inner {
//         void msg() {
//             System.out.println("Static nested class");
//         }
//     }

//     public static void main(String[] args) {
//         // Creating object of static nested class
//         StaticKeyword.Inner obj = new StaticKeyword.Inner();
//         obj.msg(); // Call method
//     }
// }


//5. 

class Cricketer {
    static String country = "NZ";
    int runs;
    String name;
    double avg;

    static void greet() {
        System.out.println("I only believe in Jassi bhai");
    }
}

public class StaticKeyword {
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

