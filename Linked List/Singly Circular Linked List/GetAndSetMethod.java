//Get and Set Method in Singly Circular LL

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class GetAndSetMethod {

    Node head;
    Node tail;
    int size;

    // Insert at End
    void insertAtEnd(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            newNode.next = head;
            tail = newNode;
        }
        size++;
    }

    // Get method
    int get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return -1;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    // Set method
    void set(int index, int value) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        temp.data = value;
    }

    void print() {
        if (head == null) return;
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    public static void main(String[] args) {
        GetAndSetMethod list = new GetAndSetMethod();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.print();
        list.set(2, 99);
        list.print();
        System.out.println(list.get(2)); 
    }
}