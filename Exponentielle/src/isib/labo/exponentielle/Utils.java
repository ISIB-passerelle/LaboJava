/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isib.labo.exponentielle;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.function.Function;

/**
 *
 * @author Gatien
 */
public class Utils {
    
    public static void displayFactorials(int nb) {
        
        String fmtString = "%d! = %s (%s)";
        
        display(nb, Exponential::factorial, fmtString);
    }
    
    public static void displayExponentials(int nb) {
        
        String fmtString = "e^%d = %s (%s)";
        
        display(nb, Exponential::exponential, fmtString);
    }
    
    private static void display(int nb, Function<Integer, BigDecimal> method, String fmtString) {

        String formattedDouble;
        String formattedString;
        BigDecimal result;

        for (int i = 0; i <= nb; ++i) {
            
            result = method.apply(i);
            formattedDouble = format(result.doubleValue(), "0.00E0");
            
            formattedString = String.format(fmtString, i, formattedDouble, result);

            System.out.println(formattedString);
        }
        
        System.out.println();
    }
    
    private static String format(double nb, String dformat) {
        
        return new DecimalFormat(dformat).format(nb);
    }
}
