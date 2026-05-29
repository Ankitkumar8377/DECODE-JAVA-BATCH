class Node {
    int val;
    Node next;
    Node(int val) {
        this.val = val;
    }
}

public class ListNodeClass{
    public static void main(String[] args) {
    // 1. Creation of independent nodes
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

    // 2. Linking the nodes together
        a.next = b; // 10 -> 20
        b.next = c; // 10 -> 20 -> 30
        c.next = d; // 10 -> 20 -> 30 -> 40
        d.next = e; // 10 -> 20 -> 30 -> 40 -> 50

    // 3. Accessing values through the 'head' node (a)
    //     System.out.println(a.val); // Prints 10
    //     System.out.println(a.next.val); // Prints 20
    //     System.out.println(a.next.next.val); // Prints 30
    //     System.out.println(a.next.next.next.val); // Prints 40
    //     System.out.println(a.next.next.next.next.val); // Prints 50

    //OR

    //Printing values using for loops(This is not best method because we don't have size of linked list)
    // Node temp=a;
    // for (int i = 1; i < 5; i++) {
    //     System.out.println(temp.val);
    //     temp=temp.next;
    // }

    //OR

    // Printing values by while loops(This is best method because we don't have size of linked list but condition will automatically checking for null node for terminating the loop)
    Node temp = a;
    while(temp!=null){
        System.out.println(temp.val);
        temp = temp.next;
    }
    }
}