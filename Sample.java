import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        List <Integer> path = new ArrayList<>();
        path.add(7);

        List <Integer> newPath = new ArrayList<>(path);
        System.out.println(newPath);
        in.close();
    }
}