
/**
 * This Flight class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
public class Flight
{
    private String flightNumber;
    private Time departureTime;
    private Time arrivalTime;

    public Flight(String f, Time d, Time a) {
        flightNumber = f;
        departureTime = d;
        arrivalTime = a;
    }

    public void setFlight(String f, Time d, Time a) {
        flightNumber = f;
        departureTime = d;
        arrivalTime = a;
    }

    public Time getDepartureTime() {
        return departureTime;
    }

    public Time getArrivalTime() {
        return arrivalTime;
    }

    @Override
    public String toString() {
        int flightDuration = departureTime.minutesUntil(arrivalTime); 
        return "Flight " + flightNumber + ": departs at " + departureTime.toString() +
        ", arrives at " + arrivalTime.toString() + ", duration: " + flightDuration + " minutes";
    }
}
