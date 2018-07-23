import java.util.Scanner;

public class NumbersDemo2
{
    public static void main(String[] args)
    {
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int a = inputDevice.nextInt();
        int b = inputDevice.nextInt();
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
