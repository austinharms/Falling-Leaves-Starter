import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FallWorld here.
 * 
 * @author (austin harms) 
 * @version (10/30/18)
 */
public class AutumnWorld  extends World
{
    private Scoreboard score;
    /** 
     * when a world is creted it is 750x500 it adds a scorboard and a catcher object
     * 
     * @param there is no pramiters
     * @return nothing is returned
     */
    public AutumnWorld()
    {    
        // Create a new world with 20x20 cells with a cell size of 10x10 pixels.
        super(750, 500, 1); 
        addObject(new Catcher(), getWidth()/2, getHeight() - 25);
        score = new Scoreboard();
        addObject( score, 100, 50);
    }
    
    /** 
     * 1% of the time it adds a new leaf in a random X position and at 0 y 
     * 
     * @param there is no pramiters
     * @return nothing is returned
     */
    public void act()
    {
        if(Greenfoot.getRandomNumber(100) + 1 == 1)
        {
            addObject(new Leaf(), Greenfoot.getRandomNumber(getWidth()), 0);
        }
    }
    /** when called it adds one to the score board
     * 
     * 
     * @param there is no pramiters
     * @return nothing is returned
     */
       public void update()
    {
        score.addToScore();
    }
}
