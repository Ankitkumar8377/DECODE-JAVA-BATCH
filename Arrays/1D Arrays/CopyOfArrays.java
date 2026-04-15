import java.util.Arrays;

public class CopyOfArrays {
    public static void main(String[] args) {
        int[] arr = { 50, 60, 40, 70, 10, 80, 45 };
        for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
        }
        System.out.println();
        // int[] nums=arr; //Shallow Copy(There will be no new array created,actually both arr and nums will be same array)
        // nums[0]=100;
        // System.out.println(arr[0]);

        //Method for creating a copy of arrays
        // int[] brr = Arrays.copyOf(arr, arr.length); //Deep Copy (New array will be created )
        // brr[0]=100;
        // System.out.println(arr[0]);

        //OR
        int[] crr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            crr[i] = arr[i];
        }
        crr[0] = 100;
        System.out.println(arr[0]);

    }
}
