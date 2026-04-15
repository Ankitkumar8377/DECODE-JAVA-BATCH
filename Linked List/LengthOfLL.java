class Node {
    public int data;
    public Node next;

    public Node(int value) {
        this.data = value;
        this.next = null;
    }
}

public class LengthOfLL {
    public static int findLengthIterative(Node head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }

    public static int findLengthRecursive(Node head) {
        if (head == null) return 0;
        return 1 + findLengthRecursive(head.next);
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        System.out.println("Length (Iterative): " + findLengthIterative(head));
        System.out.println("Length (Recursive): " + findLengthRecursive(head));
    }
}