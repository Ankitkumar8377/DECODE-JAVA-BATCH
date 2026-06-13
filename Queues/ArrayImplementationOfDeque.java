class DequeArray {
    int[] arr;
    int front, rear, size;

    DequeArray(int capacity) {
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == arr.length;
    }

    // Insert at front
    void addFront(int val) {
        if (isFull()) {
            System.out.println("Deque is Full!");
            return;
        }
        front = (front - 1 + arr.length) % arr.length;
        arr[front] = val;
        if (size == 0) rear = front;
        size++;
    }

    // Insert at rear
    void addRear(int val) {
        if (isFull()) {
            System.out.println("Deque is Full!");
            return;
        }
        rear = (rear + 1) % arr.length;
        arr[rear] = val;
        size++;
    }

    // Delete from front
    int removeFront() {
        if (isEmpty()) {
            System.out.println("Deque is Empty!");
            return -1;
        }
        int val = arr[front];
        front = (front + 1) % arr.length;
        size--;
        return val;
    }

    // Delete from rear
    int removeRear() {
        if (isEmpty()) {
            System.out.println("Deque is Empty!");
            return -1;
        }
        int val = arr[rear];
        rear = (rear - 1 + arr.length) % arr.length;
        size--;
        return val;
    }

    int getFront() {
        if (isEmpty()) return -1;
        return arr[front];
    }

    int getRear() {
        if (isEmpty()) return -1;
        return arr[rear];
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Deque is Empty!");
            return;
        }
        int i = front;
        for (int count = 0; count < size; count++) {
            System.out.print(arr[i] + " ");
            i = (i + 1) % arr.length;
        }
        System.out.println();
    }
}
public class ArrayImplementationOfDeque {
    public static void main(String[] args) {
        DequeArray dq = new DequeArray(5);
        dq.addRear(10);
        dq.addRear(20);
        dq.addFront(5);
        dq.addFront(1);
        dq.display(); 
        dq.removeFront();
        dq.removeRear();
        dq.display(); 
        System.out.println(dq.getFront());
        System.out.println(dq.getRear());
    }
}