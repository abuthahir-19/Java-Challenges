import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

class Student {
    int id;
    String name;
    Student (int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class SortName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map <Float, Student> data = new HashMap<>();

        while (n != 0) {
            int id = in.nextInt();
            String name = in.next();
            float cgpa = in.nextFloat();
            Student stud = new Student (id, name);
            data.put (cgpa, stud);
            n -= 1;
        }
        Collections.sort(Collections.reverseOrder(data));
        in.close();
    }
}
