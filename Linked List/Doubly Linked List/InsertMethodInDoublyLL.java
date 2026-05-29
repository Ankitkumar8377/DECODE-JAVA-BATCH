// Insert At any Index
class dNode {
    int val;
    dNode next;
    dNode prev;

    dNode(int val) {
        this.val = val;
    }
}

class DLL {
    dNode head;
    dNode tail;
    int size;

    void display() {
        dNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void insertAtTail(int val) {
        dNode temp = new dNode(val);
        if (head == null) head = tail = temp;
        else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;
    }

    void insertAtHead(int val) {
        dNode temp = new dNode(val);

        if (head == null) head = tail = temp;
        else {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size++;
    }

    void insert(int idx, int val) {
        if (idx < 0 || idx > size) {
            System.out.println("Invalid Index!!");
            return;
        }

        if (idx == 0) {
            insertAtHead(val);
            return;
        }

        if (idx == size) {
            insertAtTail(val);
            return;
        }

        dNode curr = head;

        // move to (idx - 1)
        for (int i = 0; i < idx - 1; i++) {
            curr = curr.next;
        }

        dNode temp = new dNode(val);

        temp.next = curr.next;
        curr.next.prev = temp;

        curr.next = temp;
        temp.prev = curr;

        size++;
    }
}

public class InsertMethodInDoublyLL {
    public static void main(String[] args) {
        DLL list = new DLL();

        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtTail(40);

        list.display(); // 10 20 30 40

        list.insertAtHead(50);
        list.display(); // 50 10 20 30 40

        list.insert(2, 80);
        list.display(); // 50 10 80 20 30 40

        System.out.println(list.size); // 6
    }
}