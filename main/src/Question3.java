/*24019362
 * Sekao Ramatlapeng
 * Lab 2 Question 3*/

import java.io.*;

public class Question3 {
    public static void main(String[] args){

        //the file path of students.txt
        String filePath = "C:\\Users\\mrama\\OneDrive - biust.ac.bw\\Documents\\Lab2\\main\\src\\students.txt";

        //Opens the file for reading and autocloses it when finished
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }
        //handles any exception that may come up
        catch(Exception e){
            System.out.println("Something went wrong!");
        }



    }
}
