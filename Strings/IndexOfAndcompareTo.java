public class IndexOfAndcompareTo {
    public static void main(String[] args) {
//indexOf()
        String s = "Raghav Garg";
        System.out.println(s.indexOf('z')); //If element not exists then prints -1
        System.out.println(s.indexOf('a')); //Checks from front
        System.out.println(s.lastIndexOf('a')); //Checks from last

//compareTo()
        String a = "abc";
        String b = "abcgggg";
        System.out.println(a.compareTo(b));
    }
}
