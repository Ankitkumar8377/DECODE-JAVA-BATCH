public class PassingArrayToMethod {
    public static void main(String[] args) {
    int[] arr = {10, 20, 30, 40};
    System.out.println(arr[0]);
    change(arr); //Pass By Reference
    System.out.println(arr[0]);
}

public static void change(int[] x) {
    x[0] = 90;
}
    
}
