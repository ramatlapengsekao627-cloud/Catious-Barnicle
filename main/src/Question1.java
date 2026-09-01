/*24019362
* Sekao Ramatlapeng
* Lab 2 Question 1*/

import java.util.Scanner;

public class Question1 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //prompt for the user to enter score
        System.out.print("Enter Numeric Score: ");
        int Score = sc.nextInt();

        //using if statement to check grade of score
        if(Score <= 100 && Score >= 80){
            System.out.println("A");
        }
        else if (Score <= 79 && Score >= 70) {
            System.out.println("B");
        }
        else if (Score <= 69 && Score >= 60 ) {
            System.out.println("C");
        }
        else if (Score <= 59 && Score >= 50) {
            System.out.println("D");
        }
        else if(Score < 50 && Score >=0){
            System.out.println("F");
        }
        else {
            System.out.println("You have input an invalid score.");
        }

    }
}
