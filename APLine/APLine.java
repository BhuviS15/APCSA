
/**
 * This APLIne class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
public class APLine
{
    private int a,b,c;
    
    public APLine (int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double getSlope() {
        return ((1.0 * -a)/ (1.0 * b));
    }
    
    public boolean isOnLine(int x, int y) {
        int equation = (a * x) + (b * y) + c;
        return equation == 0;
    }
    }

