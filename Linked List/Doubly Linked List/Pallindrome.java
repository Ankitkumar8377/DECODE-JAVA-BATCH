//Check Doubly LL is palindrome or not

class dNode {
    int val;
    dNode next;
    dNode prev;

    dNode(int val) {
        this.val = val;
    }
}

public class Pallindrome {
    public static boolean isPalindrome(dNode head, dNode tail) {
        if (head == null) return true;

        dNode left = head;
        dNode right = tail;

        while (left != right && right.next != left) {
            if (left.val != right.val) {
                return false;
            }
            left = left.next;
            right = right.prev;
        }
        return true;
    }

    public static void main(String[] args) {
        dNode a = new dNode(1);
        dNode b = new dNode(2);
        dNode c = new dNode(3);
        dNode d = new dNode(2);
        dNode e = new dNode(1);

        a.next = b;
        b.prev = a;

        b.next = c;
        c.prev = b;
        
        c.next = d;
        d.prev = c;

        d.next = e;
        e.prev = d;

        // Check palindrome
        if (isPalindrome(a,e)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}