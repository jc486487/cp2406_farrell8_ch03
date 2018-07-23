public class Percentages
{
    public static void main(String[] args)
    {
        double a = 5.0;
        double b = 10.0;
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
