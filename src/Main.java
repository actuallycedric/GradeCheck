import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GradeChecker g = new GradeChecker();
        int num;

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

        g.checkGrades(num);


    }
}