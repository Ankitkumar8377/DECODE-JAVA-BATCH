public class InsertAndDelete {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abcdef");
        System.out.println(sb);
        sb.deleteCharAt(3);
        System.out.println(sb); // abcef
        sb.append("xyz");
        System.out.println(sb); // abcefxuz , cefx (2,5)
        sb.delete(2,6); // deletes characters from 2 to 5
        System.out.println(sb); // abyz

        
        sb.insert(2, "svg");
        System.out.println(sb);
        sb.insert(2, true);
        System.out.println(sb);
        sb.insert(2, 63);
        System.out.println(sb);

        sb.reverse();  //Reversing the string
        System.out.println(sb);

        // sb.reverse(2,5); //Not Valid


    }
}
