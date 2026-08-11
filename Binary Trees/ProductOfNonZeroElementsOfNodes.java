public class ProductOfNonZeroElementsOfNodes {
    public static void main(String[] args) {
        Node a = new Node(1);  // a is the root
        Node b = new Node(4);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(0);
        Node f = new Node(5);

        //Connections
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.right = f;
      
        System.out.println(product(a));
    }
    
    private static int product(Node root) {
        if (root == null) return 1;
        if (root.val == 0) return product(root.left) * product(root.right);
        return root.val * product(root.left) * product(root.right);
    }
}



