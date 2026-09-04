/*24019362
 * Sekao Ramatlapeng
 * Lab 2 Question 6*/

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //Ask user to enter  number for the day
        System.out.print("Enter number of the day of the week: ");
        int day = input.nextInt();

        switch (day){
            case 1:
                System.out.println("Monday");
                break; //stops the program so that it doesnt go to the next case
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                // runs if the number entered isn't 1-7
                System.out.println("Invalid number — please enter a value between 1 and 7");
        }
    }
}

