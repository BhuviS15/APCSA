/**
 * This Trail object . . .
 * 
 * @author  
 * @version 
 */
public class Trail
{
    /** Representation of the trail. The number of markers on the trail is markers.length. */
    private int[] markers;

    public Trail(int[] trail)
    {
        markers = trail;
    }

    /** Determines if a trail segment is level. A trail segment is defined by a starting marker,
     * an ending marker, and all markers between those two markers.
     * A trail segment is level if it has a difference between the maximum elevation
     * and minimum elevation that is less than or equal to 10 meters.
     * @param start the index of the starting marker
     * @param end the index of the ending marker
     * Precondition: 0 <= start < end <= markers.length - 1
     * @return true if the difference between the maximum and minimum
     * elevation on this segment of the trail is less than or equal to 10 meters;
     * false otherwise.
     */
    public boolean isLevelTrailSegment(int start, int end)
    {
        // markers is the array you're checking against
        // you need to keep the min and max markers
        // you need to check if that value is <=10
    
        int maxElevation = markers[start]; 
        int minElevation = markers[start]; 
        for (int i = start + 1; i <= end; i++) { 
            if (markers[i] > maxElevation) { 
                maxElevation = markers[i]; 
            } 
            if (markers[i] < minElevation) { 
                minElevation = markers[i]; 
            } 
        } 
        return (maxElevation - minElevation) <= 10;
    }

    /** Determines if this trail is rated difficult. A trail is rated by counting the number of changes
     * in elevation that are at least 30 meters (up or down) between two consecutive markers. A trail
     * with 3 or more such changes is rated difficult.
     * @return true if the trail is rated difficult; false otherwise.
     */
    public boolean isDifficult()
    {
        //keep count of all changes >= 30
        //if >= 3 -> difficult
        int count = 0;
        for (int i = 1; i < markers.length; i++) {
            if ((markers[i] - markers[i-1] >= 30) || (markers[i] - markers[i-1] <= -30)) {
                count++;
            }
        }
        if (count >= 3) {
            return true;
        }
        return false;
    }

    // returns a string representation of this Trail object
    public String toString()
    {
        String index =   "Marker   ";
        String element = "Elevation";
        for (int i = 0; i < markers.length; i ++)
        {
            index += "\t" + i;
            element += "\t" + markers[i];
        }
        return (index + "\n" + element);
    }
}
