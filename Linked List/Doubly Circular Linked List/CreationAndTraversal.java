//Creation and Traversal in doubly Circular LL

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
    }
}

public class CreationAndTraversal {

    // Forward Traversal
    public static void displayForward(Node head) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);

        System.out.println();
    }

    // Backward Traversal
    public static void displayBackward(Node head) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node tail = head.prev;
        Node temp = tail;

        do {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        } while (temp != tail);

        System.out.println();
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);

        // Linking
        a.next = b;
        b.prev = a;

        b.next = c;
        c.prev = b;

        c.next = d;
        d.prev = c;

        // Circular links
        d.next = a;
        a.prev = d;

        Node head = a;
        displayForward(head);
        displayBackward(head);
    }
}