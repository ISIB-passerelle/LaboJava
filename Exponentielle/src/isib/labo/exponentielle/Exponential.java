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

    public static void main(String[] args) {

        int nb = 6;
        BigDecimal fact;

        BigDecimal sum = new BigDecimal(0);
        BigDecimal power;
        BigDecimal result;

        for (int i = 0; i < PRECISION; ++i) {

            fact = factorielle(i);
            power = new BigDecimal(Math.pow(nb, i));

            // rounding up to 749 digits for e^1
            result = power.divide(fact, 50, RoundingMode.HALF_UP);
            sum = sum.add(result);
        }

        System.out.println("e^" + nb + " = " + sum);
    }

    public static BigDecimal factorielle(int nb) {

        BigDecimal fact = BigDecimal.valueOf(1);

        for (int i = 1; i <= nb; ++i)
            fact = fact.multiply(BigDecimal.valueOf(i));

        return fact;
    }
}
