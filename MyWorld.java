import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse MyWorld.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class MyWorld extends World
{

    private Bar bar = new Bar();
    public MyWorld()
    {    
        // Erstellt eine neue Welt mit 600x400 Zellen und einer Zell-Größe von 1x1 Pixeln.
        super(1000, 692, 1);
        addObject(new Panzer(), 150,600);
        addObject(new Gegner(), 1000, 600);
        addObject(bar, 200, 100);
        
    }
    public void act(){
        if(bar.getCounter() >=100){
            Greenfoot.setWorld(new WinScreen());
            Greenfoot.stop();
        }
        if(bar.getLive() <=0){
            Greenfoot.setWorld(new GameOverScreen());
            Greenfoot.stop();
        }
        
    }
    public Bar getBar(){
        return bar;        
    }
}