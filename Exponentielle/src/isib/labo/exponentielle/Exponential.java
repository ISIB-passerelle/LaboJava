/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isib.labo.exponentielle;

/**
 *
 * @author Gatien
 */
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Exponential {

    public static final int PRECISION = 100; // max. 379
    public static final int ROUNDING  = 10;  // max. 749 for e^1

    public static void main(String[] args) {

        int nb = 20;
        
        displayFactorials(nb);

        System.out.println();
        
        displayExponentials(nb);
    }

    public static BigDecimal exponential(int nb) {

        BigDecimal fact;
        BigDecimal power;
        BigDecimal result;
        BigDecimal sum = new BigDecimal(0);

        for (int i = 0; i < PRECISION; ++i) {

            fact = factorial(i);
            power = new BigDecimal(Math.pow(nb, i));

            result = power.divide(fact, ROUNDING, RoundingMode.HALF_DOWN);
            sum = sum.add(result);
        }

        return sum.stripTrailingZeros();
    }

    public static BigDecimal factorial(int nb) {

        BigDecimal fact = new BigDecimal(1);

        for (int i = 1; i <= Math.abs(nb); ++i)
            fact = fact.multiply(BigDecimal.valueOf(i));
        

        return (nb < 0) ? fact.negate() : fact;
    }
    
    public static void displayFactorials(int nb) {
        
        String formatted;
        BigDecimal factorial;

        for (int i = 0; i <= nb; ++i) {
            
            factorial = factorial(i);
            formatted = format(factorial.doubleValue(), "0.00E0");

            System.out.println(i + "! = " + formatted + " (" + factorial + ")");
        }
    }
    
    public static void displayExponentials(int nb) {
        
        String formatted;
        BigDecimal exponential;

        for (int i = 0; i <= nb; ++i) {
            
            exponential = exponential(i);
            formatted = format(exponential.doubleValue(), "0.00E0");

            System.out.println("e^" + i + " = " + formatted + " (" + exponential + ")");
        }
    }
    
    public static String format(double nb, String dformat) {
        
        return new DecimalFormat(dformat).format(nb);
    }
}
