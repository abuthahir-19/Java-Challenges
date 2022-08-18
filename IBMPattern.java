import java.util.Scanner;

public class IBMPattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();

        for (int j = 1; j <= n; j++) {
            for (int i = 1; i <= s; i++) {
                System.out.print ("-");
            }
            System.out.print(" ");
        }
        System.out.println();
        for (int k = 1; k < (s/2); k++) {
            for (int j = 1; j <= n; j++) {
                for (int i = 1; i <= s; i++) {
                    if (i == 1 || i == s) System.out.print ("|");
                    else if (i == (s/2) + 1) System.out.print("*");
                    else System.out.print (" ");
                }
                System.out.print (" ");
            }
            System.out.println();
        }
        for (int j = 1; j <= n; j++) {
            for (int i = 1; i <= s; i++) {
                System.out.print ("*");
            }
            System.out.print (" ");
        }
        System.out.println();
        for (int k = 1; k < (s/2); k++) {
            for (int j = 1; j <= n; j++) {
                for (int i = 1; i <= s; i++) {
                    if (i == 1 || i == s) System.out.print ("|");
                    else if (i == (s/2) + 1) System.out.print("*");
                    else System.out.print (" ");
                }
                System.out.print (" ");
            }
            System.out.println();
        }
        for (int j = 1; j <= n; j++) {
            for (int i = 1; i <= s; i++) {
                System.out.print ("-");
            }
            System.out.print(" ");
        }
        in.close();
    }
}
