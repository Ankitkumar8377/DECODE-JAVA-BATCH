//Deletion at Any Index

class dNode {
    int val;
    dNode next;
    dNode prev;
    dNode(int val) {
        this.val = val;
    }
}

class DLL{
    dNode head;
    dNode tail;
    int size;

    void display(){
        dNode temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    
//Insertion

    void insertAtTail(int val){
        dNode temp = new dNode(val);
        if(size == 0) head = tail = temp;
        else{
            tail.next = temp;
            temp.prev = tail; // extra
            tail = temp;
        }
        size++;
    }
     
    void insertAtHead(int val){
        dNode temp = new dNode(val);

        if(size == 0) head = tail = temp;
        else{
            temp.next = head;
            head.prev = temp; // extra
            head = temp;
        }
        size++;
    }

    void insert(int idx, int val){
        if(idx == 0){
            insertAtHead(val);
            return;
        }

        if(idx == size){
            insertAtTail(val);
            return;
        }

        if(idx > size || idx < 0){
            System.out.println("Invalid Index!!");
            return;
        }
    
        dNode temp = new dNode(val);
        dNode x = head;

        for(int i = 1; i <= idx - 1; i++){
            x = x.next;
        }

        dNode y = x.next;
        x.next = temp; 
        temp.prev = x;
        y.prev = temp; 
        temp.next = y;
        size++;
}

//Deletion

    void deleteAtHead() throws Error{
        if(size == 0) throw new Error("List is Empty");
        if(size==1) head = tail = null;
        else{
            head = head.next;
            head.prev = null; // extra
        }
        size--;
    }

    void deleteAtTail() throws Error{
        if(size == 0) throw new Error("List is Empty");
        if(size == 1) head = tail = null;
        else{
            tail = tail.prev;
            tail.next = null; // extra
        }
        size--;
    }

    void delete(int idx) throws Error{
        if(idx == 0){
            deleteAtHead();
            return;
        }

        if(idx == size - 1){
            deleteAtTail();
            return;
        }
        
        if(idx < 0 || idx >= size) throw new Error("Invalid Index");

        dNode temp = head;

        for(int i = 1; i <= idx - 1; i++){
            temp = temp.next;
        }

        temp.next = temp.next.next;
        temp.next.prev = temp;
        size--;
    }
}

public class DeleteMethodInDoublyLL {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.display();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.display();
        list.insertAtTail(40);
        list.display();
        System.out.println(list.size);
        list.insertAtHead(50);
        list.display();
        list.insert(2, 80);
        list.display();
        list.delete(3);
        list.display();
    }   
}