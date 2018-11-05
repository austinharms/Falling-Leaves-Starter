import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Leaf  extends Actor
{
    private GreenfootImage leaf0 = new GreenfootImage("cutoutleaf0.png");
    private GreenfootImage leaf1 = new GreenfootImage("cutoutleaf1.png");
    private GreenfootImage leaf2 = new GreenfootImage("cutoutleaf2.png");
    private GreenfootImage leaf3 = new GreenfootImage("cutoutleaf3.png");
    private int speed = 0;
    private int rotation = 0;
    public Leaf()
    {
        /**
         *  when the object is added it sets the image to a random image of 4
         *   sets the speed value to a random number between 1-5
         *   
         * @param there is no pramiters
         * @return nothing is returned
         */
        int randomNum = Greenfoot.getRandomNumber(4);
        if(randomNum == 0)
        {
            setImage(leaf0);   
        }
        else if(randomNum == 1)
        {
            setImage(leaf1); 
        }
        else if(randomNum == 2)
        {
            setImage(leaf2); 
        }
        else 
        {
            setImage(leaf3); 
        }
        speed = Greenfoot.getRandomNumber(5) + 1;
    }

    /** 
     * every act cycle it checks if is at the bottom of the world and if it is it 
     * removes it's self also it moves side to side randomly and move down the speed value
     * 
     * @param there is no pramiters
     * @return nothing is returned
     */
    public void act() 
    {      
        setLocation(getX() + Greenfoot.getRandomNumber(10) - 5, getY() + speed);
        rotation++;
        setRotation(rotation);
        if(getY() >= getWorld().getHeight() - 1)
        {
            getWorld().removeObject(this); 
            //getWorld().removeObjects(getObjects(Leaf.class));
        }
    }   

}
