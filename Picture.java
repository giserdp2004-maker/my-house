/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Circle moon;
    private Square grass;
    
    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
       wall = new Square();
       window = new Square();
       roof = new Triangle();
       sun = new Circle();
       moon = new Circle();
       grass = new Square();// nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();
      
        grass = new Square();
        grass.changeColor("green");
        grass.moveVertical(140);
        grass.moveHorizontal(-310);
        grass.changeSize(500);
        grass.makeVisible();
        
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(180);
        sun.moveVertical(-80);
        sun.changeSize(60);
        sun.makeVisible();
        sun.slowMoveVertical(300);
        
        moon = new Circle();
        moon.changeColor("magenta");
        moon.changeSize(50);
        moon.moveUp();
        moon.moveUp();
        moon.moveHorizontal(-40);
        moon.moveVertical(-20);
        moon.makeVisible();
                
    }   
        

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
                }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }
    
    /**
     * Change this picture to use color display
     */
    public void amanecer()
    {
        moon.makeInvisible();   
        sun.slowMoveVertical(-300);
    }
}
