//Get Method 

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

    // Insert At End
    void insertAtEnd(int val) {
        dNode newNode = new dNode(val);

        if (head == null) head = tail = newNode;
        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }
    dNode get(int index) {
        if (index < 0 || index >= size) return null;
        dNode temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    int getValue(int index) {
        dNode node = get(index);
        return (node != null) ? node.val : -1;
    }
}

public class GetMethod {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);
        System.out.println(list.getValue(2)); 
        System.out.println(list.getValue(4)); 
    }
}