public class Equals {
    public static void main(String[] args) {
        String s = "abcxyz";
        //String t = "abcxyz"; //t is pointing value of s
        String t = "abc";
        t = t + "xyz"; //New string has been created
        System.out.println(s);
        System.out.println(t);
        System.out.println(s == t); //false 
        System.out.println(s.equals(t)); //Every character will be checked and it gives boolean result
        //OR
        System.out.println(s.compareTo(t)); //It gives integer result
    }
}
