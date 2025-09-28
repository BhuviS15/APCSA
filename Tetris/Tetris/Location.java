
/**
 * This Location class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
public class Location
{
    private int row;
    private int col;
    
    public Location (int row, int col) {
        this.row = row;
        this.col = col;
    }
    
    public int getRow () {
        return row;
    }
    
    public int getCol () {
        return col;
    }
    
    public boolean equals (Location other) {
        if (row == other.row && col == other.col) {
            return true;
        }
        return false;
    }
    
    public String toString() {
        return "(" + row + "," + col + ")";
    }
}
