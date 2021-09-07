
/**
 * A random phone number generator.
 * This program generates a random phone number for the user.
 * @author (Yiguang Zhu)
 * @version (a version number or a date)
 */
import java.text.DecimalFormat;
import java.util.Random;
public class RandomPhone
{
   public static void main(String[] args)
   {
       //generating a random number.
       Random rm = new Random(); 
       
       //To generate a random number of first 3 digit not containing 8 or 9.
       int x = (rm.nextInt(8) * 100) + (rm.nextInt(8) * 10) + rm.nextInt(8);
       
       //Sets the bound of 743 for the next 3 numbers.
       int y = rm.nextInt(743);
       
       //Sets the bound of 10000 for all of the numbers
       int z = (int)(Math.random()*(10000));
       
       //Display decimal format for 1st and 2nd three digits.
       DecimalFormat df = new DecimalFormat("000");
       
       //Display decimal format for last four digit.
       DecimalFormat ddf= new DecimalFormat("0000");
       
       //Phone number is formated and storeid in phNum
       String phnum = df.format(x) + "-" + df.format(y) + "-" + ddf.format(z);
       System.out.println("Phone Number:"+phnum); 
    }
       // Phone Number:657-095-9287
       //  Phone Number:261-116-3883

       
   
}
