//1. Iterative

// class Node {
//     int val;
//     Node left, right;
//     Node(int val) {
//         this.val = val;
//     }
// }

// public class MaximumElementInBST {
//     public  static int findMax(Node root) {
//         if (root == null) {
//             throw new IllegalArgumentException("Tree is empty");
//         }
//         while (root.right != null) {
//             root = root.right;
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
//         System.out.println("Maximum Element = " + findMax(root));
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

public class MaximumElementInBST {

    public static int findMax(Node root) {

        if (root == null) {
            throw new IllegalArgumentException("Tree is empty");
        }

        if (root.right == null) {
            return root.val;
        }

        return findMax(root.right);
    }

    public static void main(String[] args) {

        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(80);

        System.out.println("Maximum Element = " + findMax(root));
    }
}