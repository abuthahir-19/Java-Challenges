import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BreakingRecords {
    public static List <Integer> breakingRec (List <Integer> scores) {
        List <Integer> out = new ArrayList<>();
        int minValue = scores.get(0), maxValue = scores.get(0);
        int minCount = 0, maxCount = 0;
        for (int i = 1; i < scores.size(); i++) {
            int val = scores.get(i);
            if (val < minValue) {
                minValue = val;
                minCount += 1;
            }
            
            if (val > maxValue) {
                maxValue = val;
                maxCount += 1;
            }
        }
        out.add(maxCount);
        out.add(minCount);
        return out;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine().trim());
        String[] values = bf.readLine().split(" ");
        List <Integer> lst = new ArrayList<>();
        for (int i = 0; i < values.length; i++) {
            lst.add(Integer.parseInt(values[i]));
        }
        List <Integer> output = breakingRec(lst);
        for (int val : output) {
            System.out.print (val + " ");;
        }
    }
}

/**
4
12 24 10 24

9
10 5 20 20 4 5 2 25 1
**/