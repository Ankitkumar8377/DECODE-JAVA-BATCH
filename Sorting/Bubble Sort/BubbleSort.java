//1. Bubble Sort - 1 (Worst Case - Kyuki isme haam har element ko check karenge)

// public class BubbleSort {
//     public static void print(int[] arr) {
//         for (int i : arr) {
//             System.out.print(i + " ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         int[] arr = { 5, 6, 1, -3, 8, 10 };
//         int n = arr.length;
//         print(arr);

//         // Bubble Sort
//         for (int x = 1; x <= n - 1; x++) { // n-1 passes
//             for (int i = 0; i < n - 1; i++) {
//                 if (arr[i] > arr[i + 1]) {
//                     int temp = arr[i];
//                     arr[i] = arr[i + 1];
//                     arr[i + 1] = temp;
//                 }
//             }
//         }

//         print(arr);
//     }
// }



//2. Bubble Sort - 2 (Average Case -Kyuki isme haam har pass ke baad last element kar ko check nhi karenge kyuki wo sort ho chuka hai)

public class BubbleSort {
    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 5, 6, 1, -3, 8, 10 };
        int n = arr.length;
        print(arr);

        // Bubble Sort
        for (int x = 0; x <= n - 1; x++) { // n-1 passes
            for (int i = 0; i < n - 1 - x; i++) { //n-1-x isliye kiya hai kyuki isme har pass ke baad last element ko check nhi karenge kyuki wo sort ho chuka hai
    
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

        print(arr);
    }
}



// //3. Bubble Sort - 3 (Optimised)

// public class BubbleSort {
//     public static void print(int[] arr) {
//         for (int i : arr) {
//             System.out.print(i + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int[] arr = { 5, 6, 1, -3, 8, 10 };
//         int n = arr.length;
//         print(arr);

//         // Bubble Sort
//         for (int x = 0; x < n - 1; x++) { // n-1 passes
//             for (int i = 0; i < n - 1 - x; i++) {
//                 if (arr[i] > arr[i + 1]) {
//                     int temp = arr[i];
//                     arr[i] = arr[i + 1];
//                     arr[i + 1] = temp;
//                 }
//             }

//             // check if this pass has sorted or not
//             boolean flag = true;
//             for (int i = 0; i < n - 1 - x; i++) {
//                 if (arr[i] > arr[i + 1]) {
//                     flag = false;
//                     break;
//                 }
//             }
//             if (flag == true)
//                 break;
//         }

//         print(arr);
//     }
// }


//4. Bubble Sort - 4 (Optimised - Same code but concised)

// public class BubbleSort {
//     public static void print(int[] arr) {
//         for (int i : arr) {
//             System.out.print(i + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int[] arr = { 5, 6, 1, -3, 8, 10 };
//         int n = arr.length;
//         print(arr);

//         // Bubble Sort
//         for(int x=0;x<n-1;x++){ // n-1 passes
//         boolean flag = true;
//         for(int i=0;i<n-1-x;i++){
//             if(arr[i] > arr[i + 1]){
//                 int temp = arr[i];
//                 arr[i] = arr[i + 1];
//                 arr[i + 1] = temp;
//                 flag = false;
//             }
//         }
//         if(flag==true) break;
//         }
//         print(arr);
//     }
// }
