/*
By Nitin Gupta
 */

import java.util.Scanner;

public class CoinMachine {

    public static void main(String[] args) {

        System.out.println("Enter a whole number from 0 to 99. " +
                "The machine will determine a combination of coins.");

        Scanner keyboard = new Scanner(System.in);

        // Input...
        int cents = keyboard.nextInt();
        keyboard.nextLine();

        // Calculations...
        int  quarters = cents / 25;
        int remAfterQuarters = cents % 25; // after the 'quarters' division, find the remaining coins

        int dimes = remAfterQuarters / 10;
        int remAfterDimes = remAfterQuarters % 10; // after the 'dimes' division, find the remaining coins

        int nickels = remAfterDimes / 5;
        int remAfterNickels = remAfterDimes % 5; // after the 'nickels' division, find the remaining coins

        int pennies = remAfterNickels;

        // Output...

        System.out.println(cents + " cents in coins:\n" +
                            quarters + " quarters\n" +
                            dimes + " dimes\n" +
                            nickels + " nickels\n" +
                            pennies + " pennies");

    }

}
