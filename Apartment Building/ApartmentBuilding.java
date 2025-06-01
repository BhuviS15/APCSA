
/**
 * This ApartmentBuilding class represents . . .
 *
 * @author  (your name)
 * @version (todays date)
 */
public class ApartmentBuilding extends Building {
    private double[] apartmentWattHours; 
    public ApartmentBuilding(String address, int numApartments) {
        super(address); 
        apartmentWattHours = new double[numApartments];
    }

    public double amountOwed() {
        double totalWattHours = 0;
        for (double wattHours : apartmentWattHours) {
            totalWattHours += wattHours;
        }
        return totalWattHours * RATE;
    }
    
}
