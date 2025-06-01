
/**
 * This Clock class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
public class Clock
{
    private int hours;
    private int minutes;
    private int seconds;
    
    public Clock ()
    {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }
    
    public Clock(int hours, int minutes, int seconds) {
        setClock(hours, minutes, seconds);
    }

    public void setClock(int hours, int minutes, int seconds) {
        this.hours = (hours % 24);
        this.minutes = (minutes % 60);
        this.seconds = (seconds % 60); 
    }
    
    public int getHours() {
        return hours;
    }
    
    public int getMinutes() {
        return minutes;
    }
    
    public int getSeconds() {
        return seconds;
    }
    
    public String toString() {
        return hours + ":" + minutes + ":" + seconds;
    }
}
