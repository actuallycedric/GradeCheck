import java.util.*;
import java.io.*;

public class GradeChecker {

    public GradeChecker(){

    }

    public void checkGrades() throws IOException{
        Scanner in = null;
        int cnt = 0;
        double sum = 0;

        try{
            in = new Scanner(new BufferedReader(new FileReader("./src/grades.txt")));
            in.useDelimiter(",\\s*");

            String c;


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
