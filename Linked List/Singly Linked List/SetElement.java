class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

class SinglyLL { // User Defined data structure
    Node head;
    Node tail;
    int size;

    void insertAtTail(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    void insertAtHead(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
        size++;
    }

    void insert(int idx, int val) {
        if (idx == 0) {
            insertAtHead(val);
            return;
        }
        if (idx == size) {
            insertAtTail(val);
            return;
        }
        if (idx > size) {
            System.out.println("Invalid Index!!");
            return;
        }
        Node temp = new Node(val);
        Node x = head;
        for (int i = 1; i <= idx - 1; i++) {
            x = x.next;
        }
        // Insertion
        temp.next = x.next;
        x.next = temp;
        size++;
    }

    int get(int idx) {
        if (idx == size - 1)
            return tail.val;
        if (idx >= size || idx < 0) {
            System.out.println("Invalid Index!!");
            return -1;
        }
        Node temp = head;
        for (int i = 1; i <= idx; i++) {
            temp = temp.next;
        }
        return temp.val;
    }

    void set(int idx,int val) throws Error {
        if (idx == size - 1) tail.val = val;
        if (idx >= size || idx < 0) {
            throw new Error("Invalid Input");
        }
        Node temp = head;
        for (int i = 1; i <= idx; i++) {
            temp = temp.next;
        }
        temp.val = val;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void size() {
        System.out.println(size);
    }

}

public class SetElement {
    public static void main(String[] args) {
        SinglyLL list = new SinglyLL();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.display();
        list.insertAtTail(40);
        list.display();
        list.insertAtHead(50);
        list.display();
        list.insert(2, 90);
        list.display();
        list.insert(4, 70);
        list.display();
        System.out.println(list.get(3));
        list.set(2, 85);
        list.display();
    }
}
