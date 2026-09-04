/*24019362
 * Sekao Ramatlapeng
 * Lab 2 Question 5*/

import java.util.*;
import java.io.*;

public class Question5 {
    public static void main(String[] args){
        try (BufferedReader reader = new BufferedReader(new FileReader("students.txt"));
             FileWriter writer = new FileWriter("grades.txt")) {

            String line;
            // Keep reading one line at a time until there are no lines left
            while ((line = reader.readLine()) != null) {

                // Use a Scanner just to pull the name and score out of this one line
                Scanner lineReader = new Scanner(line);
                lineReader.useDelimiter(",");//split on comma instead of spaces
                String name = lineReader.next();

                int score = lineReader.nextInt();

                // working out the grade
                char grade;
                if (score >= 80) {
                    grade = 'A';
                } else if (score >= 70) {
                    grade = 'B';
                } else if (score >= 60) {
                    grade = 'C';
                } else if (score >= 50) {
                    grade = 'D';
                } else {
                    grade = 'F';
                }

                // Write name and grade to grades.txt
                writer.write(name + ": " + grade + "\n");
            }
            System.out.println("Grade report saved to grades.txt");
        }
        catch (IOException e) {
            System.out.println("Something went wrong reading or writing a file");
            e.printStackTrace(); // add this line temporarily
        }
    }
}
