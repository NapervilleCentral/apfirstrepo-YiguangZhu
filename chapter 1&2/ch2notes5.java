    /********************************************************************
// These are the notes for ch 2 used in hayes class
//******************************************************************* */
//Name
//Date
//Program
//Description
//Who helped me: Mr. Hayes
//util is the package. Inside is scanner and random, which are the classes. Ifyou put a star, you can import any class. 
import java.util.Random; // lets us use the random class
//you import the Scanner Class!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
import java.util.Scanner; // last word is the the Class



import java.util.*;  // let me use any class in the package

//import java.text.*;

import java.text.NumberFormat;
import java.text.DecimalFormat;



public class ch2notes5
    
    {   enum Flavor {chocolate, strawberry, mitChocolateChip, razberry}
    
    
    
    
    public static void main (String[] args)
    {
        //Scanner scan = new Scanner (System.in);
        Scanner Keyboard = new Scanner(System.in);
    
        //Flavor cone = Flavor.razberry;
    
        //these are basic data types
            int length;
            int x = 9,y,z;
            int id = 789;
            double num = 5, num1 = 23.89765, num2 = 3.4;
            char letter = 'd'; // is the same as an int. use '' only char.
            boolean choice = false;
            float num5 = 3.14f;
    
            //These are Objects     
            Integer number = new Integer(47);//every basic data type has a wrapper class
            /*start with letter or _
             * Class     id    must have new      constructor(data, may be optional)
             * name                               has the same name as the class
             * Have numbers but cannot have symbols (except $)
             */
            String myname =        new       String("Kevin Hayes");
            //Integer n2 = 7;//Auto Boxing
    /**/
            String word = new String("Homer Simpson");
            String word2 = new String("Homer Simpson");
            String word3 = new String("Bart Simpson");
            String name = new String();
            //String is special!!! other class/obj can't dp this
            String last = "Hayes";
            System.out.println(word.length());
            System.out.println("The name is"+name);
   
    
    /*
            System.out.printf("Name:  %s \t ID: %5d \n", name,id);
            System.out.println( 'a' + 100 ); //chars are ints data type
            System.out.println('a'   );
            System.out.println("A"+100  ); 
            System.out.println("The add is :"+(7+5)  ); 
            System.out.println(7+5 + "is the add"  ); 
    
    //      System.out.printf(  );
    
    //      System.out.printf( );
    
            System.out.println(  );
    
        System.out.println( );
        System.out.println(  );
    
    /**/
    
            num1 = 23.89765; num2 = 3.4;
    //Your create a NumberFormat and Decimalformat object
    //NumberFormat is a class. money is a object. mew DecimalFormat is a constructor.
    
            NumberFormat money = NumberFormat.getCurrencyInstance();
            NumberFormat percent = NumberFormat.getPercentInstance();
            DecimalFormat fmt =new DecimalFormat("0.###"); //.### limits it to 3 decimal place round and float 
            DecimalFormat fmt2= new DecimalFormat("0.00");// ## vs 00. //.00 pads with zeros. 
            
    
            System.out.println( "Sub Total: " + money.format(num1) );
            System.out.println( "Sub Total: " + percent.format(.5) );
            System.out.println( "Sub Total: " + fmt.format(num1) );
            System.out.println( "Sub Total: " + fmt2.format(num2) );
            System.out.println( "Sub Total: " + fmt.format(num2) );
            System.out.println( "Sub Total: " + fmt2.format(num1) );
    
    
    // page 90 Why do we get this Error???
    /*
            System.out.print("Enter a number ");
            x = Keyboard.nextInt   (5);
            System.out.println(x  );
            System.out.print("Enter a word ");
            //word = Keyboard.next   ();
            word = Keyboard.nextLine   ();
            System.out.println("The word is" + word );
    
    /*
            System.out.print("Enter a decimal");
            num = Keyboard.nextDouble ();
            System.out.println(num  );
    
    
            // what happens when you have both of these together
    /*
            System.out.print("Enter a word");
            Keyboard.nextLine();
            word = Keyboard.nextLine();
            System.out.println(word  );
    
    /*      System.out.println( "enter a word" );
            word = Keyboard.nextLine();
            System.out.println(word  );
    /*
            System.out.print("Enter a word "  );
            word = Keyboard.next   ();
            lname = Keyboard.next();
            System.out.println(word + "\n" + lname  );
    
    
    
    /*
    //  Can we make a Math Object? What type of class is Math???
          Math silly = new Math();
    
            System.out.println(Math.abs(-4));
            System.out.println(Math.sqrt (12));
            System.out.println(Math.pow(2,3));
    //      System.out.println(silly.pow(2,4));
    
    
    /*
    //!!!!!!!!!!!! Make a Random Object called generator
            Random generator = new Random();
    
            x = generator.nextInt(100);
            System.out.println("the Random number is " + x);
    
            num =generator.nextDouble()*50;
            System.out.println(num);
    /*
    
    /**/
    //----------------------------Know it live it love it p 78
            //word is an oject can do things (NOT len(word))
            System.out.println(  word.length() );
            System.out.println(word == word2 );
            System.out.println( x == 9 );
            System.out.println(  word.compareTo(word3 ));
            System.out.println(  word.indexOf("p"));
            //slice up the string
            //substring index  reruns string from index
            System.out.println(  word.substring(word.indexOf("S")));
            // this substring(start, end);
            int find = word.indexOf("S");
            
            
    
    
    
    
    
    
    //System.out.println((int)(letter + letter ) );
    
        //System.out.println( (char)101 );
    /*                       //int divided by int gives you a number result
            double conversionFactor = 9.0/5; //9/5 logic error -- promotion 5.0(double)x/
            double conversionFactor = (double)x/y;//casting widening the data type
            System.out.println(conversionFactor);
            final int BASE = 32;            // cast is (data type)
            int celsiusTemp = 30;
    
            double fahrenTemp = celsiusTemp * conversionFactor + BASE;
    
            System.out.println("Celsius Temp: " + celsiusTemp );
            System.out.println("Fahrenheit Equivalent" + fahrenTemp  );
             System.out.println((int)Math.random()*100);
    
    /**/
        num = num + num;
        num = num - num;
        num = num * num;
        num = num / num;
        num = num % 3;
        System.out.println(num);
    
   
    System.out.println (str.substringCharAt(3)); //How to print a char in a string

    SOP(word.toUpperCase()); //How to uppercase 
    
    
    /**/

    }//end of main

}//end of class

















