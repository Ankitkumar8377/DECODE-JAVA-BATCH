public class InterningAndNext {
    public static void main(String[] args) {
//Interning is used to store the space
        String s = "Raghav";
        String q = "Raghav"; //Not new space created for it, q is pointing to s wala raghav

        // Raghav -> Madhav

        // s.charAt(0) = 'M'; Error
        // s.charAt(2) = 'd'; Error

        // s = "Madhav";

        System.out.println(s);

//New is used to make new string 
        String t = new String("Raghav");
        System.out.println(t);
    }
}
