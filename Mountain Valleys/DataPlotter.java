import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * This DataPlotter object reads a space delimited text file of elevations
 * and plots the result as a range of greyscale images, and then calculates 
 * and plots the steepest downward path from each location in the image.
 * 
 * @author  
 * @version 
 */
public class DataPlotter
{
    private static int[][] grid;
    private static DrawingPanel panel;
    private static Scanner fileReader;
    private static int rows, cols;

    public static void main(String[] args) throws IOException
    {
        readValues("Colorado");
        plotData();
        try {Thread.sleep(3000); } catch (Exception e){};  // pause display for 3 seconds
        plotAllPaths();
    }

    private static void readValues(String fileName) throws IOException
    {
        fileReader = new Scanner(new File(fileName + ".dat"));
        rows = fileReader.nextInt();    // the first integer in the file is the number of rows
        cols = fileReader.nextInt();    // the second integer in the file is the number of columns

        grid = new int[rows][cols];
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                grid[r][c] = fileReader.nextInt();
            }
        }
        // instantiate and initialize the instance variable grid
        // then read all of the data into the array in row major order
    }

    // plot the altitude data read from file
    private static void plotData()
    {
        panel = new DrawingPanel(cols, rows);

        int minValue = grid[0][0];
        int maxValue = grid[0][0];

        for (int[] row : grid) {
            for (int val : row) {
                if (val < minValue) {
                    minValue = val;
                }
                if (val > maxValue) {
                    maxValue = val;
                }
            }
        }

        double scaleFactor = 255.0 / (maxValue - minValue);

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                int scaledValue = (int) ((grid[r][c] - minValue) * scaleFactor);
                Color gray = new Color(scaledValue, scaledValue, scaledValue);
                panel.setPixel(c, r, gray); 
            }
        }

    }

    // for a given x, y value, plot the downhill path from there
    private static void plotDownhillPath(int x, int y)
    {
        int currentElevation = grid[y][x];
        int lowestX = x, lowestY = y;

        for (int dy = -1; dy <= 1; dy++) {
            for (int dx = -1; dx <= 1; dx++) {
                int testX = x + dx;
                int testY = y + dy;

                if (testX >= 0 && testX < cols && testY >= 0 && testY < rows) {
                    if (grid[testY][testX] < grid[lowestY][lowestX]) {
                        lowestX = testX;
                        lowestY = testY;
                    }
                }
            }
        }

        if (grid[lowestY][lowestX] < currentElevation) {
            panel.setPixel(lowestX, lowestY, Color.blue);
            plotDownhillPath(lowestX, lowestY);
        }

    }

    private static void plotAllPaths()
    {
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                plotDownhillPath(c, r);
            }
        }

    }
}