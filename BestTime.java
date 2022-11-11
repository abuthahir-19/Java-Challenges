import java.io.*;

public class BestTime {
    public static int findProfit (int[] prices) {
        int least = Integer.MAX_VALUE;
        int profit = 0;
        int pist = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > least) {
                least = prices[i];
            }

            pist = prices[i] - least;
            if (profit < pist) profit = pist;
        }
        return profit;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        String[] line = bf.readLine().split(" ");
        int[] prices = new int[line.length];
        for (int i = 0; i < line.length; i++) {
            prices[i] = Integer.parseInt (line[i]);
        }
        System.out.println (findProfit(prices));
        bf.close();
    }
}
