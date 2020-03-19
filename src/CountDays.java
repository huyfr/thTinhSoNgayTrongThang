import java.util.Scanner;

public class CountDays
{
    public static void main(String[] args)
    {
        int month;
        String daysInMonth;

        System.out.println("Which month that you want to count days?");

        Scanner number=new Scanner(System.in);
        month=number.nextInt();

        switch (month)
        {
            case 2:
                daysInMonth="28 or 29 days";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth="31 days";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth="30 days";
                break;
            default:
                daysInMonth="none";
                break;
        }
        if (daysInMonth != "none")
        {
            System.out.println("The month: "+month+" has "+daysInMonth);
        }
        else
        {
            System.out.println("No value!");
        }
    }
}
