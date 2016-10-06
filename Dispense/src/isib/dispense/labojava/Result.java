/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isib.dispense.labojava;

/**
 *
 * @author Gatien
 */
class Result {
    
    private int dividend;
    private int divisor;
    private int quotient;

    
    public Result() {
        
    }
    
    public Result(int dividend, int divisor, int quotient) {
        this.dividend = dividend;
        this.divisor = divisor;
        this.quotient = quotient;
    }
    
    

    public int dividend() {
        return dividend;
    }

    public void setDividend(int dividend) {
        this.dividend = dividend;
    }

    public int divisor() {
        return divisor;
    }

    public void setDivisor(int divisor) {
        this.divisor = divisor;
    }

    public int quotient() {
        return quotient;
    }

    public void setQuotient(int quotient) {
        this.quotient = quotient;
    }

    @Override
    public String toString() {
        return "Result{" + "dividend=" + dividend + ", divisor=" + divisor + ", quotient=" + quotient + '}';
    }
    
}
