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

public class Exponential {

    public static final int PRECISION = 100; // max. 379
    public static final int ROUNDING  = 10;  // max. 749 for e^1

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
    
    
    public static void main(String[] args) {

        int nb = 20;
        
        Utils.displayFactorials(nb);
        Utils.displayExponentials(nb);
    }
}
