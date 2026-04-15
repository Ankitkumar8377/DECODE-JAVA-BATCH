public class MethodOverLoading {
    public static void main(String[] args) {
        Greet G1 = new Greet();
        G1.greetings();
        G1.greetings("Ankit Kumar");
        G1.greetings("Ankit Kumar",10);
    }
}

class Greet{
    String name;
    void greetings(){
        System.out.println("Hello, Good Morning");
    }

    void greetings(String name){
        System.out.println("Hello "+ name + " ,Good Morning");
    }

    void greetings(String name,int count){
        for (int i = 0; i < count; i++) {
            System.out.println("Hello "+ name + " ,Good Morning");
        }
        
    }

}
