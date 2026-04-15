//1. Sorting from start


// public class MergeTwoSortedArray {
//     public static void main(String[] args) {
//         int[] arr = {10,20,30,40,50,60,70,80};
//         int n1 = arr.length;
//         int[] brr = {15,25,35,45,55,65,75,85};
//         int n2 = brr.length;
//         int[] crr = new int[n1+n2];
//         int i = 0,j=0,k=0;
//         while (i < n1 && j < n2){
//             if(arr[i]<=brr[j]){
//                 crr[k] = arr[i];
//                 i++;
//                 k++;
//             }else{
//                 crr[k] = brr[j];
//                 j++;
//                 k++;
//             }
//         }

//         while (i < n1) { //Ye hamane issi liye likha hai ki agar first array ke elements khatam ho jaye aur second array ke element jo bach jayenge wo usme copy ho jayenge
//             crr[k] = arr[i];
//             k++;
//             i++;
//         }

//         while (j < n2) { //Ye hamane issi liye likha hai ki agar first array ke elements khatam ho jaye aur second array ke element jo bach jayenge wo usme copy ho jayenge
//             crr[k] = brr[j];
//             k++;
//             j++;
//         }
//         for (int nums : crr) {
//             System.out.print(nums + " ");
            
//         }
//     }
// }


//2. Sorting from reverse

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80 };
        int n1 = arr.length;
        int[] brr = { 15, 25, 35, 45, 55, 65, 75, 85 };
        int n2 = brr.length;
        int[] crr = new int[n1 + n2];
        int i = n1-1;
        int j = n2-1;
        int k = n1+n2-1;
        while (i >= 0 && j >= 0){
            if (arr[i] <= brr[j]) {
                crr[k] = arr[i];
                i--;
                k--;
            } else {
                crr[k] = brr[j];
                j--;
                k--;
            }
        }

        while (i >=0) { 
            crr[k] = arr[i];
            k--;
            i--;
        }

        while (j >=0) { 
            crr[k] = brr[j];
            k--;
            j--;
        }
        for (int nums : crr) {
            System.out.print(nums + " ");

        }
    }
}


