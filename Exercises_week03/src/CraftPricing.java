import java.util.Scanner;

public class CraftPricing
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the product (Example: \"woven purse\"): ");
        String nameProduct = input.nextLine();

        System.out.println("Enter the cost of materials: ");
        int cost_materials = input.nextInt();

        System.out.println("Enter the number of hours required: ");
        int hours = input.nextInt();

        int price = retailPrice(cost_materials, hours);
        System.out.println("The retail price for " + nameProduct + " = $" + price);
    }

    public static int retailPrice(int costMat, int hours)
    {
        int price = ((costMat+12)*hours)+7;

        return price;
    }
}
