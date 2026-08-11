//1.Brute Force — Selection Sort for K passes

// public class KthSmallestElementInArray {
//     public static int kthSmallest(int[] arr, int k) {
//         for (int i = 0; i < k; i++) {
//             int minIndex = i;
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[j] < arr[minIndex]) {
//                     minIndex = j;
//                 }
//             }
//             // swap
//             int temp = arr[i];
//             arr[i] = arr[minIndex];
//             arr[minIndex] = temp;
//         }
//         return arr[k - 1];
//     }
//     public static void main(String[] args) {
//         int[] arr = {10, 2, 3, 8, -4, -2, 6};
//         int k = 3;
//         System.out.println(kthSmallest(arr, k));
//     }
// }

//2. BuiltIn Sorting Method 

import java.util.Arrays;

public class KthSmallestElementInArray {

    public static void main(String[] args) {
        int[] arr = {10, 2, 3, 8, -4, -2, 6};
        int k = 3;
        Arrays.sort(arr);
        System.out.println(arr[k - 1]);
    }
}

//3. MinHeap

// import java.util.PriorityQueue;

// public class KthSmallestElementInArray {
//     public static void main(String[] args) {
//         int[] arr = {10, 2, 8, 3, -6, -2, 9, -12};
//         int k = 2;
//         PriorityQueue<Integer> pq = new PriorityQueue<>();
//         for (int ele : arr) {
//             pq.add(ele);
//         }
//         for (int i = 1; i <= k - 1; i++) {
//             pq.remove();
//         }
//         System.out.println(pq.peek());
//     }
// }


//4. MaxHeap

// import java.util.PriorityQueue;
// import java.util.Collections;

// public class KthSmallestElementInArray {
//     public static void main(String[] args) {
//         int[] arr = {10, 2, 8, 3, -6, -2, 9, -12};
//         int k = 3;
//         PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
//         for (int ele : arr) {
//             pq.add(ele);
//             if (pq.size() > k) pq.remove();
//         }
//         System.out.println(pq.peek());
//     }
// }