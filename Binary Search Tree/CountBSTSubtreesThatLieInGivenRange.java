class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
    }
}

public class CountBSTSubtreesThatLieInGivenRange {
    static int count = 0;
    static boolean countSubtrees(Node root, int low, int high) {
        // Empty subtree is valid
        if (root == null) return true;

        // Check left and right subtree
        boolean left = countSubtrees(root.left, low, high);
        boolean right = countSubtrees(root.right, low, high);

        // Current subtree is completely inside range
        if (left && right && root.data >= low && root.data <= high) {
            count++;
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(50);
        root.left.left = new Node(1);
        root.right.left = new Node(40);
        root.right.right = new Node(100);
        int low = 1;
        int high = 45;
        countSubtrees(root, low, high);
        System.out.println(count);
    }
}