import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaximumSumKEle {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] l = bf.readLine().split(" ");
        int n = Integer.parseInt(l[0]);
        int k = Integer.parseInt(l[1]);
        int[] arr = new int[n];
        String[] line = bf.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(line[i]);
        }    


        int max = Integer.MIN_VALUE;
        int end = k;
        for (int i = 0; i < n; i++) {
            int s = 0;
            for (int j = i; j < end && j < n; j++) {
                s += arr[j];
            }
            if (s > max) {
                max = s;
            }
            end+=1;
        }
        System.out.println (max);
        bf.close();
    }
}
