import java.util.ArrayList;
/**
 * This FootballJerseys class represents static methods that determine
 * possible NFL jersey numbers based on a player's position and existing team numbers
 *
 * @author  
 * @version 
 */
public class FootballJerseyNumbers
{
    // array of football position appreviations (.e.g, "QB" -> Quarterback)
    private static String[] positions = {"QB","RB","WR","TE","OL","DL","LB","DB","K/P","LS"};
    private static boolean[][] uniformNumbers; // this array is instantiated in the static method

    // returns the positions array index of parameter position, or -1 if not found
    public static int getPositionIndex(String position)
    {
        // search through positions array
        for (int i = 0; i < positions.length; i++) {
            if (positions[i].equals(position)) {
                return i;
            }
        }
        return -1;      // replace this statement
    }

    // determines if number is allowed for position
    public static boolean isNumberAllowed(int number, String position)
    {
        // first check that number is in range (0 - 99 inclusive) and position exists
        // then lookup the value in the 2D array uniformNumbers
        // number -> row, position index -> column
        int positionIndex = getPositionIndex(position);
        if (number < 0 || number > 99) {
            return false;
        }

        if (positionIndex == -1) {
            return false;
        }
        return uniformNumbers[number][positionIndex];   // replace this statement
    }

    // determines if number is already taken by the team
    public static boolean isNumberTaken(int number, int[] teamNumbers)
    {
        // search teamNumbers for number
        for (int teamNumber : teamNumbers) {
            if (teamNumber == number) {
                return true;
            }
        }
        return false;   // replace this statement
    }

    // returns a list of all possible numbers for a given position
    public static ArrayList<Integer> possibleNumbers(String position, int[] teamNumbers)
    {
        // create an empty ArrayList of Integer objects
        // loop through all of the possible numbers (0 - 99)
        //      if number is allowed (call the method you wrote)
        //          if number is not taken (call the method you just wrote)
        //              add the number to the list
        // return the list
        ArrayList<Integer> possibleNumbers = new ArrayList<>();
        for (int number = 0; number <= 99; number++) {
            //if number is allowed
            if (isNumberAllowed(number, position)) {
                //if number is not taken
                if (!isNumberTaken(number, teamNumbers)) {
                    // Add the number to the list
                    possibleNumbers.add(number);
                }
            }
        }
        return possibleNumbers;    // replace this line
    }

    static  // this process loads the possible numbers table
    {
        uniformNumbers = new boolean[100][10];
        for(int i = 0; i < uniformNumbers.length; i++)
        {
            if(i < 20)
            {
                boolean[] values = {true,true,true,true,false,false,true,true,true,true};
                uniformNumbers[i] = values;
            }
            else if (i < 50)
            {
                boolean[] values = {false,true,true,true,false,false,true,true,true,true};
                uniformNumbers[i] = values;
            }
            else if (i < 60)
            {
                boolean[] values = {false,false,false,false,true,true,true,false,false,true};
                uniformNumbers[i] = values;
            }
            else if (i < 80)
            {
                boolean[] values = {false,false,false,false,true,true,false,false,false,true};
                uniformNumbers[i] = values;
            }
            else if (i < 90)
            {
                boolean[] values = {false,true,true,true,false,false,false,false,false,true};
                uniformNumbers[i] = values;
            }
            else
            {
                boolean[] values = {false,false,false,false,false,true,true,false,true,true};
                uniformNumbers[i] = values;
            }

        }
    }

    public static void displayChart()
    {
        System.out.println("This is the NFL Football Jersey Numbers table");
        for(int i = 0; i < positions.length; i++)
            System.out.print("\t " + positions[i]);
        System.out.println();
        for(int row = 0; row < uniformNumbers.length; row++)
        {
            if (row == 0)
                System.out.print("00-09");
            else if (row == 10)
                System.out.print("10-19");
            else if (row == 20)
                System.out.print("20-29");
            else if (row == 30)
                System.out.print("30-39");
            else if (row == 40)
                System.out.print("40-49");
            else if (row == 50)
                System.out.print("50-59");
            else if (row == 60)
                System.out.print("60-69");
            else if (row == 70)
                System.out.print("70-79");
            else if (row == 80)
                System.out.print("80-89");
            else if (row == 90)
                System.out.print("90-99");

            for(int col = 0; col < uniformNumbers[row].length; col++)
            {
                System.out.print("\t" + uniformNumbers[row][col]);
            }
            System.out.println();
        }

    }
}
