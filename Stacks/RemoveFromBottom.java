import java.util.Stack;

public class RemoveFromBottom {
    public static void removeBottom(Stack<Integer> st) {
        Stack<Integer> temp = new Stack<>();

        // Move all except last element
        while (st.size() > 1) {
            temp.push(st.pop());
        }

        // Remove bottom element
        st.pop();

        // Restore stack
        while (!temp.isEmpty()) {
            st.push(temp.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        removeBottom(st);
        System.out.println(st); // [20, 30, 40]
    }
}
