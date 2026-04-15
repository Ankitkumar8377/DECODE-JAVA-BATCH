class Calculator {
    int a;
    int b;
    int res;

    void add()     // Method Declaration
    {
        a = 10;
        b = 20;
        res = a + b;
        System.out.println(res);
    }
}

public class NoInputNoOutput
{
    public static void main(String[] args)
    {
        Calculator calc = new Calculator();
        calc.add();    // Method Call (or) Method Invocation
    }
}
