//This class is example of encapsulation
class Students {
    String name; // null
    private int rno; // 0
    double cgpa; // 0.0
    void print(){
        System.out.println(name+" "+rno+" "+ cgpa);
    }
//Getter and Setter used for private attributes
    int getRno() { // getter
        return rno;
    }

    void setRno(int x) { //setter
        rno = x;
    }
}
public class PrivateKeyword {
    public static void main(String[] args) {
        Students s1 = new Students();
        // System.out.println(s1.rno); //Unable to access due to we are in new class
        s1.print();
        s1.cgpa = 8.9;
        s1.name = "Hemant";
        // s1.rno = 76; //Unable to access due to we are in new class
        // s1.rno = 45; error
        s1.setRno(45);
        s1.print();
        
    }
}

