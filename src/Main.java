import  java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Введите два числа: ");
        int a = kb.nextInt();
        int b = kb.nextInt();

        int c = Math.Sum(a, b);
        System.out.println("%d + %d = %d". formatted(a, b, c));
        System.out.println("%d - %d = %d". formatted(a, b, Math.Diff(a, b)));
        System.out.println("%d * %d = %d". formatted(a, b, Math.Prod(a, b)));
        System.out.println("%d / %d = %f". formatted(a, b, Math.Quot(a, b)));
        System.out.println("%d! = %d\n".   formatted(a, Math.Fact(a)));
        System.out.println("%d ^ %d = %d". formatted(a, b, Math.Pow(a, b)));
    }
}
class Math
{
    static int Sum(int a, int b)
    {
        // Sum - сумма
        int c = a + b;
        return c;
    }
    static int Diff(int a, int b)
    {
        // Difference - Разность
        return a - b;
    }
    static int Prod(int a, int b)
    {
        // Product - Произвдение
        return a * b;
    }
    static double Quot(int a, int b)
    {
        // Quotient - Частное
        return (double)a / b;
    }
    static int Fact(int a)
    {
        if (a == 1)
        {
            return 1;
        }
            return a * Fact(a - 1);
    }
    static int Pow(int a, int b)
    {
        if ( b == 0)
            return 1;

        if ( b == 1)
            return a;

          return Pow ( a * a, b/2);

    }
}