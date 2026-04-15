class Cricketer {
    final String country = "India";
    int runs;
    String name;
    double avg;
}
public class FinalKeyword {
    public static void main(String[] args) {

    Cricketer c1 = new Cricketer();
    // c1.country = "England"; // Error (country is final and cannot be changed)

    System.out.println(c1.country);

    Cricketer c2 = new Cricketer();
    System.out.println(c2.country);
    }
}