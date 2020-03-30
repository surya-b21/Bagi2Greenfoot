import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kadal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kadal extends Actor
{
    /**
     * Act - do whatever the Kadal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        
            move(30);
            if(getY() > getWorld().getHeight() -30){
            turn(90);
            setRotation(270);
            }
        
    }    
}
