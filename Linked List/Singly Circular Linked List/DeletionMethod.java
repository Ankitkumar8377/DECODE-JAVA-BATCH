//Deletion at head,tail and any Index

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class DeletionMethod {
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

    // Delete at Head
    void deleteAtHead() {
        if (head == null) return;
        if (head == tail) head = tail = null;
        else {
            head = head.next;
            tail.next = head;
        }
        size--;
    }

    // Delete at Tail
    void deleteAtTail() {
        if (head == null) return;
        if (head == tail) {
            head = tail = null;
            size--;
            return;
        }
        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        temp.next = head;
        tail = temp;
        size--;
    }

    // Delete at Index
    void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return;
        }
        if (index == 0) {
            deleteAtHead();
            return;
        }
        if (index == size - 1) {
            deleteAtTail();
            return;
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
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
        DeletionMethod list = new DeletionMethod();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.print(); 
        list.deleteAtHead();
        list.print(); 
        list.deleteAtTail();
        list.print(); 
        list.deleteAtIndex(1);
        list.print(); 
    }
}