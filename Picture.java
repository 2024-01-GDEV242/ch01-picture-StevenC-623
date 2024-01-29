/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2016.02.29
 */
public class Picture
{
    private Square treeBase;
    private Square treeTrunk;
    private Triangle tree;
    private Triangle treelayer;
    private Circle sun;
    private Circle moon;
    private Square treeBase2;
    private Square treeTrunk2;
    private Triangle tree2;
    private Triangle treelayer2;

    private Person jake;
    
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        treeBase =new Square();
        tree = new Triangle();
        treelayer = new Triangle();
        sun = new Circle();
        moon= new Circle();
        treeBase2 =new Square();
        tree2 = new Triangle();
        treelayer2 = new Triangle();
        jake = new Person();
        
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            
            treeBase.moveHorizontal(-250);
            treeBase.moveVertical(60);
            treeBase.changeColor("brown");
            treeBase.makeVisible();

            tree.moveHorizontal(-120);
            tree.moveVertical(-100);
            tree.changeSize(170,150);
            tree.changeColor("green");
            tree.makeVisible();
            
            treelayer.moveHorizontal(-120);
            treelayer.moveVertical(-100);
            treelayer.changeSize(110,140);
            treelayer.changeColor("green");
            treelayer.makeVisible();

            sun.changeColor("yellow");
            sun.moveHorizontal(-40);
            sun.moveVertical(-60);
            sun.changeSize(80);
            sun.makeVisible();
            
            moon.changeColor("gray");
            moon.moveHorizontal(-35);
            moon.moveVertical(-55);
            moon.makeVisible();
            
            

            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {

    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {

    }
}
