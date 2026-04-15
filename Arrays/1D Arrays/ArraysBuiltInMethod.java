import java.util.Arrays;
public class ArraysBuiltInMethod {
    public static void main(String[] args) {
        int[] arr={50,60,40,70,10,80,45};
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i]+" ");
        // }
        // OR for each loop
        for (int element : arr) {
            System.out.print(element+" ");
        }
        System.out.println();
        Arrays.sort(arr);  //Built-In Method for sorting the arrays
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
