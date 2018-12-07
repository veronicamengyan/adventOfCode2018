import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ChronalCalibration {

    public static void main(String[] args) throws FileNotFoundException {


        Scanner sc = new Scanner(new File("./input.txt"));
        List<Long> input = new ArrayList<Long>();

        while (sc.hasNext()) {
           input.add(Long.valueOf(sc.next()));
        }

        Set<Long> sum = new HashSet<Long>();
        long result = 0L;
        sum.add(result);
        for (int i = 0; i < input.size(); i++) {
            result += input.get(i);

            if (sum.contains(result)) {
                System.out.println("found " + result);
                sc.close();
                return;
            }
            sum.add(result);
            if (i == input.size()-1) {
                i = -1;
            }
        }
        sc.close();
    }
}
