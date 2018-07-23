import java.util.Scanner;

public class Insurance
{
    public static void main(String[] args)
    {
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Enter the current year: ");
        int year = inputDevice.nextInt();

        System.out.println("Enter the year you were born: ");
        int dob = inputDevice.nextInt();

        int pay = calculatePay(year, dob);

        System.out.println("Your Annual Policy Premium = $" + pay);
    }

    public static int calculatePay(int year, int dob)
    {
        int age = year - dob;

        int decades = age/10;

        int pay = (decades+15) * 20;

        return pay;
    }
}
