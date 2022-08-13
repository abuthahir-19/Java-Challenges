import java.util.*;

public class ValidChessBoard {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] board = new String[n];
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            board[i] = in.next();
        }
        for (int i = 0; i < n; i++, System.out.println()) {
            for (int j = 0; j < board[i].length(); j++) {
                char ch = board[i].charAt(j);
                if (i == 0) {
                    if (j == 0) {
                        if ((ch == 'W' && (board[i].charAt(j+1) == 'W' || board[i+1].charAt(j) == 'W'))) {
                            flag = false;
                            break;
                        }
                        else if ((ch == 'B' && (board[i].charAt(j+1) == 'B' || board[i+1].charAt(j) == 'B'))) {
                            flag = false;
                            break;
                        }
                    }
                    else if (j == n-1) {
                        
                    }
                }
                else if (i == n-1) {

                }
                else {

                }
            }
            if (!flag) break;
        }
        in.close();
    }
}
/**
4 
WBWB
BWBW
WBWB
BWBW
**/