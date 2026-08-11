//1. Iterative

// class Node {
//     int val;
//     Node left, right;
//     Node(int val) {
//         this.val = val;
//     }
// }

// public class MinimumElementInBST {
//     public static int findMin(Node root) {
//         if (root == null) {
//             throw new IllegalArgumentException("Tree is empty");
//         }
//         while (root.left != null) {
//             root = root.left;
//         }
//         return root.val;
//     }

//     public static void main(String[] args) {
//         Node root = new Node(50);
//         root.left = new Node(30);
//         root.right = new Node(70);
//         root.left.left = new Node(20);
//         root.left.right = new Node(40);
//         root.right.left = new Node(60);
//         root.right.right = new Node(80);
//         System.out.println("Minimum Element = " + findMin(root));
//     }
// }

//2. Recursive

class Node {
    int val;
    Node left, right;
    Node(int val) {
        this.val = val;
    }
}

public class MinimumElementInBST {
    public static int findMin(Node root) {
        if (root == null) {
            throw new IllegalArgumentException("Tree is empty");
        }
        if (root.left == null) {
            return root.val;
        }
        return findMin(root.left);
    }
    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(80);
        System.out.println("Minimum Element = " + findMin(root));
    }
}