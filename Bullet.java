import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    private int bulletSpeed = 30;
    private boolean toRight = true;
    public Bullet(boolean toRight, int bulletSpeed){
        this.toRight = toRight;
        this.bulletSpeed = bulletSpeed;
    }
    public void act()
    {
        if(toRight){
            setLocation(getX()+ bulletSpeed, getY());
        }
        if(!toRight){
            setLocation(getX()- bulletSpeed, getY());
        }
        
        
        if(getX() > 950 || getX() < 50) getWorld().removeObject(this);
    }
}
