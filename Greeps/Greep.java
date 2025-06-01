import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * A Greep is an alien creature that likes to collect tomatoes.
 * 
 * @author  Bhuvi Singh
 * @version 11/14/2024
 */

public class Greep extends Creature
{
    // Remember: you cannot extend the Greep's memory. So:
    // no additional fields (other than final fields) allowed in this class!
    
    /**
     * Create a Greep with its home space ship.
     */
    public Greep(Ship ship)
    {
        super(ship);
    }
    
    
    /**
     * This method specifies the name of the author (for display on the result board).
     */
    public static String getAuthorName()
    {
        return "Ugh, Greeps";  // your Greep meme goes here
    }


    public void act()
    {
        super.act();

        if (carryingTomato())
        {
            navigateToShip();
        }
        else
        {
            exploreForTomatoes();
        }
    }

    /**
     * Handles behavior for Greeps carrying tomatoes to return to the ship.
     */
    public void navigateToShip()
    {
        if (atShip())
        {
            dropTomato(); // Drop the tomato at the ship
        }
        else
        {
            // Turn towards the ship
            turnHome();

            // Try to move towards the ship while avoiding obstacles
            if (!safeMove())
            {
                // If blocked, turn slightly to find a way around the obstacle
                turn(Greenfoot.getRandomNumber(120) - 45);
            }
        }
    }

    /**
     * Handles behavior for Greeps not carrying tomatoes.
     */
    public void exploreForTomatoes()
    {
        checkFood(); // Look for tomato piles
        safeMove(); // Explore while avoiding obstacles
        if (!safeMove())
            {
                // If blocked, turn slightly to find a way around the obstacle
                turn(Greenfoot.getRandomNumber(180) - 45);
            }
    }

    /**
     * Check for food at the current location and attempt to load it.
     */
    public void checkFood()
    {
        TomatoPile tomatoes = (TomatoPile) getOneIntersectingObject(TomatoPile.class);
        if (tomatoes != null)
        {
            spit("red"); // Mark the location
            setRotation((int) (180 * Math.atan2(tomatoes.getY() - getY(), tomatoes.getX() - getX()) / Math.PI)); // Face the pile
            loadTomato(); // Try to load tomatoes onto another Greep
        }
    }

    /**
     * Attempt to move while avoiding obstacles. 
     * @return true if the move was successful, false if blocked.
     */
    public boolean safeMove()
    {
        if (!atWater() && !atWorldEdge())
        {
            move();
            return true;
        }
        else
        {
            // Turn slightly to find an alternate path
            turn(Greenfoot.getRandomNumber(150) - 85);
            move();
            return false;
        }
    }

    public String getCurrentImage()
    {
        if (carryingTomato())
            return "greep-with-food.png";
        else
            return "greep.png";
    }
}