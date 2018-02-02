
/**
 * MoneyConversion 	---Program prompts for and reads a double value representing a monetary amount.
 * @author    	       Ratna Lama
 * @version   	       1.0
 * @since     	       2017-09-01
*/

import java.util.Scanner;
public class MoneyConversion {

   /**
   * Prompt user for a monetary amount
   * then determine the fewest number of each bill and coin
   * needed to represent that amount
   * assumes a ten-dollar bill is the maximum size.
   */
      public static void main (String[] arg){

         /**
         * Declare the object and initialize with
         * predefined standard input object
         */
         Scanner scan = new Scanner (System.in);

         double monetaryAmt;
         int countTotalCents;
         int remainder;
         int tenDollarsAmt;
         int fiveDollarsAmt;
         int oneDollarsAmt;
         int quarters;
         int dimes;
         int nickels;
         int pennies;

         /**
         * Prompt user to enter a monetary amount
         */
         System.out.println();
         System.out.print("Enter monetary amount: ");
         monetaryAmt = scan.nextDouble();

         /**
         * Convert the total dollars in monetaryAmt to total number of cents by multiplying by 100
         * apply casting to type double monetaryAmt to get integer value of the monetaryAmt value
         */
         countTotalCents = (int) (monetaryAmt * 100);

         /**
         * Find numbers of ten dollars, five dollars,
         * and one dollars bill
         */
         tenDollarsAmt = (countTotalCents / 1000); // check numbers of 10 dollar bills (=10*100 cents)
         remainder = (countTotalCents % 1000); // check remaining cents after divided by 10 dollar
         fiveDollarsAmt = (remainder / 500); // check numbers of five dollar bills (=5*100 cents)
         remainder = (remainder % 500); // check remaining cents after divided by 5 dollar
         oneDollarsAmt = (remainder / 100); // check number of one dollar bills (=1*100)
         remainder = (remainder % 100); //

         /**
         * Convert remainder cents to number of quarters, dime,
         * nickels and pennies
         */
         quarters = (remainder / 25); // check number of quarters (=25 cents)
         remainder = (remainder % 25); // check remaining cents after divided by 25 cents
         dimes = (remainder / 10); // check number of dimes (=10 cents)
         remainder = (remainder % 10); // check remaining cents after divided by 10 cents
         nickels = (remainder / 5); // check number of nickels (=5 cents)
         remainder = (remainder % 5); // check remaing cents after divided by 5 cents
         pennies = remainder;

         /**
         * Printout monetary amount with the fewest bills and coins
         */
         System.out.println();
         System.out.println("That's equivalent to: ");
         System.out.println(tenDollarsAmt + " ten dollar bills");
         System.out.println(fiveDollarsAmt + " five dollar bills");
         System.out.println(oneDollarsAmt + " one dollar bills");
         System.out.println(quarters + " quarters");
         System.out.println(dimes + " dimes");
         System.out.println(nickels + " nickels");
         System.out.println(pennies + " pennies");

  } // end main method

} // end MoneyConversion class

