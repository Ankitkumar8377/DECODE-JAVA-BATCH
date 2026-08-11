//1. Left to Right Traversal

// import java.util.LinkedList;
// import java.util.Queue;

// class Node{
//     int val;
//     Node left;
//     Node right;
//     Node(int val){
//         this.val = val;
//     }
// }
// public class LevelOrderTraversal {
//     public static void main(String[] args) {
//         Node a = new Node(1); // a is the root
//         Node b = new Node(2);
//         Node c = new Node(3);
//         Node d = new Node(4);
//         Node e = new Node(5);
//         Node f = new Node(6);
//         Node g = new Node(7);

//         a.left = b; a.right = c;
//         b.left = d; b.right = e;
//         c.left = f; c.right = g; 

//         levelOrder(a);
//         System.out.println();
//     }
//     private static void levelOrder(Node root) {
//         Queue<Node> q = new LinkedList<>();
//         if (root != null) q.add(root);
//         while (q.size() > 0) {
//             Node front = q.remove();
//             System.out.print(front.val + " ");
//             if (front.left != null) q.add(front.left);
//             if (front.right != null) q.add(front.right);
//         }
//     }
// }


//2. Right to Left Traversal


// import java.util.LinkedList;
// import java.util.Queue;

// class Node{
//     int val;
//     Node left;
//     Node right;
//     Node(int val){
//         this.val = val;
//     }
// }
// public class LevelOrderTraversal {
//     public static void main(String[] args) {
//         Node a = new Node(1); // a is the root
//         Node b = new Node(2);
//         Node c = new Node(3);
//         Node d = new Node(4);
//         Node e = new Node(5);
//         Node f = new Node(6);
//         Node g = new Node(7);

//         a.left = b; a.right = c;
//         b.left = d; b.right = e;
//         c.left = f; c.right = g; 

//         levelOrder(a);
//         System.out.println();
//     }
//     private static void levelOrder(Node root) {
//         Queue<Node> q = new LinkedList<>();
//         if (root != null) q.add(root);
//         while (q.size() > 0) {
//             Node front = q.remove();
//             System.out.print(front.val + " ");
//             if (front.right != null) q.add(front.right);
//             if (front.left != null) q.add(front.left);
//         }
//     }
// }


//3. Without Queue Left To Right


// import java.util.LinkedList;
// import java.util.Queue;
// import java.util.Scanner;

// class Node{
//     int val;
//     Node left;
//     Node right;
//     Node(int val){
//         this.val = val;
//     }
// }
// public class LevelOrderTraversal {
//     static int n;
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         Node a = new Node(1); // a is the root
//         Node b = new Node(2);
//         Node c = new Node(3);
//         Node d = new Node(4);
//         Node e = new Node(5);
//         Node f = new Node(6);
//         Node g = new Node(7);

//         a.left = b; a.right = c;
//         b.left = d; b.right = e;
//         c.left = f; c.right = g; 

//         for (int x = 0; x <= 3; x++) {
//             n = x;
//             nThLevel(a, 0);
//             System.out.println();
//         }
//     }
//     private static void nThLevel(Node root, int level) {
//         if (root == null) return;
//         if (level == n) System.out.print(root.val + " ");
//         nThLevel(root.left, level + 1);
//         nThLevel(root.right, level + 1);
//     }
// }


//4. Without Queue Right To Left


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}
public class LevelOrderTraversal {
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

        for (int x = 0; x <= 3; x++) {
            n = x;
            nThLevel(a, 0);
            System.out.println();
        }
    }
    private static void nThLevel(Node root, int level) {
        if (root == null) return;
        if (level == n) System.out.print(root.val + " ");
        nThLevel(root.right, level + 1);
        nThLevel(root.left, level + 1);
    }
}
