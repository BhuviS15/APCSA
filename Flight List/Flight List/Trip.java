import java.util.ArrayList;
/**
 * This Trip class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
public class Trip
{
    private String trip;
    private ArrayList<Flight> flights; 

    public Trip(String t, ArrayList<Flight> f) {
        trip = t;
        flights = f;
    }

    public int getDuration() {
        //check if there r flights
        if (flights.isEmpty()) {
            return 0; 
        }
        Time departureTime = flights.get(0).getDepartureTime(); 
        Time arrivalTime = flights.get(flights.size() - 1).getArrivalTime(); 
        return departureTime.minutesUntil(arrivalTime); 
    }


    public int getShortestLayover() {
        //check if there r less than 2 flights
        if (flights.size() < 2) {
            return -1;
        }
        int shortestLayover = Integer.MAX_VALUE; 
        for (int i = 0; i < flights.size() - 1; i++) {
            Time arrival = flights.get(i).getArrivalTime(); 
            Time departure = flights.get(i + 1).getDepartureTime(); 
            int layover = arrival.minutesUntil(departure); 
            if (layover < shortestLayover) {
                shortestLayover = layover;
            }
        }
        return shortestLayover;
    }

    public String toString() 
    { 
        String t = "The " + trip + " trip itinerary is as follows:\n\n"; 
        for (int i = 0; i < flights.size(); i++) 
        { 
            t += flights.get(i); 
            if (i < flights.size() - 1) 
            { 
                t += "\nThe layover between flights is "; 
                t += flights.get(i).getArrivalTime().minutesUntil 
                (flights.get(i + 1).getDepartureTime()); 
                t += " minutes\n\n"; 
            } 
        } 
        t += "\nThe duration of the entire trip is " + getDuration() + " minutes\n"; 
        t += "The shortest layover is " + getShortestLayover() + " minutes"; 
        return t; 
    }
}
