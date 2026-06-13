class Node {
    int val;
    Node prev;
    Node next;
    Node(int val) {
        this.val = val;
    }
}

class DequeDLL {
    Node front;
    Node rear;
    int size;

    // Insert at Front
    void addFront(int val) {
        Node temp = new Node(val);
        if (size == 0) front = rear = temp;
        else {
            temp.next = front;
            front.prev = temp;
            front = temp;
        }
        size++;
    }

    // Insert at Rear
    void addRear(int val) {
        Node temp = new Node(val);
        if (size == 0) front = rear = temp;
        else {
            rear.next = temp;
            temp.prev = rear;
            rear = temp;
        }
        size++;
    }

    // Remove from Front
    int removeFront() {
        if (size == 0) {
            System.out.println("Deque is Empty!");
            return -1;
        }
        int x = front.val;
        if (size == 1) front = rear = null;
        else {
            front = front.next;
            front.prev = null;
        }

        size--;
        return x;
    }

    // Remove from Rear
    int removeRear() {
        if (size == 0) {
            System.out.println("Deque is Empty!");
            return -1;
        }
        int x = rear.val;
        if (size == 1) front = rear = null;
        else {
            rear = rear.prev;
            rear.next = null;
        }
        size--;
        return x;
    }

    // Peek Front
    int getFront() {
        if (size == 0) {
            System.out.println("Deque is Empty!");
            return -1;
        }
        return front.val;
    }

    // Peek Rear
    int getRear() {
        if (size == 0) {
            System.out.println("Deque is Empty!");
            return -1;
        }
        return rear.val;
    }

    // Check Empty
    boolean isEmpty() {
        return size == 0;
    }

    // Size
    int size() {
        return size;
    }

    // Display
    void display() {
        if (size == 0) {
            System.out.println("Deque is Empty!");
            return;
        }
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}   

public class LinkedListImplementationOfDeque {
    public static void main(String[] args) {
        DequeDLL dq = new DequeDLL();
        dq.addFront(20);
        dq.addFront(10);
        dq.addRear(30);
        dq.addRear(40);
        dq.display();     
        dq.removeFront();
        dq.display();      
        System.out.println(dq.getFront()); 
        System.out.println(dq.getRear());  
    }
}
