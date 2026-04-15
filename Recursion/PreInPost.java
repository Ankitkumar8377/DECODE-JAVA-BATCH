public class PreInPost {
    public static void pip(int n) {
        if (n == 0) return;
        System.out.println("Pre "+ n); //Pre
        pip(n - 1);
        System.out.println("In "+n); //In
        pip(n - 1);
        System.out.println("Post "+n); //Post
    }
    
    public static void main(String[] args) {
        pip(3);
    }
}
