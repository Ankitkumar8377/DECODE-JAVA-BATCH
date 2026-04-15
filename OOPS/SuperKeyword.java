// Parent class
class Parent {
    int num = 100; // Parent variable
}

// Child class
class Child extends Parent {
    int num = 200; // Child variable

    void display() {
        System.out.println("Child num: " + num);
        System.out.println("Parent num using super: " + super.num);
    }
}

// Main class
public class SuperKeyword {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}
