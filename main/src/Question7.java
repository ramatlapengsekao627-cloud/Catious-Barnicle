/*24019362
 * Sekao Ramatlapeng
 * Lab 2 Question 7*/

import java.io.*;

public class Question7 {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("numbers.txt"));
             FileWriter writer = new FileWriter("stats.txt")) {

            String line;
            int count = 0;
            int total = 0;
            int smallest = 0;
            int largest = 0;

            // Read the file one number at a time
            while ((line = reader.readLine()) != null) {

                int number = Integer.parseInt(line); // turn the text into a number
                if (count == 0) {
                    // first number read — set it as both smallest and largest so far
                    smallest = number;
                    largest = number;
                } else {
                    // compare with current smallest/largest
                    if (number < smallest) {
                        smallest = number;
                    }
                    if (number > largest) {
                        largest = number;
                    }
                }
                total = total + number; // keep a running total
                count = count + 1;      // keep track of how many numbers we've read
            }

            double average = (double) total / count; // convert to double so it's not a whole number only

            // Write the results to stats.txt
            writer.write("Smallest: " + smallest + "\n");
            writer.write("Largest: " + largest + "\n");
            writer.write("Average: " + average + "\n");

            System.out.println("Stats saved to stats.txt");
        }
        catch (IOException e) {
            System.out.println("Something went wrong reading or writing a file");
        }
    }
}
