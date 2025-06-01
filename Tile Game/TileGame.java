/**
 * This represents a basic square tile game that utilizes NumberTile objects
 * 
 * @author 
 * @version 
 */
import java.util.ArrayList;

public class TileGame
{
    /** represents the game board; guaranteed never to be null */
    private ArrayList<NumberTile> board;

    public TileGame()
    {
        board = new ArrayList<NumberTile>();
    }

    /** Determines where to insert tile, in its current orientation, into game board.
     *  @param tile the tile to be placed on the game board
     *  @return the position of tile where tile is to be inserted:
     *        0 if the board is empty;
     *       -1 if tile does not fit in front, at end, or between any existing tiles;
     *        otherwise, 0 <= position returned <= board.size()
     */
    public int getIndexForFit(NumberTile tile)
    {
        //if empty
        if (board.size() == 0)
        {
            return 0;
        }

        //beginning
        if (tile.getRight() == board.get(0).getLeft())
        {
            return 0;
        }

        //end of board
        if (tile.getLeft() == board.get(board.size() - 1).getRight())
        {
            return board.size();
        }

        //check if it can go between 2 tiles
        for (int i = 0; i < board.size() - 1; i++)
        {
            if (tile.getLeft() == board.get(i).getRight() && tile.getRight() == board.get(i + 1).getLeft())
            {
                return i + 1;
            }
        }
        return -1;
    }

    /** Places tile on the game board if it fits (checking all possible orientations if necessary.
     *  If there are no tiles on the game board, the tile is placed at position 0.
     *  The tile should be placed at most 1 time.
     *  Precondition: board is not null
     *  @param tile the tile to be placed on the game board
     *  @return true if tile is placed successfully; false otherwise
     *  Postcondition: the orientation of the other tiles on the board are not changed.
     *  Postcondition: the order of the other tiles on the board relative to each other is not changed.
     */
    public boolean insertTile(NumberTile tile) {
        //check all of the orientations then rotate
        for (int i = 0; i < 4; i++) {
            int index = getIndexForFit(tile);
            if (index != -1) {
                board.add(index, tile);
                return true;
            }
            tile.rotate();
        }
        return false;
    }
}