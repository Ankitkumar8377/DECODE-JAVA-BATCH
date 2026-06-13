import java.util.*;

public class ImplementationOfDeque {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(1);
        dq.addLast(4);
        System.out.println(dq);
        dq.addFirst(5);
        System.out.println(dq);
        dq.removeLast();
        System.out.println(dq);
        dq.removeFirst();
        System.out.println(dq);
        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());
        dq.add(5);      // adds element at the rear (same as addLast)
        dq.remove();    // removes element from the front (same as removeFirst)
        System.out.println(dq);
        // dq.removeAll(dq);  // removes everything
        //dq.removeFirstOccurrence(1); //Remove first occurence of 1
        dq.removeLastOccurrence(1); //Remove last occurence of 1
        System.out.println(dq);
    }
}
