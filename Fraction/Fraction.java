/**
 * This class represents real fractions and fraction arithmetic
 * 
 * @author  Bhuvi
 * @version 10/30/2024
 */

public class Fraction 
{
   //declare instance variables
   private int numer, denom;
   
   //default constructor with no parameters
   public Fraction()
   {
      this(1, 1);   //this constructor chains the following constructor
   }

   //methods w the same name are called overloaded methods
   public Fraction(int n, int d)
   {
      numer = n;
      denom = d;
   }

   //returns the numerator of the fraction
   public int getNumerator()
   {
      // complete the following line
      return numer;
   }

   //returns the denominator of the fraction
   public int getDenominator()
   {
      // complete the following line
      return denom;
   }

   //returns the default string description of the fraction
   //(in the form 'numerator/denominator')
   public String toString()
   {
      // complete the following line
      return getNumerator() + "/" + getDenominator();
   }

   //method for multiplying two fractions (without simplifying the result)
   // Method for multiplying two fractions
    public Fraction multiply(Fraction other) {
        return new Fraction(numer * other.numer, denom * other.denom).simplify();
    }

    // Method for dividing two fractions
    public Fraction divide(Fraction other) {
        return new Fraction(numer * other.denom, denom * other.numer).simplify();
    }

    // Method for adding two fractions
    public Fraction add(Fraction other) {
        int newNumer = numer * other.denom + other.numer * denom;
        int newDenom = denom * other.denom;
        return new Fraction(newNumer, newDenom).simplify();
    }

    // Method for subtracting two fractions
    public Fraction subtract(Fraction other) {
        int newNumer = numer * other.denom - other.numer * denom;
        int newDenom = denom * other.denom;
        return new Fraction(newNumer, newDenom).simplify();
    }
   
   public Fraction simplify() {
        int gcd = GCD.findGCD(numer, denom);
        return new Fraction(numer / gcd, denom / gcd);
    }
}
