import java.util.Scanner;

public class Percentages2
{
    public static void main(String[] args)
    {
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Enter 2 values: ");
        double a = inputDevice.nextDouble();
        double b = inputDevice.nextDouble();

        computePercent(a, b);
        computePercent(b, a);
    }
    private static void computePercent(double a, double b)
    {
        double percent = (a/b) * 100;
        int percents = (int) percent;
        System.out.println(a + " is " + percents + " percent of " + b);
    }
}
