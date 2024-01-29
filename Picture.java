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
    private Triangle tree;
    private Triangle treelayer;
    private Circle sun;
    private Circle moon;
    private Circle lake;
    private Triangle tree2;
    private Triangle treelayer2;
    private Square treeBase2;
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
        lake= new Circle();
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
            treeBase.moveHorizontal(50);
            treeBase.moveVertical(50);
            treeBase.makeVisible();
            treeBase.changeColor("brown");
            
            

            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
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
