import java.util.*;
import java.io.*;

public class GradeChecker {

    public GradeChecker(){

    }

    public void checkGrades(int num){
        Scanner input = new Scanner(System.in);
        double sum = 0;


        while(true){
            try{
                for(int i = 0; i < num; i++){
                    System.out.print("Enter your mark: ");
                    double grade = input.nextDouble();

                    sum += grade;

                }

                break;
            }

            catch (InputMismatchException n){
                System.out.println("Invalid input. Please enter a valid double.");
                input.next(); // clears any invalid input
            }
        }


        System.out.printf("Your average of " + num + " subjects: %.2f", (sum / (double) num));
    }


}
