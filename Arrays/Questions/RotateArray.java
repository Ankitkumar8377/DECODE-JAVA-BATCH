//With using extra array

// import java.util.Scanner;
// public class RotateArray {
//     public static void rightRotate(int[] arr, int d) {
//         int n = arr.length;
//         d = d % n; // handle if d > n

//         // Create a temporary array
//         int[] temp = new int[n];

//         // Copy last d elements to the front
//         for (int i = 0; i < d; i++) {
//             temp[i] = arr[n - d + i];
//         }

//         // Copy first n-d elements after them
//         for (int i = 0; i < n - d; i++) {
//             temp[d + i] = arr[i];
//         }

//         // Copy back to original array
//         for (int i = 0; i < n; i++) {
//             arr[i] = temp[i];
//         }
//     }

//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5, 6, 7};
//         int d = 2; // rotate by 2
//         rightRotate(arr, d);

//         // Print rotated array
//         for (int num : arr) {
//             System.out.print(num + " ");
        
//     }
// }

// }

//Without extra array

public class RotateArray {
    public void reverse(int[] nums, int i, int j) {
        while (i <= j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n - k - 1);
        reverse(nums, n - k, n - 1);
        reverse(nums, 0, n - 1);
    }
}
