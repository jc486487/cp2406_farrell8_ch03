public class NumbersDemo
{
    public static void main(String[] args)
    {
        int a = 5;
        int b = 7;
        displayTwiceTheNumber(a);
        displayNumberPlusFive(b);
        displayNumberSquared(a);
    }
    private static void displayTwiceTheNumber(int a)
    {
        System.out.println("Twice the number = " + (a+a));
    }
    private static void displayNumberPlusFive(int b)
    {
        System.out.println("The number plus five = " + (b + 5));
    }
    private static void displayNumberSquared(int a)
    {
        System.out.println("Square of the number = " + (a*a));
    }
}
