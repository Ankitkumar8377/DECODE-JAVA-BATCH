//1. Abstraction Using Abstract Class

// // Abstract class
// abstract class Vehicle {

//     // Abstract method (no implementation)
//     abstract void start();

//     // Normal method (with implementation)
//     void stop() {
//         System.out.println("Vehicle stopped.");
//     }
// }

// // Subclass providing implementation of abstract method
// class Car extends Vehicle {

//     @Override
//     void start() {
//         System.out.println("Car starts with a key.");
//     }
// }

// public class Abstraction {
//     public static void main(String[] args) {

//         // We cannot create object of abstract class:
//         // Vehicle v = new Vehicle(); //Error

//         Vehicle v = new Car(); // Upcasting
//         v.start(); // Calls Car's implementation
//         v.stop(); // Calls normal method from Vehicle
//     }
// }


//2. Abstraction Using Interface

// Interface
interface Animal {
    void sound();
}

// Interface
interface Pet {
    void play();
}

// Class implementing the interface
class Dog implements Animal, Pet {

    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    @Override
    public void play() {
        System.out.println("Dog plays with ball");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.play();
    }
}
