/*24019362
 * Sekao Ramatlapeng
 * Lab 2 Question 2*/

import java.util.Locale;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        String firstLetter = input.nextLine();
        //charAt necessary because .nextLine outputs a string which cannot be stored in a char variable.

        //prompts user to enter full name
        System.out.print("Enter your full name: ");
        String fullName = input.nextLine();

        //use of a substring to check if the first letters are the same
        if (firstLetter.equalsIgnoreCase(fullName.substring(0,1))) {

            System.out.println("Your name does start with " + firstLetter);
        }
        else {
            System.out.println("Your name does not start with " + firstLetter);
        }

        //display output of what the user sees
        System.out.println("Your full name has " + fullName.length() + " characters including the whitespaces.");
        System.out.println("Your full name in lower case is: " + fullName.toLowerCase());
        System.out.println("Your full name in upper case is: " + fullName.toUpperCase());






    }

}
