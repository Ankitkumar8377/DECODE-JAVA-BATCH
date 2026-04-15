//1. Public

// public class AccessModifiers {
//     public int data;

//     public void display() {
//         System.out.println("Public method");
//     }

//     public static void main(String[] args) {
//         AccessModifiers obj = new AccessModifiers();

//         // Access the public variable
//         obj.data = 10;
//         System.out.println("Data = " + obj.data);

//         // Call the public method
//         obj.display();
//     }
// }


//2. Private

// class AccessModifiers {
//     private int data = 10; // Not accessible outside this class

//     private void display() {
//         System.out.println("Private method");
//     }

//     public void show() {
//         display(); // Private methods can be used inside the class
//         System.out.println("Data = " + data);
//     }

//     public static void main(String[] args) {
//         AccessModifiers obj = new AccessModifiers();

//         // obj.display(); // Cannot access private method directly
//         // System.out.println(obj.data); // Cannot access private variable directly

//         obj.show(); // Access through public method
//     }
// }


//3. Protected

// class Parent {
//     protected int data = 42; // Protected variable
// }

// class AccessModifiers extends Parent {
//     void print() {
//         System.out.println("Protected data = " + data); // Accessible because it's protected
//     }

//     public static void main(String[] args) {
//         AccessModifiers obj = new AccessModifiers();
//         obj.print(); // Call the method to print the protected variable
//     }
//}


//4. Default (No Modifier)

class AccessModifiers {
    int data = 100; // default access

    void display() {
        System.out.println("Default method");
    }

    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();

        // Accessing default variable and method
        System.out.println("Data = " + obj.data);
        obj.display();
    }
}
