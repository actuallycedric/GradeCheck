import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        double sum = 0;

        while(true){
            try{
                System.out.print("Enter the number of courses you are taking: ");
                num = input.nextInt();
                break; // break2end
            }

            catch (InputMismatchException n){
                System.out.println("Invalid input. Please enter a valid integer.");
                input.next(); // clears any invalid input
            }
        }


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