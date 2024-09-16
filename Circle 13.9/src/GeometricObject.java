public class GeometricObject {
	private String color = "";
	private Boolean filled;
	private java.util.Date dateCreated;
	
	protected GeometricObject() {
		dateCreated = new java.util.Date(); 
	}
	
	protected GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	
	
	// Accessor methods
	public String getColor() {
		return color;
	}
	public boolean isFilled() {
		return filled;
	}
	public java.util.Date getDateCreated(){
		return dateCreated;
	}
	
	
	// Set methods
	public String setColor(String color) {
		this.color = color;
		return color;
	}
	public boolean setFilled(boolean filled) {
		this.filled = filled;
		return filled;
	}
	public java.util.Date setDateCreated(java.util.Date dateCreated){
		this. dateCreated = dateCreated;
		return dateCreated;
	}
	
	
	// To string
	public String toString() {
		return "created on " + dateCreated + "\ncolor:" + color + " and filled: " + filled;
	}
}
