//Get and Set method in DoublyCircularLL

class Node {
    int data;
    Node next;
    Node prev;
    Node(int data) {
        this.data = data;
    }
}

public class GetAndSetMethod {
    Node head = null;
    // Insert at End

    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        
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

    // Get Value at index

    int get(int index) {
        if (head == null) {
            System.out.println("Empty");
            return -1;
        }
        Node temp = head;
        
        for (int i = 0; i < index; i++) {
            temp = temp.next;
            if (temp == head) {
                System.out.println("Invalid index");
                return -1;
            }
        }
        return temp.data;
    }

    // Set Value at index
    void set(int index, int value) {
        if (head == null) {
            System.out.println("Empty");
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
        temp.data = value;
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
        GetAndSetMethod list = new GetAndSetMethod();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.display(); 
        System.out.println(list.get(2));
        list.set(2, 99);
        list.display();  
    }
}