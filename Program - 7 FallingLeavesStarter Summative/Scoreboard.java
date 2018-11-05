import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Scoreboard extends Actor
{
    private int points;
    private Font myFont = new Font("Comic Sans MS", true, false, 24);
    /** 
     * when a scorboard is added it sets points to zero
     * makes a greenfoot image
     * and sets the image to white and sets the text to "score" and the value of points
     * then it displays the image
     * 
     * @param there is no pramiters
     * @return nothing is returned
     */
    public Scoreboard()
    {
        points = 0;
        GreenfootImage img = new GreenfootImage(150,30);
        img.setFont( myFont );
        img.setColor(new Color(255, 255, 255));
        img.drawString("Score: " + points, 5,25);
        setImage(img);

    }
    /**
     * runs evry cycle and if the points is equal to ten it palys a sound and stops the program
     * 
     * @param there is no pramiters
     * @return nothing is returned
     */
    public void act()
    {
             if(points == 10)
        {
            Greenfoot.playSound("fanfare.wav");
            Greenfoot.stop();
        }   
    }
    /** 
     * when addtoscore is called it adds one to points,
     * makes a greenfoot image
     * and sets the image to white and sets the text to "score" and the value of points
     * then it displays the image
     * 
     * @param there is no pramiters
     * @return nothing is returned
     */
    public void addToScore() 
    {
        points++;
        GreenfootImage img = getImage();
        img.clear();
        img.setColor(new Color(255, 255, 255));
        img.drawString("Score: " + points, 5,25); 
      
    }    
}