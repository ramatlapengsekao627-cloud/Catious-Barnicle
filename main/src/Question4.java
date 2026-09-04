/*24019362
 * Sekao Ramatlapeng
 * Lab 2 Question 3*/

import java.io.*;
import java.util.*;

public class Question4 {
    public static void main(String[] args){

        //scanner to enable input collection
        Scanner input = new Scanner(System.in);

        //new file writer object
        try(FileWriter writer = new FileWriter("results.txt")) {
            for(int i = 0; i < 5; i++){

                //input student names
                System.out.print("Enter student name: ");
                String name = input.nextLine();

                System.out.print("Enter student score: ");
                double score = input.nextDouble();
                input.nextLine();//clears leftover newline

                writer.write(name + "," + score + "\n");
            }
            System.out.println("Results saved");
        }
        catch (IOException e){
            System.out.println("Could not access or write to file");
        }

    }
}
