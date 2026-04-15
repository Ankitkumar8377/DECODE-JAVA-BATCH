import java.util.ArrayList;

public class BasicsOfArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(6);
        //Initialization
        arr.add(0, 10);  // arr[0] = 10
        arr.add(1, 20);
        arr.add(2, 30);
        arr.add(3, 40);
        arr.add(4, 50);
        arr.add(5, 60);
        System.out.println(arr.size());
        System.out.println(arr);
//             OR
//     for(int i = 0; i <= arr.size(); i++) {
//         System.out.print(arr.get(i) + " "); // arr[i]
// }
        arr.set(2,300 ); //Modification of Values
        arr.add(87);//Push Back and size will be changed
        for(int i = 0; i <= arr.size(); i++) {
        System.out.print(arr.get(i) + " "); // arr[i]
        }
    }
}
