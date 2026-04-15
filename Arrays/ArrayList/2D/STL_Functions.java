import java.util.*;
public class STL_Functions {
    public static void main(String[] args) {
        // Creating a 2D ArrayList (ArrayList of ArrayList of Integers)
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        // Adding rows
        ArrayList<Integer> row1 = new ArrayList<>();
        row1.add(10);
        row1.add(20);
        row1.add(30);

        ArrayList<Integer> row2 = new ArrayList<>();
        row2.add(40);
        row2.add(50);
        row2.add(60);

        matrix.add(row1);  // add row1
        matrix.add(row2);  // add row2

        // Print 2D ArrayList
        System.out.println("Matrix: " + matrix);

        // get() -> get element at [row][col]
        System.out.println("Element at (0,1): " + matrix.get(0).get(1)); // 20

        // size() -> total rows
        System.out.println("Number of rows: " + matrix.size());
        System.out.println("Row 0 size: " + matrix.get(0).size());

        // contains()
        System.out.println("Row1 contains 20? " + matrix.get(0).contains(20));

        // indexOf()
        System.out.println("Index of 50 in row2: " + matrix.get(1).indexOf(50));

        // remove() -> remove element
        matrix.get(0).remove(Integer.valueOf(20));   // removes 20 from first row
        System.out.println("After removing 20: " + matrix);

        // isEmpty()
        System.out.println("Is row2 empty? " + matrix.get(1).isEmpty());

        // toArray()
        Object[] arr = matrix.get(0).toArray();
        System.out.print("Row1 as Array: ");
        for (Object obj : arr) {
            System.out.print(obj + " ");
        }
        System.out.println();

        // clear() -> clears entire row
        matrix.get(1).clear();
        System.out.println("After clearing row2: " + matrix);

        // Traversing full 2D ArrayList like a matrix
        System.out.println("Matrix elements row by row:");
        for (ArrayList<Integer> row : matrix) {
            for (Integer val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}


