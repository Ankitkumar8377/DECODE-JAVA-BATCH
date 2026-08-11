class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}
public class SumOfTreeNodes {
    public static void main(String[] args) {
        Node a = new Node(1);  // a is the root
        Node b = new Node(4);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(6);
        Node f = new Node(5);

        //Connections
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.right = f;
      
        System.out.println(sum(a));
    }
    
    private static int sum(Node root) {
        if (root == null) return 0;
        return root.val + sum(root.left) + sum(root.right);
    }
}


