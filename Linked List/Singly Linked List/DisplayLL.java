class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

public class DisplayLL {

//1. Iterative method
    public static void displayIterative(Node head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    //2. Recursive method
    public static void displayRecursive(Node head) {
        if (head == null) return;
        //System.out.println(head.val + " "); //Prints 10 20 30 40 50
        displayRecursive(head.next);
        System.out.print(head.val + " "); //Prints 50 40 30 20 10 and Reverse the linked list if we write this after call
    }
    
    public static void main(String[] args) {
        Node a = new Node(10);//head
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        a.next = b; // 10 -> 20
        b.next = c; // 10 -> 20 -> 30
        c.next = d; // 10 -> 20 -> 30 -> 40
        d.next = e; // 10 -> 20 -> 30 -> 40 -> 50

        displayIterative(a);
        displayRecursive(a);
        
    }
}
