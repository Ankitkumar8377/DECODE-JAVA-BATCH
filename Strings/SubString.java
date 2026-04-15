public class SubString {
    public static void main(String[] args) {
        String s = "abcde";
        System.out.println(s.substring(1)); // bcde
        System.out.println(s.substring(1, 4)); // bcd
        System.out.println(s.substring(2, 2)); // Prints an empty string.

    // print all substrings
    for(int i=0; i<s.length(); i++){
        for(int j=i+1; j<=5; j++){
            System.out.print(s.substring(i, j) + " ");
        }
    System.out.println();
    }
    }
}
