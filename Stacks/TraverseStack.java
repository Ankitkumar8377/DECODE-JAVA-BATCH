//1.Traversing without modifying the stack 

// import java.util.Stack;

// public class TraverseStack {
//     public static void main(String[] args) {
//         Stack<Integer> st = new Stack<>();
//         st.push(10);
//         st.push(20);
//         st.push(30);

//         for (int i = st.size() - 1; i >= 0; i--) {
//             System.out.print(st.get(i)+" ");
//         }
//     }
// }


//2. Traversing Using Temporary Stack

import java.util.Stack;

public class TraverseStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println("Original Stack: " + st);
        Stack<Integer> temp = new Stack<>();
        // Traversing while saving elements
        System.out.println("Traversing:");
        while (!st.isEmpty()) {
            int val = st.pop();
            System.out.println(val);
            temp.push(val);
        }
        // Restoring original stack
        while (!temp.isEmpty()) {
            st.push(temp.pop());
        }
        System.out.println("Stack after traversal: " + st);
    }
}