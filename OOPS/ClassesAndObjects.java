//1.


// public class ClassesAndObjects {
//     public static void main(String[] args) {
//         Dog d1 = new Dog(); //We are creating new objects and if we don't use new keywords then we are not able to create new objects.
//         d1.Walk();

//         Dog d2 = new Dog();
//         d2.Sleep();

//     }
//  } 

// class Dog{
//     int age;
//     String name;
//     void Walk(){
//         System.out.println("Dog is walking");
//     }

//     void Sleep(){
//         System.out.println("Dog is sleeping");
//     }

// }


//2.


public class ClassesAndObjects {
    public static void main(String[] args) {
        Dog d1 = new Dog(); 
        d1.name = "Tommy";
        d1.Walk();

        Dog d2 = new Dog();
        d2.name = "Tiger";
        d2.Sleep();


    }
 }
class Dog{
    int age;
    String name;
    void Walk(){
        System.out.println(name +" is walking");
    }

    void Sleep(){
        System.out.println(name +" is sleeping");
    }

}

// 3.Printing Complex Number


// public class ClassesAndObjects {
//     public static void main(String[] args) {
//         Complex C1 = new Complex();
//         C1.a=5;
//         C1.b=7;
//         C1.memory();
//     }
// }

// class Complex{
//     int a,b;
//     void memory(){
//         System.out.println(a+"+"+b+"i");
//     }
// }



