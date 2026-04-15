class Calculator
{
    int res;

    void add(int x, int y)   // Formal Parameters (or) Parameters
    {
        res = x + y;
        System.out.println(res);
    }
}

public class YesInputNoOutput
{
    public static void main(String[] args)
    {
        Calculator calc = new Calculator();
        int a = 10;
        int b = 20;
        calc.add(a, b);   // Actual Parameters (or) Arguments
    }
}
