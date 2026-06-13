import java.util.Stack;

public class BasicStackImplementation {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>(); 
        st.push("Ankit");
        st.push("Preet");
        st.push("Rishika");
        st.push("Ishant");
        st.push("Prayas");
        System.out.println(st.size());
        System.out.println(st); // A.S. = O(n)
        st.pop();
        System.out.println(st + " " + st.size());
        System.out.println(st.peek());
        System.out.println(st.pop()); // It returns the topmost element and then removes it
    }
}
