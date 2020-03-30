
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Semut here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Semut extends Actor
{
    /**
     * Act - do whatever the Semut wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      move(30);
      if (getX() > getWorld().getWidth() - 50 ){
         turn(90);
         setRotation(90);
         if (getY() > getWorld().getHeight() - 50){
           turn(90);      
         }
      }
      if (getX() < getWorld().getWidth() - 550) {
        turn(90);
        setRotation(-90);
        }
     }
     
}
