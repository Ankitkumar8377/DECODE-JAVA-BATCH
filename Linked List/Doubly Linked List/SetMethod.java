//Set Method

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

    // Insert at end  
    void insertAtEnd(int val) {
        dNode newNode = new dNode(val);

        if (head == null)head = tail = newNode;
        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    // SET method (complete, optimized)
    boolean set(int index, int val) {
        if (index < 0 || index >= size) return false;
        dNode temp;
        // Traverse from head
        if (index < size / 2) {
            temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } 
        // Traverse from tail
        else {
            temp = tail;
            for (int i = size - 1; i > index; i--) {
                temp = temp.prev;
            }
        }
        temp.val = val;
        return true;
    }

    // Display
    void display() {
        dNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class SetMethod {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.display(); // 10 20 30 40
        list.set(2, 99); // change index 2
        list.display(); // 10 20 99 40
    }
}