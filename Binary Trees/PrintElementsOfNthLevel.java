import java.util.*;
class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}
public class PrintElementsOfNthLevel {
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node a = new Node(1); // a is the root
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g; 
 
        System.out.print("Enter n : ");
        n = sc.nextInt();
        nThLevel(a, 0);
    }
    private static void nThLevel(Node root, int level) {
        if (root == null) return;
        if (level == n) System.out.print(root.val + " ");
        nThLevel(root.left, level + 1);
        nThLevel(root.right, level + 1);
}
}
