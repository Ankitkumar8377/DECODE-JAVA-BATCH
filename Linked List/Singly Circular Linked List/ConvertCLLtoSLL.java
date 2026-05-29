//Convert Circular LL into Singly LL 

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ConvertCLLtoSLL {

    // Function to convert Circular LL to Singly LL
    public static Node convertCLLtoSLL(Node head) {
        if (head == null) return null;

        Node temp = head;

        // Traverse till last node (whose next points to head)
        while (temp.next != head) {
            temp = temp.next;
        }

        // Break the circular link
        temp.next = null;

        return head;
    }

    // Helper function to print SLL
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Example usage
    public static void main(String[] args) {
        // Creating circular linked list: 1 -> 2 -> 3 -> 4 -> (back to 1)
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head; // circular link

        // Convert to singly linked list
        head = convertCLLtoSLL(head);

        // Print result
        printList(head);
    }
}