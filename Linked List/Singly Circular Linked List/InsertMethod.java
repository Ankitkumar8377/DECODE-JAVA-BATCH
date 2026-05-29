//Insertion at head, tail and any Index

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class InsertMethod {

    Node head;
    Node tail;
    int size;

    // Insert at Head
    void insertAtHead(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = tail = newNode;
            newNode.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head; // maintain circular link
        }
        size++;
    }

    // Insert at Tail
    void insertAtTail(int val) {
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

    // Insert at Any Index
    void insertAtIndex(int index, int val) {
        if (index < 0 || index > size) {
            System.out.println("Invalid index");
            return;
        }

        if (index == 0) {
            insertAtHead(val);
            return;
        }

        if (index == size) {
            insertAtTail(val);
            return;
        }

        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(val);
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
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
        InsertMethod list = new InsertMethod();
        list.insertAtHead(20);
        list.insertAtHead(10);
        list.insertAtTail(30);
        list.insertAtTail(40);
        list.insertAtIndex(2, 25);
        list.print();
    }
}