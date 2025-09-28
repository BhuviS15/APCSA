public class Building
{
    public static final double RATE = 3.25;
    private String address;
    private double wattHours;    // units of electricity used in 1 month
    
    public Building(String ad)
    {
        address = ad;
        wattHours = 0;
    }
    
    // returns the amount owed by this building
    public double amountOwed()
    {
        return wattHours * RATE;
    }
}
