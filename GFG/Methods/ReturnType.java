public class ReturnType {
    public static int prasun() {
        System.out.println("banu");
        System.out.println("Nanda");
        return 5; //Value of int and it breaks this method
    }

    public static void main(String[] args) {
        System.out.println(3 + prasun()); // Isme haam method ko call aur uski value print bhi karenge
        //prasun() //Isme bas haam method ko call karenge
    }
}
