/**
 * @author - 
 * @version - 
 *
 * Solves Numbrix puzzles
 * http://www.parade.com/numbrix
 */

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Represents a Numbrix puzzle.
 */
public class Numbrix
{
    /** The puzzle data */
    private int[][] grid;

    /** Indicates whether numbers are used in the original puzzle
     *  If the number n is used, then used[n] is true;  Otherwise it's false */
    private boolean[] used;

    /**
     * Constructs a Numbrix puzzle object.
     * @param fileName the name of the file containing the puzzle data.
     * @throws FileNotFoundException when fileName file does not exist.
     */
    public Numbrix(String fileName) throws FileNotFoundException
    {
        Scanner fileReader = new Scanner(new File(fileName));
        int rows = fileReader.nextInt();
        int cols = fileReader.nextInt();

        grid = new int[rows][cols];
        used = new boolean[rows * cols + 1];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                int value = fileReader.nextInt();
                grid[r][c] = value;
                if (value != 0) {
                    used[value] = true;
                }
            }
        }
    }

    /**
     * Finds all solutions to the Numbrix puzzle stored in grid by
     * calling recursiveSolve for every possible cell in grid that
     * originally contains a 0 or a 1.  Each of these calls should
     * attempt to solve the puzzle beginning with the number 1.
     */
    public void solve()
    {
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == 0 || grid[r][c] == 1) {
                    recursiveSolve(r, c, 1);
                }
            }
        }
    }

    /**
     * Attempts to solve the Numbrix puzzle by placing n in grid[r][c]
     * and then making recursive calls (up, down, left, and right) to
     * place n+1 and higher numbers.
     * @param r the row of the cell in which to place n.
     * @param c the column of the cell in which to place n.
     * @param n the number to place in grid[r][c].
     */
    private void recursiveSolve(int r, int c, int n)
    {
        //case1
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length) {
            return;
        }

        boolean zero = grid[r][c] == 0;

        //case 2
        if (zero && used[n]) {
            return;
        }
        //case3
        if (!zero && grid[r][c] != n) {
            return;
        }

        grid[r][c] = n;

        if (n == grid.length * grid[0].length) {
            System.out.println(this); 
        } else {
            recursiveSolve(r - 1, c, n + 1); // up
            recursiveSolve(r + 1, c, n + 1); // down
            recursiveSolve(r, c - 1, n + 1); // left
            recursiveSolve(r, c + 1, n + 1); // right
        }

        //undo
        if (zero) {
            grid[r][c] = 0;
        }
    }

    /**
     * Returns a String which represents the puzzle.
     * @return the puzzle numbers with a tab after each number in a row
     *         and a new line character after each row.
     *         '-' characters should replace 0s in the output.
     */
    public String toString()
    {
        String result = "";
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == 0)
                    result += "-\t";
                else
                    result += grid[r][c] + "\t";
            }
            result += "\n";
        }
        return result;
    }
}