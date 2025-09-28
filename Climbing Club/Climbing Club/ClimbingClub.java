import java.util.ArrayList;
import java.util.Collections;

public class ClimbingClub {
    /** The list of climbs completed by members of the club.
     * Guaranteed not to be null. Contains only non-null references. 
     */
    private ArrayList<ClimbInfo> climbList;

    /** Creates a new ClimbingClub object. */
    public ClimbingClub() { 
        climbList = new ArrayList<ClimbInfo>(); 
    }

    /** Adds a new climb with name peakName and time climbTime to the list of climbs.
     * @param peakName the name of the mountain peak climbed
     * @param climbTime the number of minutes taken to complete the climb
     */
    public void addClimb(String peakName, int climbTime) {
        //make the arraylist climbinfo
        ClimbInfo newClimb = new ClimbInfo(peakName, climbTime);

        //order it
        int index = 0;
        //-- is there a better way to loop through this
        while (index < climbList.size() && climbList.get(index).getName().compareTo(newClimb.getName()) < 0) {
            index++;
        }
        climbList.add(index, newClimb);
    }

    /** @return the number of distinct names in the list of climbs */ 
    public int distinctPeakNames() {
        // check if its empty -- why dont you need to check if its empty
        //if (climbList.size() == 0) {
        //    return 0;
        //}

        //count thru the peaks
        int distinctCount = 1; //first element is diff
        for (int i = 1; i < climbList.size(); i++) {
            if (!climbList.get(i).getName().equals(climbList.get(i - 1).getName())) {
                distinctCount++;
            }
        }
        return distinctCount;
    }
}