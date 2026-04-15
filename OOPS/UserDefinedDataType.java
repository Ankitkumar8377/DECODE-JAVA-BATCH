class Student { // user-defined data type
    String name;
    int age;
    double marks;
}

public class UserDefinedDataType {
    public static void main(String[] args) {
        Student s = new Student(); // variable of user-defined type
        s.name = "Ankit";
        s.age = 20;
        s.marks = 85.5;
        System.out.println(s.name + " "+s.age+" "+s.marks);
    }
}
