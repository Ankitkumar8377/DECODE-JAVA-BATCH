class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}
public class LevelsOfBinaryTree {
    public static void main(String[] args) {
        Node a = new Node(1);  // a is the root
        Node b = new Node(4);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(8);
        Node f = new Node(5);

        //Connections
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.right = f;
      
        System.out.println(levels(a));
        int height = levels(a)-1;
        System.out.println(height);
    }
    
    private static int levels(Node root) {
        if (root == null) return 0;
        return 1 + Math.max(levels(root.left), levels(root.right));
    }
}



