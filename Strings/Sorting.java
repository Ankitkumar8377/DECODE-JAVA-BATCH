//1. Sorting by converting string into Array

// import java.util.Arrays;

// public class Sorting {
//     public static void main(String[] args) {
//         String s = "raghav";
//         char[] ch = s.toCharArray();
//         for (char ele : ch) {
//         System.out.print(ele);
//     }

//     System.out.println();
//     Arrays.sort(ch);
//         for (char ele : ch) {
//             System.out.print(ele);
//     }

//     System.out.println();
//     }
// }


//2. Sorting by converting stringBuilder into String then into Array

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("garg");
        // String s = sb.toString(); //Conversion of StringBuilder into String
        // char[] ch = s.toCharArray(); // Conversion of String into CharacterArray

        //OR
        char[] ch = sb.toString().toCharArray(); //Direct Conversion from StringBuilder to Array
        for (char ele : ch) {
            System.out.print(ele);
        }

        System.out.println();
        Arrays.sort(ch);
        for (char ele : ch) {
            System.out.print(ele);
        }

        System.out.println();
    }
}
