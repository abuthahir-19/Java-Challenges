import java.util.Scanner;

public class sortelement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = in.nextInt();
        }
        for (int i = 0; i < list.length; i++) {
            if ((i+1) % 2 == 0) {
                for (int k = i + 2; k < list.length; k+=2) {
                    if (list[i] > list[k]) {
                        int t = list[i];
                        list[i] = list[k];
                        list[k] = t;
                    }
                }
            }
            else {
                for (int j = i + 2; j < list.length; j+=2) {
                    if (list[i] < list[j]) {
                        int t = list[i];
                        list[i] = list[j];
                        list[j] = t;
                    }
                }
            }
        }

        for (int i = 0; i < list.length; i++) {
            System.out.print (list[i] + " ");
        }
    }
}
/**
8
0 1 2 3 4 5 6 7

7
13 2 4 15 12 10 5

9
1 2 3 4 5 6 7 8 9 
**/ 