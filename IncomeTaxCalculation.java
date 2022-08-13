import java.util.*;

public class IncomeTaxCalculation {
    private static int getTaxableValue (int value, int tax) {
        double div =  tax / 100.0;
        return (int) (value * div);
    }
    
    private static int CalculateIncomeTax (int income) {
        int sum = 0, i = 0;
        int end = Math.min((income / 250000), 6) ;
        int health = 0, val, init = income;
        for (; i < end; i++) {
            val = (getTaxableValue(250000, (i*5))); 
            if (income <= 5000000) 
            health += getTaxableValue(val, 4);
            sum += val;
            income -= 250000;
        }
        val =  (getTaxableValue(income, (i*5)));
        if (income <= 5000000) 
        health += getTaxableValue(val, 4);
        sum += val;

        income = init;

        // System.out.println (sum);


        if (income > 5000000 && income <= 10000000) {
            sum = sum + getTaxableValue(sum, 10);
        } else if (income > 10000000 && income <= 20000000) {
            sum = sum + getTaxableValue(sum, 15);
        } else if (income > 20000000 && income <= 50000000) {
            sum = sum + getTaxableValue(sum, 25);
        } else if (income > 50000000) {
            sum = sum + getTaxableValue(sum, 37);
        }

        // System.out.println(sum);


        if (income <= 5000000)
        return (sum + health);
        else return (sum + getTaxableValue(sum, 4));
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int income = in.nextInt();
        System.out.println (CalculateIncomeTax(income));
        in.close();
    }
}
/**
1100000

5500000
**/