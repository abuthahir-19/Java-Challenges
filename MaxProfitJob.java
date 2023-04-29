import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class MaxProfitJob {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int[] startTime = new int[n];
        int[] endTime = new int[n];
        int[] profit = new int[n];
        for (int i = 0; i < n; i++) {
            startTime[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            endTime[i] = in.nextInt();
        }

        for (int i = 0; i < n; i++) {
            profit[i] = in.nextInt();
        }

        System.out.println (getMaxProfit (startTime, endTime, profit));
        in.close();
    }

    public static int getMaxProfit (int[] startTime, int[] endTime, int[] profit) {
        int n = startTime.length, maxPro = 0;
        Activity[] arr = new Activity[n];
        List <Slot> slots = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Activity ob = new Activity(startTime[i], endTime[i], profit[i]);
            arr[i] = ob;
        }

        //sort all the jobs according to their profit in decreasing order
        Compare.compare(arr, n);

        for (Activity a : arr) {
            Slot ob = new Slot (a.start, a.end);
            if (!isOverlapping(slots, ob)) {
                // System.out.println (a.profit + " => " + ob.start + " " + ob.end);
                maxPro += a.profit;
            }
            slots.add (ob);
        }

        // for (Slot sl : slots) {
        //     System.out.println (sl.start + " " + sl.end);
        // }
        return maxPro;
    }

    public static boolean isOverlapping (List<Slot> slots, Slot slot) {
        for (Slot sl : slots) {
            if ((slot.start >= sl.start && slot.end <= sl.end) || 
                (slot.start <= sl.start && slot.end <= sl.end && slot.end > sl.start) ||
                (slot.start >= sl.start && slot.start <= sl.end && slot.end >= sl.end)) {
                return true;
            }
        }
        return false;
    }
}

class Slot {
    int start, end;
    public Slot (int start, int end) {
        this.start = start;
        this.end = end;
    }
}

class Activity {
    int start, end, profit;
    public Activity (int start, int end, int profit) {
        this.start = start;
        this.end = end;
        this.profit = profit;
    }
}

class Compare {
    static void compare (Activity arr[], int n) {
        Arrays.sort (arr, new Comparator <Activity> () {
            @Override
            public int compare (Activity s1, Activity s2) {
                return s2.profit - s1.profit;
            }
        });
    }
}

/***
4
1 2 3 3
3 4 5 6
50 10 40 70



5
1 2 3 4 6
3 5 10 6 9
20 20 100 70 60
 */