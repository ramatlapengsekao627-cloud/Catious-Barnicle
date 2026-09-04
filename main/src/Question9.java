/*24019362
 * Sekao Ramatlapeng
 * Lab 2 Question 9*/

import java.io.*;
import java.util.*;

public class Question9 {
    public static void main(String[] args){
        try {
            Scanner reader = new Scanner(new File("numbers.txt")); // read numbers.txt
            FileWriter writer = new FileWriter("signs.txt");       // write to signs.txt

            int positiveTotal = 0;
            int negativeTotal = 0;
            int positiveCount = 0;
            int negativeCount = 0;

            // go through every number in the file
            while (reader.hasNextInt()) {
                int number = reader.nextInt();

                if (number > 0) {
                    positiveTotal += number;
                    positiveCount++;
                } else if (number < 0) {
                    negativeTotal += number;
                    negativeCount++;
                }
                // numbers equal to 0 are skipped (not positive or negative)
            }

            // write totals and counts to the file
            writer.write("Positive total: " + positiveTotal + " (" + positiveCount + " numbers)\n");
            writer.write("Negative total: " + negativeTotal + " (" + negativeCount + " numbers)\n");

            reader.close();
            writer.close();

            System.out.println("Totals saved to signs.txt");
        }
        catch (FileNotFoundException e) {
            System.out.println("Could not find numbers.txt");
        }
        catch (IOException e) {
            System.out.println("Something went wrong writing signs.txt");
        }




    }
}
