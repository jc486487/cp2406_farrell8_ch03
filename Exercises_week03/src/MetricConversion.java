import java.util.Scanner;

public class MetricConversion
{
    public static void main(String[] args)
    {
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int value = inputDevice.nextInt();

        inchesToCM(value);
        gallonsToLitres(value);

    }
    private static void inchesToCM (int value)
    {
        double CMS = 2.54;
        System.out.println("Assuming that the value entered was in inches, the same value in centimeters =  " + (value*CMS));
    }

    private static void gallonsToLitres(int value)
    {
        double LITRES = 3.7854;
        System.out.println("Assuming that the value entered was in gallons, the same value in litres =  " + (value*LITRES));
    }
}
