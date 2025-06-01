
/**
 * This Time class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
public class Time {
    private int hours;
    private int minutes;

    public Time(int h, int m) {
        hours = h;
        minutes = m;
    }

    public void setTime(int h, int m) {
        hours = h;
        minutes = m;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public boolean isValidTime() {
        return (hours >= 0 && hours <= 23) && (minutes >= 0 && minutes <= 59);
    }

    public String toString() {
        return hours + ":" + minutes;
    }

    // Method to calculate minutes until another Time object
    public int minutesUntil(Time other) {
        int thisTotalMinutes = (hours * 60) + minutes; 
        int otherTotalMinutes = (other.hours * 60) + other.minutes; 
        return otherTotalMinutes - thisTotalMinutes; 
    }
}
