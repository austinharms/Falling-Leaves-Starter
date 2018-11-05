 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Catcher  extends Actor
{
    private int score = 0;
    /** 
     * moves left and right based on the key presses and if it is toutching a leaf 
     * it removes it and adds one to the score board
     * 
     * @param there is no pramiters
     * @return nothing is returned
     */
    public void act() 
    {
       if(Greenfoot.isKeyDown("left"))
       {
           setLocation(getX() - 5, getY());
        }
               if(Greenfoot.isKeyDown("right"))
       {
           setLocation(getX() + 5, getY());
        }
        if(isTouching(Leaf.class) == true)
        {
          removeTouching(Leaf.class);
          
          ( (AutumnWorld)getWorld()).update();
        }

    } 
    
}
