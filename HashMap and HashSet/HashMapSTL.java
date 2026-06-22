import java.util.HashMap;

public class HashMapSTL{
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Raghav", 25);
        map.put("Abhinav", 35);
        map.put("Vivek", 17);
        map.put("Deepika", 19);
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.containsValue(19));
        System.out.println(map.containsKey("Vivek"));
        System.out.println(map.get("Raghav"));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.remove("Vivek"));
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.containsKey("Vivek"));
        map.put("Deepika", 20);
        System.out.println(map);
        System.out.println(map.isEmpty());
    }
}