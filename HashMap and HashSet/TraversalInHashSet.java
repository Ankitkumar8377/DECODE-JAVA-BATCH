//1. Using for-each loop

// import java.util.HashSet;

// public class TraversalInHashSet {
//     public static void main(String[] args) {
//         HashSet<Integer> set = new HashSet<>();
//         set.add(10);
//         set.add(20);
//         set.add(30);
//         for (int x : set) {
//             System.out.println(x);
//         }
//     }
// }

//2. Using iterator

import java.util.*;

public class TraversalInHashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
