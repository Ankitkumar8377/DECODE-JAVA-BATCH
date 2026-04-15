//1.

// class Bike {
//     int wheelCounts ; 
//     String model;

//     void start(){
//         System.out.println("Vehicle is starting");

//     }
// }

// public class MethodOverriding extends Bike{ //In this,there will be no implemention occur of parent class 
//     void start(){                           //because child has passed its own content
//         System.out.println("Vehicle is stopped");
//     }
//     public static void main(String[] args) {
//         MethodOverriding obj = new MethodOverriding();
//         obj.wheelCounts = 4;
//         obj.start();
//     }
    
// }


//2.

class Bike {
    int wheelCounts ; 
    String model;

    void start(){
        System.out.println("Vehicle is starting");
    }
}

public class MethodOverriding extends Bike{ 
    String colour;

    void start(){
        System.out.println(this);
        System.out.println(this.model + " Vehicle is stopped");
    }
    public static void main(String[] args) {
        MethodOverriding obj = new MethodOverriding();
        obj.wheelCounts = 4;
        obj.model = "110";
        obj.colour = "Red";
        obj.start();
    }
    
}


