class Person {
    private int age;
    private String name;

    public void setAge(int age) { //Setter 
        this.age = age;
    }

    public int getAge() { //Getter
        return age;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Person P1 = new Person();
        P1.setAge(20);

        System.out.println(P1.getAge());
    }
    
}
