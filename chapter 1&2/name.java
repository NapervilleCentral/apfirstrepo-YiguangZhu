
/**
 * This is a program that asks for the users full name and then prints out first + middle initial, and then last name.
 *
 * @author (Yiguang Zhu)
 * @version (9/6/2021)
 */
import javax.swing.JOptionPane; 
public class Name
{
    public static void main(String[] args)
    {
        String fullname = JOptionPane.showInputDialog("Enter your name");
        
        //Define spacePosition to be used to cut off the print of full name until the first space.
        int spacePosition = fullname.indexOf(" ");
        //Creates a newname that starts after the first space.
        String newname = fullname.substring(spacePosition+1);
        int pacePosition = newname.indexOf(" ");
        
        String firstname = fullname.substring(0,spacePosition);
        String middlename = newname.substring(0,1)+".";
        String lastname = newname.substring (pacePosition+1);
        
        System.out.println(firstname+" "+ middlename);
        System.out.println(lastname);
    }

    }
//Yiguang J. Zhu
//Jeff J. Taylor
