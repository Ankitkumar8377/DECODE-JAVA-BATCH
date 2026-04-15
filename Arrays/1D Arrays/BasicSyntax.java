public class BasicSyntax {
    public static void main(String[] args) {
        //int[] arr = new int[5];
        //OR
        int[] arr; //Declaration
        arr = new int[5]; //Memory Allocation
    //Initialising individual Elements
        arr[0]=54;
        arr[1]=58;
        arr[2]=89;
        arr[3]=45;
        arr[4]=12;

    //Output of Arrays
        System.out.println(arr[0]);
    
    //Updation in Values
        arr[0]=78;
        System.out.println(arr[0]);
    }
}