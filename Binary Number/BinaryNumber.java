
/**
 * This class represents a binary number as an String containing only 1s and 0s
 * as represented using a two's complement numbering scheme.
 * 
 * @author 
 * @version 
 */
public class BinaryNumber
{
    /** instance variable */
    private String number;

    /** constructor */
    public BinaryNumber (String number) {
        this.number = number;
    }

    /** returns this binary number as a String of 1s and 0s */
    public String getNumber()
    {
        return number;    // replace this line
    }

    /** returns the representation of this binary number where each bit has 
      * been moved to the left one position (a 0 is put in the rightmost position) */
    public BinaryNumber shiftLeft()
    {
        return new BinaryNumber(number.substring(1) + "0");    // replace this line
    }

    /** returns the representation of this binary number where each bit has 
      * been moved to the right one position (a 0 is put in the leftmost position) */  
    public BinaryNumber shiftRight()
    {
        return new BinaryNumber("0" + number.substring(0,number.length()-1));    // replace this line
    }
    
    /** returns the individual bit of this binary number at the given position
      * (starting on the far right as position 0) as either True (1) or False (0) */
    public boolean getBit(int position)
    {
        if (number.substring(number.length() - position - 1, number.length() - position).equals("1")) {
            return true;
        }
        return false;   // replace this line
    }

    /** returns the bitwise 'not' representation of this binary number 
      * (1s become 0s and 0s become 1s) */
    public BinaryNumber not()
    {
        String str = "";
        for (int i = 0; i < number.length(); i++) {
            if (getBit(i)) {
                str = 0 + str;
            }
            else {
                str = 1 + str;
            }
        }
        return new BinaryNumber(str);   // replace this line
    }

    /** returns the bitwise 'and' representation of this and another binary number
      * ( 1 and 1 -> 1, 1 and 0 -> 0, 0 and 1 -> 0, 0 and 0 -> 0 ) */
    public BinaryNumber and(BinaryNumber other )
    {
        String str = "";
        for (int i = 0; i < number.length(); i++) {
            if (getBit(i) && other.getBit(i)) {
                str = 1 + str;
            }
            else {
                str = 0 + str;
            }
        }
        return new BinaryNumber(str); // replace this line
    }

    /** returns the bitwise 'or' representation of this and another binary number
      * ( 1 or 1 -> 1, 1 or 0 -> 1, 0 or 1 -> 1, 0 or 0 -> 0 ) */   
    public BinaryNumber or(BinaryNumber other)
    {
        String str = "";
        for (int i = 0; i < number.length(); i++) {
            if (getBit(i) || other.getBit(i)) {
                str = 1 + str;
            }
            else {
                str = 0 + str;
            }
        }
        return new BinaryNumber(str); // replace this line
    }

    /** returns the bitwise 'xor' representation of this and another binary number
      * ( 1 xor 1 -> 0, 1 xor 0 -> 1, 0 xor 1 -> 1, 0 xor 0 -> 0 ) */
    public BinaryNumber xor(BinaryNumber other)
    {
        String str = "";
        for (int i = 0; i < number.length(); i++) {
            if ((getBit(i) || other.getBit(i)) && !(getBit(i) && other.getBit(i))) {
                str = 1 + str;
            }
            else {
                str = 0 + str;
            }
        }
        return new BinaryNumber(str); // replace this line
    }

    /** returns the sum of this and another binary number */ 
    public BinaryNumber add(BinaryNumber other)
    {
        int carry = 0;
        String str = "";
        for (int i = 0; i < number.length(); i++) {
            int count = 0;
            if(this.getBit(i)) {
                count ++;
            }
            if(other.getBit(i)) {
                count ++;
            }
            if(carry > 0){
                count++;
                carry--;
            }
            str = (count % 2) + str;
            carry += count / 2;            
        }
        return new BinaryNumber(str);
    }

    /** returns the additive inverse value of the this binary number (equivalent 
      * to multiplying by -1 .)  Calculated by negating this binary number (using 
      * the 'not' method) and adding 1 to it. */
    public BinaryNumber twosComplement()
    {
        BinaryNumber str = this.not();
        String one = "1";
        for(int i = 1; i < number.length(); i++){
            one = 0 + one;
        }
        return str.add(new BinaryNumber(one));    // replace this line
    }

    /** returns the decimal value of this binary number using twosComplement */      
    public int binary2decimal()
    {
        int decimal = 0;
        for (int i = 0; i < number.length(); i++) {
            if(getBit(i)) {
                decimal += Math.pow(2, i);
                if(i == number.length() - 1) {// sign bit
                    decimal -= Math.pow(2, i + 1);
                }
            }
        }
        return decimal;// replace this line
    }

    /** returns the String representation of this binary number.
      * must include both a binary and decimal representation. */
    public String toString()
    {
        return "Binary: " + number + " Decimal: " + this.binary2decimal();      // replace this line
    }
}
