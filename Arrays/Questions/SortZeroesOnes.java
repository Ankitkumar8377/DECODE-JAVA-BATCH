//1. Two Pass Solution

// public class SortZeroesOnes {
//     public static void main(String[] args){
//         int[] arr ={1,0,1,0,1,0,0,0,1,0,1,0,1,0,1,0};
//         int n=arr.length;
//         int[] temp = new int[n];
//         int NoOfZeroes = 0;
//         int NoOfOnes = 0;
//         for(int i=0;i<n;i++){
//             if(arr[i]==0){
//                 temp[NoOfZeroes]=arr[i];
//                 NoOfZeroes++;
//             }else{
//                 temp[n-1-NoOfOnes]=arr[i];
//                 NoOfOnes++;
//             }
//         }
//         System.out.println( NoOfZeroes + " " + NoOfOnes);
//         for (int i = 0; i < temp.length; i++) {
//             System.out.print(temp[i] + " ");
//         }
//     }
// }



//2. One Pass Solution


// public class SortZeroesOnes {
//     public static void main(String[] args){
//         int[] arr = {1, 0, 0, 1, 1, 0, 0, 0, 1, 0};
//         int n = arr.length;
//         int noOfZeroes = 0;

//     for (int i = 0; i < n; i++) {
//         if (arr[i] == 0) noOfZeroes++;
//     }

//     for (int i = 0; i < noOfZeroes; i++) {
//         arr[i] = 0;
//     }

//     for (int i = noOfZeroes; i < n; i++) {
//         arr[i] = 1;
//     }
//   }
// }


//3. Two pointer


public class SortZeroesOnes {
    public static void main(String[] args){
        int[] arr = {1, 0, 0, 1, 1, 0, 0, 0, 1, 0};
        int n = arr.length;
        int i = 0, j = n - 1;

    while(i<j){
        if (arr[i] == 0) i++;
        if (arr[j] == 1) j--;
        if(i>j) break;
    if (arr[i] == 1 && arr[j] == 0) {
        arr[i] = 0;
        arr[j] = 1;
        i++;
        j--;
        }
    }
    for (i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
        }
    }
}
