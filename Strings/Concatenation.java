public class Concatenation {
    public static void main(String[] args) {
        String a = "abc",b = "xyz";
        // a.concat(b); -> nothing
        System.out.println(a.concat(b));
        System.out.println(a);
        a = a.concat(b);
        System.out.println(a);
    }
}
