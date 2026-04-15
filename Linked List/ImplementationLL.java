//1. Insert At End

// class Node {
//     int val;
//     Node next;

//     Node(int val) {
//         this.val = val;
//     }
// }
// class SinglyLL{ //User Defined data structure
//     Node head;
//     Node tail;
//     int size;
//     void insertAtEnd(int val){
//         Node temp=new Node(val);
//         if(head==null){
//             head=tail=temp;         
//         }
//         else{
//             tail.next = temp;
//             tail = temp;
//         }
//         size++;
//     }
    
//     void display() {
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.val + " ");
//             temp = temp.next;
//         }
//         System.out.println();
//     }
//     void size(){
//         System.out.println(size);
//     }

// }
// public class ImplementationLL {
//     public static void main(String[] args) { 
//         SinglyLL list = new SinglyLL();
//         list.size();
//         list.insertAtEnd(10);
//         list.insertAtEnd(20);
//         list.insertAtEnd(30);
//         list.insertAtEnd(40);
//         list.display();
//         list.insertAtEnd(27);
//         list.size();
//         list.display();


//     }
// }


//2. Insert At Head

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

    void insertAtTail(int val){
        Node temp=new Node(val);
        if(head==null){
            head = tail =temp;
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

public class ImplementationLL {
    public static void main(String[] args) {
        SinglyLL list = new SinglyLL();
        list.insertAtTail(10..);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.display();
        list.insertAtTail(40);
        list.display();
        list.insertAtHead(50);
        
    }
}
