
/**
 * Write a description of class CoininJar here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class CoininJar
{
    public static void main(String[] args);
    {
        Scanner coins = new Scanner(System.in);
        System.out.println("Enter numbers of quarters");
        int quarters= coins.nextInt();
        Systen.out.println("Enter numbers of dimes");
        int dimes= coins.nextInt();
        System.out.println("Enter number of nickels");
        int nickels= coins.nextInt();
        Systen.out.println("Enter number of pennies");
        int pennies= coins.nextInt();
        
        double money= 0.25*quarters+0.1*dimes+0.05*nickels+0.01*pennies;
        System.out.println("You have: $"+money);
    }
        
}
