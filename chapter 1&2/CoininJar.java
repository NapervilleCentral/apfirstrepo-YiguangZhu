
/**
 * Write a description of class CoininJar here.
 *
 * @author (Yiguang Zhu)
 * @version (8/31/2021)
 */
import java.util.Scanner;
import java.text.NumberFormat;
public class CoininJar
{
    public static void main(String[] args)
    {
        //Asks user for 4 types of coins
        Scanner money = new Scanner(System.in);
        
        System.out.println("Enter quarters");
        int quarters= money.nextInt();
        System.out.println("Enter dimes");
        int dimes= money.nextInt();
        System.out.println("Enter nickels");
        int nickels= money.nextInt();
        System.out.println("Enter pennies");
        int pennies= money.nextInt();
        
        
        //convert the number of coins into amout of dollars with each coin value.
        double currency= 0.25*quarters+0.1*dimes+0.05*nickels+0.01*pennies;
        NumberFormat equal = NumberFormat.getCurrencyInstance();
        
        System.out.println("You have: "+equal.format(currency));
    }
        
}
