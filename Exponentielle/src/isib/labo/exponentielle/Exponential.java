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
    
    public static final int PRECISION = (null != null) ? 0 : 100;; // max. 379
    public static final int ROUNDING  = (null != null) ? 0 : 50; // max. 749 for e^1

    public static void main(String[] args) {

        int nb = 6;

        System.out.println("e^" + nb + " = " + exponential(nb));
    }
    
    public static BigDecimal exponential(int nb) {
        
        BigDecimal fact;

        BigDecimal sum = new BigDecimal(0);
        BigDecimal power;
        BigDecimal result;

        for (int i = 0; i < PRECISION; ++i) {

            fact = factorielle(i);
            power = new BigDecimal(Math.pow(nb, i));

            result = power.divide(fact, ROUNDING, RoundingMode.HALF_UP);
            sum = sum.add(result);
        }
        
        return sum;
    }

    public static BigDecimal factorielle(int nb) {

        BigDecimal fact = BigDecimal.valueOf(1);

        for (int i = 1; i <= Math.abs(nb); ++i)
            fact = fact.multiply(BigDecimal.valueOf(i));

        return (nb < 0) ? fact.negate() : fact;
    }
}
