class Calculator
{
    int a;
    int b;
    int res;

    int add()    // Called Method
    {
        a = 10;
        b = 20;
        res = a + b;
        return res;
    }
}

public class NoInputYesOutput{
    public static void main(String[] args)   // Calling Method
    {
        Calculator calc = new Calculator();
        int sum = calc.add();
        System.out.println(sum);
    }
}