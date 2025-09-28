
/**
 * This APCircle class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
public class APCircle
{
    
    private int h, k, r;
    public APCircle(int h, int k, int r)
   {    
       this.h = h;
       this.k = k;
       this.r = r;
   }    
    public double getArea()
   {
       return Math.PI * r * r;
   }
   public boolean isOnCircle(int x, int y)
   {
       return (x - h) * (x - h) + (y - k) * (y - k) == r * r;
   }
}
