//Insertion at head, tail and any index in doubly circular LL

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
    }
}

public class InsertMethod {
    Node head = null;
    int size = 0;

    // Insert at Head
    void insertAtHead(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
        } else {
            Node tail = head.prev;

            newNode.next = head;
            newNode.prev = tail;

            tail.next = newNode;
            head.prev = newNode;

            head = newNode;
        }
        size++;
    }

    // Insert at Tail
    void insertAtTail(int data) {
        if (head == null) {
            insertAtHead(data);
            return;
        }
        Node newNode = new Node(data);
        Node tail = head.prev;

        tail.next = newNode;
        newNode.prev = tail;

        newNode.next = head;
        head.prev = newNode;

        size++;
    }

    // Insert at Any Index
    void insertAtIndex(int index, int data) {
        if (index < 0 || index > size) {
            System.out.println("Invalid index");
            return;
        }

        if (index == 0) {
            insertAtHead(data);
            return;
        }

        if (index == size) {
            insertAtTail(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        Node nextNode = temp.next;

        temp.next = newNode;
        newNode.prev = temp;

        newNode.next = nextNode;
        nextNode.prev = newNode;

        size++;
    }

    // Display Forward
    void display() {
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

    public static void main(String[] args) {
        InsertMethod list = new InsertMethod();

        list.insertAtHead(20);
        list.insertAtHead(10);

        list.insertAtTail(30);
        list.insertAtTail(40);

        list.insertAtIndex(2, 25);

        list.display();  // Output: 10 20 25 30 40
    }
}