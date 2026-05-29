//1. Shallow Copy - Address will be same

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

public class ShallowCopyOfANode {
    public static void main(String[] args) {
        Node a = new Node(100);
        Node temp = a; // Shallow Copy
        System.out.println(a);
        System.out.println(temp);
        temp.val=12;
        System.out.println(a.val);// Value of a will be same
    }
}


//2. Deep Copy - Address will not be same

// class Node {
//     int val;
//     Node next;

//     Node(int val) {
//         this.val = val;
//     }
// }

// public class ShallowCopyOfANode {
//     public static void main(String[] args) {
//         Node a = new Node(100);
//         Node temp = new Node(100); // Deep Copy
//         System.out.println(a); 
//         System.out.println(temp);
//     }
// }
