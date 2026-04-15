public class StringBuilderinJAVA {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");
        System.out.println(sb.length());

        StringBuilder x = new StringBuilder("");
        System.out.println(x.length());

        StringBuilder a = new StringBuilder("");
        System.out.println(a.capacity()); //By default, StringBuilder ki capacity 16 hoti hai

        StringBuilder b = new StringBuilder("3");
        System.out.println(b.capacity()); // StringBuilder ki capacity 19 hai ab

        StringBuilder c = new StringBuilder(7);
        System.out.println(c.capacity()); // StringBuilder ki capacity 7 hai ab
    }
}
