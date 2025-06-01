import java.util.ArrayList;

public class ServiceArea
{
    private ArrayList<Building> allBuildings; 
    
    public ServiceArea() {
        allBuildings = new ArrayList<>();
    }

    public void addBuilding(Building building) {
        allBuildings.add(building);
    }

    public double totalSales() {
        double total = 0;
        for (Building building : allBuildings) {
            total += building.amountOwed();
        }
        return total;
    }

}
