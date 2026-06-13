class Node {
    int val;
    Node next;
    Node(int val) {
        this.val = val;
    }
}

class CircularQueue {
    Node head;
    Node tail;
    int size;
    void add(int val) {
        Node temp = new Node(val);
        if (size == 0) {
            head = tail = temp;
            tail.next = head;
        } else {
            tail.next = temp;
            tail = temp;
            tail.next = head;
        }
        size++;
    }

    int remove() {
        if (size == 0) {
            System.out.println("Queue is Empty!");
            return -1;
        }
        int front = head.val;
        if (size == 1) head = tail = null;
        else {
            head = head.next;
            tail.next = head;
        }
        size--;
        return front;
    }

    int peek() {
        if (size == 0) {
            System.out.println("Queue is Empty!");
            return -1;
        }
        return head.val;
    }

    void display() {
        if (size == 0) {
            System.out.println("Queue is Empty!");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.val + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }
}

public class LinkedListImplementationOfCircularQueue {
    public static void main(String[] args) {
        CircularQueue q = new CircularQueue();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.display(); 
        System.out.println(q.remove()); 
        q.display(); 
        q.add(50);
        q.display();
        System.out.println(q.peek());
    }
}