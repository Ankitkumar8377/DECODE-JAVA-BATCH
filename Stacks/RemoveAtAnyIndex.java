import java.util.Stack;

public class RemoveAtAnyIndex {
    public static void removeAtIndex(Stack<Integer> st, int index) {
        Stack<Integer> temp = new Stack<>();

        // Move elements until index
        for (int i = 0; i < index; i++) {
            temp.push(st.pop());
        }

        // Remove target element
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

        removeAtIndex(st, 2); // removes 20
        System.out.println(st); // [10, 30, 40]
    }
}
