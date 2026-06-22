import java.util.HashMap;

public class TraversalInHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Raghav", 25);
        map.put("Abhinav", 35);
        map.put("Vivek", 17);
        map.put("Deepika", 19);
        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }
}
