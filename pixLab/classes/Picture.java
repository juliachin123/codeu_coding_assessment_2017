import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from
 * SimplePicture and allows the student to add functionality to
 * the Picture class.
 *
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture
{
    ///////////////////// constructors //////////////////////////////////
    
    /**
     * Constructor that takes no arguments
     */
    public Picture ()
    {
        /* not needed but use it to show students the implicit call to super()
         * child constructors always call a parent constructor
         */
        super();
    }
    
    /**
     * Constructor that takes a file name and creates the picture
     * @param fileName the name of the file to create the picture from
     */
    public Picture(String fileName)
    {
        // let the parent class handle this fileName
        super(fileName);
    }
    
    /**
     * Constructor that takes the width and height
     * @param height the height of the desired picture
     * @param width the width of the desired picture
     */
    public Picture(int height, int width)
    {
        // let the parent class handle this width and height
        super(width,height);
    }
    
    /**
     * Constructor that takes a picture and creates a
     * copy of that picture
     * @param copyPicture the picture to copy
     */
    public Picture(Picture copyPicture)
    {
        // let the parent class do the copy
        super(copyPicture);
    }
    
    /**
     * Constructor that takes a buffered image
     * @param image the buffered image to use
     */
    public Picture(BufferedImage image)
    {
        super(image);
    }
    
    ////////////////////// methods ///////////////////////////////////////
    
    /**
     * Method to return a string with information about this picture.
     * @return a string with information about the picture such as fileName,
     * height and width.
     */
    public String toString()
    {
        String output = "Picture, filename " + getFileName() +
        " height " + getHeight()
        + " width " + getWidth();
        return output;
        
    }
    public void fixUnderwater(){
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] rowArray : pixels)
        {
            for (Pixel pixelObj : rowArray)
            {
                zeroBlue();
                zeroRed();
                zeroGreen();
                //pixelObj.setRed(0);
                //pixelObj.setGreen(255);
            }
        }
    }
    
    public void zeroRed(){
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] rowArray : pixels)
        {
            for (Pixel pixelObj : rowArray)
            {
                pixelObj.setRed(0);
            }
        }
    }
    public void zeroGreen(){
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] rowArray : pixels)
        {
            for (Pixel pixelObj : rowArray)
            {
                pixelObj.setGreen(0);
            }
        }
    }
    public void negate(){
        Pixel [][] pixels = this.getPixels2D();
        for (Pixel [] rowArray: pixels){
            for (Pixel pixelObj: rowArray){
                pixelObj.setGreen(-255);
                pixelObj.setBlue(-255);
                pixelObj.setRed(-255);
            }
        }
    }
    /** Method to set the blue to 0 */
    public void zeroBlue()
    {
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] rowArray : pixels)
        {
            for (Pixel pixelObj : rowArray)
            {
                pixelObj.setBlue(0);
            }
        }
    }
    
    /** Method that mirrors the picture around a
     * vertical mirror in the center of the picture
     * from left to right */
    public void mirrorVertical()
    {
        Pixel[][] pixels = this.getPixels2D();
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        int width = pixels[0].length;
        for (int row = 0; row < pixels.length; row++)
        {
            for (int col = 0; col < width / 2; col++)
            {
                leftPixel = pixels[row][col];
                rightPixel = pixels[row][width - 1 - col];
                rightPixel.setColor(leftPixel.getColor());
            }
        }
    }
    public void mirrorHorizontal()
    {
        Pixel[][] pixels = this.getPixels2D();
        Pixel topPixel = null;
        Pixel bottomPixel = null;
        int width = pixels[0].length;
        for (int row = 0; row < pixels.length/2; row++)
        {
            for (int col = 0; col < width; col++)
            {
                topPixel = pixels[row][col];
                bottomPixel = pixels[pixels.length-1-row][col];
                bottomPixel.setColor(topPixel.getColor());
            }
        }
    }
    /** Mirror just part of a picture of a temple */
    public void mirrorTemple()
    {
        int mirrorPoint = 276;
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        int count = 0;
        Pixel[][] pixels = this.getPixels2D();
        
        // loop through the rows
        for (int row = 27; row < 97; row++)
        {
            // loop from 13 to just before the mirror point
            for (int col = 13; col < mirrorPoint; col++)
            {
                
                leftPixel = pixels[row][col];
                rightPixel = pixels[row]
                [mirrorPoint - col + mirrorPoint];
                rightPixel.setColor(leftPixel.getColor());
            }
        }
    }
    
    /** copy from the passed fromPic to the
     * specified startRow and startCol in the
     * current picture
     * @param fromPic the picture to copy from
     * @param startRow the start row to copy to
     * @param startCol the start col to copy to
     */
    public void copy(Picture fromPic,
                     int startRow, int startCol)
    {
        Pixel fromPixel = null;
        Pixel toPixel = null;
        Pixel[][] toPixels = this.getPixels2D();
        Pixel[][] fromPixels = fromPic.getPixels2D();
        for (int fromRow = 0, toRow = startRow;
             fromRow < fromPixels.length &&
             toRow < toPixels.length;
             fromRow++, toRow++)
        {
            for (int fromCol = 0, toCol = startCol;
                 fromCol < fromPixels[0].length &&
                 toCol < toPixels[0].length;
                 fromCol++, toCol++)
            {
                fromPixel = fromPixels[fromRow][fromCol];
                toPixel = toPixels[toRow][toCol];
                toPixel.setColor(fromPixel.getColor());
            }
        }
    }
    
    /** Method to create a collage of several pictures */
    public void createCollage()
    {
        Picture flower1 = new Picture("flower1.jpg");
        Picture flower2 = new Picture("flower2.jpg");
        this.copy(flower1,0,0);
        this.copy(flower2,100,0);
        this.copy(flower1,200,0);
        Picture flowerNoBlue = new Picture(flower2);
        flowerNoBlue.zeroBlue();
        this.copy(flowerNoBlue,300,0);
        this.copy(flower1,400,0);
        this.copy(flower2,500,0);
        this.mirrorVertical();
        this.write("collage.jpg");
    }
    
    
    /** Method to show large changes in color
     * @param edgeDist the distance for finding edges
     */
    public void mirrorHorizontalBotToTop()
    {
        Pixel[][] pixels = this.getPixels2D();
        Pixel topPixel = null;
        Pixel bottomPixel = null;
        int width = pixels[0].length;
        for (int row = 0; row < pixels.length/2; row++)
        {
            for (int col = 0; col < width; col++)
            {
                topPixel = pixels[row][col];
                bottomPixel = pixels[pixels.length-1-row][col];
                topPixel.setColor(bottomPixel.getColor());
            }
        }
    }
    public void mirrorVerticalRightToLeft()
    {
        Pixel[][] pixels = this.getPixels2D();
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        int width = pixels[0].length;
        for (int row = 0; row < pixels.length; row++)
        {
            for (int col = 0; col < width / 2; col++)
            {
                leftPixel = pixels[row][col];
                rightPixel = pixels[row][width - 1 - col];
                leftPixel.setColor(rightPixel.getColor());
            }
        }
    }
    public void edgeDetection(int edgeDist)
    {
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        Pixel[][] pixels = this.getPixels2D();
        Color rightColor = null;
        for (int row = 0; row < pixels.length; row++)
        {
            for (int col = 0;
                 col < pixels[0].length-1; col++)
            {
                leftPixel = pixels[row][col];
                rightPixel = pixels[row][col+1];
                rightColor = rightPixel.getColor();
                if (leftPixel.colorDistance(rightColor) >
                    edgeDist)
                    leftPixel.setColor(Color.BLACK);
                else
                    leftPixel.setColor(Color.WHITE);
            }
        }
        
        
    }
    public void edgeDetection2(int edgeDist){
        Picture copy = new Picture(this);
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        Pixel[][] pixels = this.getPixels2D();
        Color rightColor = null;
        
        for (int row = 0; row < pixels.length; row++){
            for (int col = 0; col < pixels[0].length-1; col++){
                leftPixel = pixels[row][col];
                rightPixel = pixels[row][col+1];
                rightColor = rightPixel.getColor();
                if(leftPixel.colorDistance(rightColor)>edgeDist){
                    leftPixel.setColor(Color.BLACK);
                }else{
                    leftPixel.setColor(Color.WHITE);
                }
            }
        }
        
        Pixel[][] copyPixels = copy.getPixels2D();
        Pixel topPixel = null;
        Pixel bottomPixel=null;
        Color bottomColor=null;
        for (int row = 0; row < copyPixels.length-1; row++){
            for (int col = 0; col < copyPixels[0].length; col++){
                topPixel = copyPixels[row][col];
                bottomPixel = copyPixels[row+1][col];
                bottomColor = bottomPixel.getColor();
                if(topPixel.colorDistance(bottomColor)>edgeDist){
                    pixels[row][col].setColor(Color.BLACK);
                }
            }
        }
    }
    /*
     Hide a black and white message in the current
     picture by changing the red to even and then
     setting it to odd if the message pixel is black.
     @param messagePict the picture with a message.
     */
    public void encode( Picture messagePict )
    {
        Pixel[][] messagePixels = messagePict.getPixels2D();
        Pixel[][] currPixels = this.getPixels2D();
        Pixel currPixel = null;
        Pixel messagePixel = null;
        for ( int row = 0; row < this.getHeight(); row++ )
        {
            for ( int col = 0; col < this.getWidth(); col++ )
            {
                currPixel = currPixels[row][col];
                if ( currPixel.getRed() % 2 != 0 )
                    currPixel.setRed( currPixel.getRed() - 1 );
                messagePixel = messagePixels[row][col];
                if ( messagePixel.colorDistance( Color.BLACK ) <= 50 )
                {
                    currPixel.setRed( currPixel.getRed() + 1 );
                }
            }
        }
    }
    public Picture decode()
    {
        Pixel[][] pixels = this.getPixels2D();
        int height = this.getHeight();
        int width = this.getWidth();
        Pixel currPixel = null;
        Pixel messagePixel = null;
        Picture messagePicture = new Picture( height, width );
        Pixel[][] messagePixels = messagePicture.getPixels2D();
        int count = 0;
        for ( int row = 0; row < this.getHeight(); row++ )
        {
            for ( int col = 0; col < this.getWidth(); col++ )
            {
                currPixel = pixels[row][col];
                messagePixel = messagePixels[row][col];
                if ( currPixel.getRed() % 2 != 0 )
                {
                    messagePixel.setColor( Color.BLACK );
                }
            }
        }
        return messagePicture;
    }
    /* Main method for testing - each class in Java can have a main
     * method 
     */
    
} // this } is the end of class Picture, put all new methods before this
