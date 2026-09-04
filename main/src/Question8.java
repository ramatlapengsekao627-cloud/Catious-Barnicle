/*24019362
 * Sekao Ramatlapeng
 * Lab 2 Question 8*/

import java.io.*;
import java.util.*;

public class Question8 {
    public static void main(String[] args){
        try {
            Scanner reader = new Scanner(new File("numbers.txt")); // read numbers.txt
            FileWriter writer = new FileWriter("evenodd.txt");     // write to evenodd.txt

            int evenCount = 0;
            int oddCount = 0;
            // go through every number in the file
            while (reader.hasNextInt()) {
                int number = reader.nextInt();

                if (number % 2 == 0) {
                    evenCount++; // divisible by 2 -> even
                } else {
                    oddCount++;  // otherwise -> odd
                }
            }
            // write both counts to the file
            writer.write("Even: " + evenCount + "\n");
            writer.write("Odd: " + oddCount + "\n");

            reader.close();
            writer.close();
            System.out.println("Counts saved to evenodd.txt");
        }
        catch (FileNotFoundException e) {
            System.out.println("Could not find numbers.txt");
        }
        catch (IOException e) {
            System.out.println("Something went wrong writing evenodd.txt");
        }
    }
}
