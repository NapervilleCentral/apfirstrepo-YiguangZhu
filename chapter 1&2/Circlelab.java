
/**
 * Calculate the area and circumference of a circle with a given radius.
 *
 * @author (Yiguang Zhu)
 * @version (9/4/2021)
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class Circlelab
{
   public static void main(String[] args)
   {
   Scanner radius= new Scanner(System.in);
   System.out.println("Enter radius here");
   
   double rad = radius.nextDouble(); 
   double area= Math.pow(rad,2)+Math.PI;
   double circumference= 2 * rad * Math.PI;
   
   
   DecimalFormat fmt = new DecimalFormat("0.###");
   System.out.println(" The area is "+area);
   System.out.println(" The circumference is "+circumference);
   
   
   
    }
}
