
/**
 * Ahmad Alramahi, Kevin Cheng, Yiguang Zhu
 * 08/30/2021
 * program2_7
 * Input seconds, outpuds hours, minutes, and seconds
 */
import java.util.Scanner;
public class program2_7
{
    public static void main (String[] args)
    {
        Scanner seconds = new Scanner (System.in);
        System.out.println("Enter number of seconds: ");
       
        int sec = seconds.nextInt();
        int hours = sec/3600;
        int minutes = (sec%3600)/60;
        int segundos = ((sec%3600)%60);
        
        System.out.println(hours+" Hours");
        System.out.println(minutes+" Minutes");
        System.out.println(segundos+" Seconds");
        //System.out.println("Hours: " + hours + ", Minutes: " + minutes + ", Seconds: " + segundos);
    }
}
