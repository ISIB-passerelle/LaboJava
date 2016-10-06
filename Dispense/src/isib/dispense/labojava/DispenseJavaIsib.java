/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isib.dispense.labojava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.StringJoiner;

/**
 *
 * @author Gatien
 */
public class DispenseJavaIsib {

    
    public static void main(String[] args) {

        int nb = Integer.MAX_VALUE - 1;

        ArrayList<Result> results = allDivisors(nb);

        displayResults(results);
        displayPowers(results);
    }

    public static int smallestDivisor(int nb) {

        nb = Math.abs(nb);

        if (nb == 0) {

            return 0;
        }

        if (nb == 1) {

            return 1;
        }

        for (int i = 2; i <= nb; ++i) {
            if (nb % i == 0) {

                return i;
            }
        }

        return nb;
    }

    public static ArrayList<Result> allDivisors(int nb) {

        if (nb == 0) {

            throw new java.lang.ArithmeticException("Cannot divide by 0");
        }

        ArrayList<Result> results = new ArrayList();
        Result result;

        int divisor = smallestDivisor(nb);
        int quotient = nb / divisor;

        result = new Result(nb, divisor, quotient);
        results.add(result);

        while (nb != 1 && nb != -1) {

            nb = quotient;
            divisor = smallestDivisor(nb);
            quotient = nb / divisor;

            result = new Result(nb, divisor, quotient);
            results.add(result);
        }
        
        return results;
    }

    public static void displayResults(ArrayList<Result> results) {

        for (Result r : results) {

            System.out.println(r.dividend() + " / " + r.divisor() + " = " + r.quotient());
        }
    }

    public static void displayPowers(ArrayList<Result> results) {

        int nb = results.get(0).dividend();
        String sign = sign(nb);

        HashMap<Integer, Integer> powers = powers(results);

        int value;
        StringJoiner joiner = new StringJoiner(" * ");

        for (Entry<Integer, Integer> e : powers.entrySet()) {
            
            System.out.println(e.getKey());
            value = e.getValue();

            if (value != 1 && value != -1) {
                
                joiner.add(e.getKey() + "^" + value);
            } else if (e.getKey() != 1) {
                
                joiner.add("" + e.getKey());
            }
        }

        System.out.println(nb + " = " + sign + joiner);
    }

    public static String sign(int nb) {

        return nb >= 0 ? "" : "-";
    }

    public static HashMap<Integer, Integer> powers(ArrayList<Result> results) {

        HashMap<Integer, Integer> map = new HashMap();

        int div;
        int actualValue;

        for (Result r : results) {

            div = r.divisor();

            if (map.containsKey(div)) {

                actualValue = map.get(div);

                map.replace(div, actualValue + 1);
            } else {

                map.put(div, 1);
            }
        }
        
        return map;
    }

}
