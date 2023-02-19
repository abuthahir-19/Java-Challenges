import java.util.Comparator;
import java.util.Scanner;
import java.util.Arrays;

class Activity {
    int start, end;
    public Activity (int start, int end) {
        this.start = start;
        this.end = end;
    }
}

class Compare {
    static void compare (Activity arr[], int n) {
        Arrays.sort (arr, new Comparator<Activity> () {
            @Override
            public int compare (Activity a1, Activity a2) {
                return a1.end - a2.end;
            }
        });
    }
}

public class ActivitySelection {
    public static void printMaxActivities (Activity arr[], int n) {
        Compare.compare(arr, n);

        System.out.println ("Following activities are selected : ");
        int i = 0;
        System.out.println ("(" + arr[i].start + ", " + arr[i].end + ")");

        for (int j = 1; j < n; j++) {
            if (arr[j].start >= arr[i].end) {
                System.out.println ("(" + arr[j].start + ", " + arr[j] + ")");
                i = j;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Activity arr[] = new Activity[n];
        for (int i = 0; i < n; i++) {
            int start = in.nextInt();
            int finish = in.nextInt();
            arr[i] = new Activity (start, finish);
        }

        printMaxActivities (arr, n);
    }
}
