import java.util.*;
import java.io.*;

public class GradeChecker {

    public GradeChecker(){

    }

    public void checkGrades() throws IOException{
        BufferedReader in = null;
        int cnt = 0;
        double sum = 0;

        try{
            in = new BufferedReader(new FileReader("./src/grades.txt"));

            String c;
            in.mark(0); // waypoint for re-reading


            while((c = in.readLine()) != null){
                cnt++;
                sum += Double.parseDouble(c);
            }

        }
        finally{
            System.out.printf("Average of " + cnt + " grades: %.2f", (sum/(double) cnt));
        }
    }


}
