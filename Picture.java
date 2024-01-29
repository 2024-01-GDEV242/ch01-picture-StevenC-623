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
    private Square background;
    private Square ground;
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
        background = new Square();
        ground = new Square();
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
            background.changeSize(500);
            background.moveHorizontal(-310);
            background.moveVertical(-120);
            background.changeColor("black");
            background.makeVisible();
            
            ground.changeSize(500);
            ground.moveHorizontal(-310);
            ground.moveVertical(70);
            ground.changeColor("darkGreen");
            ground.makeVisible();
            
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
            
            treeBase2.moveHorizontal(45);
            treeBase2.moveVertical(60);
            treeBase2.changeColor("brown");
            treeBase2.makeVisible();

            tree2.moveHorizontal(170);
            tree2.moveVertical(-100);
            tree2.changeSize(170,150);
            tree2.changeColor("green");
            tree2.makeVisible();
            
            treelayer2.moveHorizontal(170);
            treelayer2.moveVertical(-100);
            treelayer2.changeSize(110,140);
            treelayer2.changeColor("green");
            treelayer2.makeVisible();
            
            jake.moveVertical(25);
            jake.moveHorizontal(-30);
            jake.changeColor("magenta");
            jake.makeVisible();

            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        ground.changeColor("white");
        treeBase.changeColor("black");
        tree.changeColor("white");
        treelayer.changeColor("white");
        sun.changeColor("white");
        moon.changeColor("black");
        treeBase2.changeColor("black");
        tree2.changeColor("white");
        treelayer2.changeColor("white");
        jake.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        ground.changeColor("darkGreen");
        treeBase.changeColor("brown");
        tree.changeColor("green");
        treelayer.changeColor("green");
        sun.changeColor("yellow");
        moon.changeColor("gray");
        treeBase2.changeColor("brown");
        tree2.changeColor("green");
        treelayer2.changeColor("green");
        jake.changeColor("magenta");

    }
}
