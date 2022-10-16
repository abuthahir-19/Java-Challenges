import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SubDivision {
    public static int birthday (List <Integer> chocolate, int d, int m) {
        int count = 0;
        int end = m;
        for (int i = 0; i < chocolate.size(); i++) {
            int sum = 0;
            for (int j = i; j < end && j < chocolate.size(); j++) {
                sum += chocolate.get(j);
            }
            if (sum == d) count ++;
            end += 1;
        }
        return count;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine().trim());
        String[] values = bf.readLine().split(" ");
        String[] data = bf.readLine().split(" ");
        int d = Integer.parseInt(data[0]);
        int m = Integer.parseInt(data[1]);

        List <Integer> lst = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            lst.add(Integer.parseInt(values[i]));
        }
        System.out.println(birthday(lst, d, m));
    }
}
/**
5
2 2 1 3 2
4 2


5
1 2 1 3 2
3 2

6
1 1 1 1 1 1
3 2

1
4
4 1
 * **/