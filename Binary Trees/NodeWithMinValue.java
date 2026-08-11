class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}
public class NodeWithMinValue {
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
      
        System.out.println(min(a));
    }
    
    private static int min(Node root) {
        if (root == null) return Integer.MAX_VALUE;
        int a = root.val;
        int b = min(root.left);
        int c = min(root.right);
        return Math.min(a, Math.min(b, c));
    }
}



