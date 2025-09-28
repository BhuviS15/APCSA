/**
 * This class has methods to determine if a square 2-dimensional array is a Magic Square
 * 
 * Square array ->      a 2D array where the number of rows and columns are the same
 * Rectangular array -> a 2D array where the number of rows and columns may be different,
 *                      but the number of columns is the same for each row
 *
 * @author 
 * @version 
 */
public class MagicSquare
{    
    /** Determines if a given 2D array is square */
    public boolean isSquareArray(int[][] array)
    {
        return array.length == array[0].length;   // replace this line
    }

    /** Determines if a given number appears only once in a 2D array */
    public boolean isNumberUnique(int[][] array, int number)
    {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] == number) {
                    count++;
                }
            }
        }
        return count == 1;   // replace this line
    }

    public boolean isEveryNumberUnique(int[][] array)
    {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (!isNumberUnique(array, array[i][j])) {
                    return false;
                }
            }
        }
        return true;   // replace this line
    }

    /** Returns the sum of a given column of a 2D rectangular array */    
    public int colSum(int[][] array, int col)
    {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][col];
        }
        return sum;       // replace this line
    }

    /** Returns the sum of a given row of a 2D rectangular array */
    public int rowSum(int[][] array, int row)
    {
        int sum = 0;
        for (int i = 0; i < array[0].length; i++) {
            sum += array[row][i];
        }
        return sum;       // replace this line
    }

    /** 
     *  Determines if the given square 2D array is a Semi-Magic Square.
     * 
     *  A Semi-Magic Square is where all of the rows and columns
     *  of a square 2D integer array sum to the same value.
     */
    public boolean isSemiMagicSquare(int[][] array)
    {
        if (!isSquareArray(array) || !isEveryNumberUnique(array)) {
            return false;
        }
        int expectedSum = rowSum(array, 0);
        for (int i = 0; i < array.length; i++) {
            if (rowSum(array, i) != expectedSum) {
                return false;
            }
            if (colSum(array, i) != expectedSum) {
                return false;
            }
        }
        return true;   // replace this line
    }

    /** 
     *  Returns the sum of the first diagonal (upper left to lower right)
     *  of a square 2D array
     *  @Precondition: square is a square array
     */    
    public int firstDiagonalSum(int[][] square)
    {
        int sum = 0;
        for (int i = 0; i < square.length; i++) {
            sum += square[i][i];
        }
        return sum;      // replace this line
    }

    /** 
     *  Returns the sum of the second diagonal (lower left to upper right)
     *  of a square 2D array
     *  @Precondition: square is a square array
     */    
    public int secondDiagonalSum(int[][] square)
    {
        int sum = 0;
        for (int i = 0; i < square.length; i++) {
            sum += square[i][square.length - 1 - i];
        }
        return sum;       // replace this line
    }

    /** 
     *  Determines if the given square 2D array is a Magic Square.
     * 
     *  A Magic Square is a Semi-Magic Square but where both diagonals
     *  also sum to the same value as the rows and columns.
     */
    public boolean isMagicSquare(int[][] array)
    {
        if (!isSemiMagicSquare(array)) {
            return false;
        }
        int expectedSum = rowSum(array, 0);
        return firstDiagonalSum(array) == expectedSum && secondDiagonalSum(array) == expectedSum;   // replace this line
    }

    /** 
     *  Returns the sum of the first diagonal (upper left to lower right)
     *  with a row offset of a square 2D array (includes broken diagonals)
     *  @Precondition: square is a square array
     */    
    public int firstDiagonalSum(int[][] square, int rowOffset)
    {
        int sum = 0;
        for (int i = 0; i < square.length; i++) {
            sum += square[(i + rowOffset) % square.length][i];
        }
        return sum;       // replace this line
    }

    /** 
     *  Returns the sum of the first broken diagonal (lower left to upper right)
     *  with a row offset of a square 2D array (includes broken diagonals)
     *  @Precondition: square is a square array
     */    
    public int secondDiagonalSum(int[][] square, int rowOffset)
    {
        int sum = 0;
        for (int i = 0; i < square.length; i++) {
            sum += square[(square.length - 1 - i + rowOffset) % square.length][i];
        }
        return sum;       // replace this line
    }

    /** 
     *  Determines if the given square 2D array is a Pan Magic Square.
     * 
     *  A Pan Magic Square is Magic Square but where the 'broken' diagonals
     *  also sum to the same value as both primary diagonals and the rows 
     *  and columns. 
     */
    public boolean isPanMagicSquare(int[][] array)
    {
        if (!isMagicSquare(array)) {
            return false;
        }
        int expectedSum = rowSum(array, 0);
        for (int i = 0; i < array.length; i++) {
            if (firstDiagonalSum(array, i) != expectedSum) {
                return false;
            }
            if (secondDiagonalSum(array, i) != expectedSum) {
                return false;
            }
        }
        return true;   // replace this line
    }
}
