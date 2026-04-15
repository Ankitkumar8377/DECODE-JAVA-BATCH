//1.

// public class Add {
//  // create a method
//     public int addition(int p, int q) {
//         int add = p + q;
//  // return value
//         return add;
//     }
//     public static void main(String[] args) {
//         int p = 40;
//         int q = 60;
//         // create an object of Main
//     Add obj = new Add();
//  // calling method
//     int answer = obj.addition(p,q);
//         System.out.println("Sum is: " + answer);
//     }
// }

//2.

public class Add {
    // create a method
        public void addition(int p, int q) {
        int add = p + q;
    // print value
        System.out.println("Sum is: " + add);
 }
     public static void main(String[] args) {
     int p = 40;
     int q = 60;
      // create an object of Main
     Add obj = new Add();
 // calling method
     obj.addition(p,q);
 }
 }
