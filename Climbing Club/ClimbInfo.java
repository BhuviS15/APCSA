/**
 * This class represents a mountain climbing event
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ClimbInfo
{
    // Instance variables to store the name of the peak and the time taken
    private String name;
    private int time;

    // Constructor that initializes the name and time
    public ClimbInfo(String name, int time) {
        this.name = name;
        this.time = time;
    }

    // Method to return the name of the peak
    public String getName() {
        return name;
    }

    // Method to return the time taken to reach the peak
    public int getTime() {
        return time;
    }
}
