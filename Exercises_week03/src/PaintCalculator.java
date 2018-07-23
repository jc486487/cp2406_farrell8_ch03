import java.util.Scanner;

public class PaintCalculator
{
    public static void main (String[] args)
    {
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Enter the length of the rectangular room: ");
        double length = inputDevice.nextDouble();

        System.out.println("Enter the width of the rectangular room: ");
        double width = inputDevice.nextDouble();

        System.out.println("Enter the height of the rectangular room: ");
        double height = inputDevice.nextDouble();

        int cost = calculator(length, width, height);

        System.out.println("The cost to paint a " + length + "-by-" + width + " foot room with a " + height + "-foot ceiling" +
                "is $" + cost);
    }

    public static int calculator(double l, double w, double h)
    {
        double area = (l*w) + (2*l*h) + (2*w*h);

        int gallons = gallonsOfPaint(area);
        System.out.println("The number of gallons needed are: " + gallons);

        int total_cost = gallons * 32;

        return total_cost;
    }

    public static int gallonsOfPaint(double area)
    {
        double sqFeet = 350;
        double gallon = area/sqFeet;
        int gallons = (int) gallon;

        return gallons;
    }
}
