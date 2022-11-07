import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bar extends Actor
{
    private int count = 0;
    private int tankLive = 100;
    public Bar() { 
        updateImage();
    } 
    public void bumpCount(int amount) { 
        count += amount; 
        updateImage();
    }
    public void removeLive(int amount){
        tankLive -= amount;
        updateImage();
    }
    public int getCounter(){
        return count;
    }
    public int getLive(){
        return tankLive;
    }
    private void updateImage(){
        setImage(new GreenfootImage("    " +count + " Points - " + tankLive + " Live    " , 50, Color.WHITE, Color.BLACK)); 

    }
}
