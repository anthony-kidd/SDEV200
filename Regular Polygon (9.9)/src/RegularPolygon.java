/*
 *----------------------------------------------------------------
 *|                       RegularPolygon                         |
 *----------------------------------------------------------------
 *| - n: int                                                     |
 *| - side: double                                               |
 *| - x: double                                                  |
 *| - y: double                                                  |
 *----------------------------------------------------------------
 *| + RegularPolygon()                                           |
 *| + RegularPolygon(n: int, side: double)                       |
 *| + RegularPolygon(n: int, side: double, x: double, y: double) |
 *| + getN(): int                                                |
 *| + getSide(): double                                          |
 *| + getX(): double                                             |
 *| + getY(): double                                             |
 *| + setN(n: int): void                                         |
 *| + setSide(side: double): void                                |
 *| + setX(x: double): void                                      |
 *| + setY(y: double): void                                      |
 *| + getPerimeter(): double                                     |
 *| + getArea(): double                                          |
 *----------------------------------------------------------------
 */
public class RegularPolygon {
	private int n = 3;
	private double side = 1;
	private double x = 0;
	private double y = 0;
	
	// No args constructor
	public RegularPolygon() {	
	}
	
	// Constructor with specified number of sides and length of side
    public RegularPolygon(int n, double side) {
    	this.n = n;
        this.side = side;
    }
    
    // Constructor with specified number of sides, length of side, and coordinates
    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }
    
    
    
    
    // Accessor methods
    
    public int getN() {
        return n;
    }
    
    public double getSide() {
        return side;
    }
    
    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }
    
    
    
    
    // Mutator methods

    public void setN(int n) {
        this.n = n;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    
    
    
    // Calculate the perimeter
    public double getPerimeter() {
        return n * side;
    }

    // Calculate the area
    public double getArea() {
        return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
    }
}
