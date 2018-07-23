import java.util.Scanner;

public class BookstoreCredit
{
    public static void main(String[] args)
    {
        Scanner inputDevice = new Scanner(System.in);

        System.out.println("Enter you name: ");
        String name = inputDevice.nextLine();

        System.out.println("Enter your grade point average (GPA): ");
        double gpa = inputDevice.nextDouble();

        descriptiveMsg(name, gpa);
    }
    private static void descriptiveMsg(String name, double gpa)
    {
        System.out.println("Hi " + name + "! For your GPA of " + gpa + ", you will receive a $" + (gpa*10) + " credit.");
    }
}
