import java.util.ArrayList;

public class ArrayListImplementationOfStack{
    public static class myStack {
        ArrayList<Integer> arr = new ArrayList<>();

        void push(int x) {
            arr.add(x);
        }

        int pop() {
            if (arr.isEmpty()) {
                System.out.println("Stack Underflow");
                return -1;
            }
            int val = arr.get(arr.size() - 1);
            arr.remove(arr.size() - 1);
            return val;
        }

        int peek() {
            if (arr.isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }
            return arr.get(arr.size() - 1);
        }

        boolean isEmpty() {
            return arr.isEmpty();
        }

        int size() {
            return arr.size();
        }
    }

    public static void main(String[] args) {
        myStack st = new myStack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
        System.out.println(st.size());
    }

}