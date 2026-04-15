// Parent class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

// Child class
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

// Child class
class Cow extends Animal {
    void sound() {
        System.out.println("Cow moos");
    }
}

// Main class
public class Inheritance {
    public static void main(String[] args) {
        Dog d = new Dog(); 
        d.sound(); 

        Cat c = new Cat(); 
        c.sound(); 

        Cow w = new Cow(); 
        w.sound(); 
    }
}