import java.nio.file.*;
import java.util.*;
import java.io.*;

public class GradeChecker {

    public GradeChecker(){

    }

    public void checkGrades() throws IOException{
        int cnt = 0;
        double sum = 0;


        try(Scanner in = new Scanner(new BufferedReader(new FileReader("./src/grades.txt")))){

            in.useDelimiter(",\\s*");

            while(in.hasNext()){
                if(in.hasNextDouble()){
                    cnt++;
                    sum += in.nextDouble();
                }
                else{
                    in.next();
                }
            }

        }
        finally{
            System.out.printf("Average of " + cnt + " grades: %.2f", (sum/(double) cnt));
        }
    }


}
