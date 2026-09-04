/*24019362
 * Sekao Ramatlapeng
 * Lab 2 Question 10*/


import java.io.*;
import java.util.*;

public class Question10 {
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

        // ask user for the number to search for
        System.out.print("Enter a number to search for: ");
        int target = keyboard.nextInt();

        try {
            Scanner reader = new Scanner(new File("numbers.txt")); // read numbers.txt
            boolean found = false;

            // go through every number in the file
            while (reader.hasNextInt()) {
                int number = reader.nextInt();

                if (number == target) {
                    found = true;
                    break; // no need to keep searching once found
                }
            }
            System.out.println(found);
            reader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Could not find numbers.txt");
        }
    }
}
