
/**
 * This Point class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
public class Point
{
  private int x;
  private int y;
  
  public Point() {
      this(0,0);
  }
  
  public Point(int x, int y) {
      setPoint(x, y);
  }
  
  public void setPoint(int x, int y) {
      this.x = x;
      this.y = y;
  }
  
  public int getX() {
      return x;
  }
  
  public int getY() {
      return y;
  }
  
  public String toString() {
      return "(" + x + "," + y + ")";
  }
  
  public double getDistanceFromOrigin() {
      double distanceFormula = Math.sqrt((0-x)*(0-x)+(0-y)*(0-y));
      return distanceFormula;
  }
}
