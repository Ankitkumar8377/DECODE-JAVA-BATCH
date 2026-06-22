import java.util.HashSet;

public class HashSetSTL{
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        //OR Set<Integer> set = new HashSet<>();
        set.add(77);
        set.add(65);
        set.add(21); 
        set.add(2);
        set.add(11);
        set.add(45);
        set.add(3);
        set.add(21);
        System.out.println(set.size());
        System.out.println(set);
        System.out.println(set.contains(65));
        set.remove(21);
        System.out.println(set.contains(21));
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        set.clear();
        System.out.println(set);
        System.out.println(set.isEmpty());
    }
}
