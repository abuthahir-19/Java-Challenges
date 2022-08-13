import java.util.Scanner;

public class Sample {
    public int[] toffes (int input1, int input2) {
        int[] child = new int[input2];
        int c = 0;
        while (input1 > 0) {
            int val = input1 - (c+1);
            if (c > input2) 
            child[(c % input2)] = (input2 + (c % input2) + 1);
            else if (val > 0)
            child[c] = (c+1);
            else child[c] = input1;
            c++;
            input1 -= (c);
        }
        return child;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int candies = in.nextInt();
        int childCount = in.nextInt();
        Sample obj = new Sample();
        int[] res = obj.toffes(candies, childCount);
        for (int val : res) {
            System.out.print (val + " ");
        }
        in.close();
    }
}