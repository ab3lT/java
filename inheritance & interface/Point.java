public class ColorPoint extends Point {  
    
    private Color color; 
    
    public ColorPoint(double x, double y, Color color)  {  
        super(x, y);              // Make into a Point first. 
        this.color = color;    // Add info for new ColorPoint.
    }

}