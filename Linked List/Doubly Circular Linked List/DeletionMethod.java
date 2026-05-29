//Deletion at head,tail and any Index

class Node {
    int data;
    Node next;
    Node prev;
    
    Node(int data) {
        this.data = data;
    }
}

public class DeletionMethod {
    Node head = null;

    // Insert at Tail
    void insertAtEnd(int data) {
        Node newNode = new Node(data);

        // empty list
        if (head == null) {
            newNode.next = newNode;
            newNode.prev = newNode;
            head = newNode;
            return;
        }

        Node tail = head.prev;

        tail.next = newNode;
        newNode.prev = tail;

        newNode.next = head;
        head.prev = newNode;
    }

    // Delete at Head
    void deleteAtHead() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }

        // Single Node
        if (head.next == head) {
            head = null;
            return;
        }

        Node tail = head.prev;

        head = head.next;
        head.prev = tail;
        tail.next = head;
    }

    // Delete at Tail
    void deleteAtTail() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }

        // Single Node
        if (head.next == head) {
            head = null;
            return;
        }

        Node tail = head.prev;

        tail.prev.next = head;
        head.prev = tail.prev;
    }

    // Delete at Index (0-based)
    void deleteAtIndex(int index) {
    if (head == null) {
        System.out.println("Empty");
        return;
    }

    if (index == 0) {
        deleteAtHead();
        return;
    }

    Node temp = head;

    for (int i = 0; i < index; i++) {
        temp = temp.next;
        if (temp == head) {
            System.out.println("Invalid index");
            return;
        }
    }

    // Deleting Tail
    if (temp.next == head) {
        deleteAtTail();
        return;
    }

    temp.prev.next = temp.next;
    temp.next.prev = temp.prev;
}

    // Display
    void display() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    public static void main(String[] args) {
        DeletionMethod list = new DeletionMethod();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);

        list.display(); 

        list.deleteAtHead();
        list.display();  

        list.deleteAtTail();
        list.display();  

        list.deleteAtIndex(1);
        list.display();   
    }
}