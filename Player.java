import java.util.*;

public class Player {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        Map <Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
            if (freq.containsKey(ar[i])) {
                freq.put (ar[i], freq.get(ar[i]) + 1);
            }
            else freq.put (ar[i], 1);
        }

        for (Map.Entry <Integer, Integer> entry : freq.entrySet()) {
            System.out.println (entry.getKey() + " -> " + entry.getValue());
        }
        in.close();
    }
}

/**
4
Chennai Bangalore
Trichy Chennai
Tambaram Sairam
Sairam Tambaram

**/