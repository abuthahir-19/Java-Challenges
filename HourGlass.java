import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;

public class HourGlass {
    static List <Integer> sum = new ArrayList<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List <List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            List <Integer> rows = new ArrayList<>();
            for (int j = 0; j < 6; j++) {
                rows.add(in.nextInt());
            }
            arr.add(rows);
        }

        int rowEnd = 3;
        for (int i = 0; i < 6; i++) {
            int colEnd = 3;
            if (i <= 3) {
                for (int j = 0; j < 6; j++) {
                    if (j <= 3) {
                        List < List<Integer> > subMat = new ArrayList<>();
                        for (int row = i; row < rowEnd; row++) {
                            List <Integer> curRow = new ArrayList<>();
                            for (int col = j; col < colEnd; col++) {
                                curRow.add(arr.get(row).get(col));
                            }
                            subMat.add(curRow);
                        }
                        printSubMat (subMat);
                        colEnd+=1;
                    }
                }
                rowEnd += 1;
            }
        }
        System.out.println(Collections.max(sum));
        in.close();
    }

    private static void printSubMat(List<List<Integer>> subMat) {
        int s = 0;
        for (int i = 0; i < subMat.size(); i++) {
            if (i == 0 || i == 2) {
                for (int j = 0; j < subMat.get(i).size(); j+=1) {
                    s += subMat.get(i).get(j);
                }
            }
        }
        s += subMat.get(1).get(1);
        sum.add(s);
    }
}
