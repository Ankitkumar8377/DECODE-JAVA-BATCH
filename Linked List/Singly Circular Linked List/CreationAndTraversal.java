//Creation and Traversal of Singly Circular LL 

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CreationAndTraversal  {
    public static void print(Node head) {
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {

        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);

        // Linking nodes
        a.next = b;
        b.next = c;
        c.next = a; // circular link

        print(a);
    }
}