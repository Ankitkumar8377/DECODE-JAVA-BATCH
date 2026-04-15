public class InfiniteLoop {
    public static void main(String[] args) {
        // int i;
        // while (i=10) { //Error : In java, we don't assign a value in condition of while loop 
        //     System.out.println(i);
        //     i++; 
        // }

        int i = 1;
        while (i>=0) {
            System.out.println(i);
            i++;
        }
    }
}
