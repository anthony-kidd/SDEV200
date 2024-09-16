public class Circle extends GeometricObject implements Comparable<Circle>{
	
	private double radius = 0;

	protected Circle() {}
	
	protected Circle(double radius) {
		this.radius = radius;
	}
	
	protected Circle(double radius, String color, boolean filled) {
		this.radius = radius;
		setColor(color);
		setFilled(filled);
	}
	
	
	//Accessor methods
	public double getRadius() {
		return radius;
	}
	public double getArea() {
		return radius*radius*Math.PI;
	}
	public double getPerimeter() {
		return 2*radius*Math.PI;
	}
	
	
	// Set methods 
	public double setRadius(double radius) {
		this.radius = radius;
		return radius;
	}
	
	
	 @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;
	        Circle circle = (Circle) obj;
	        return Double.compare(circle.radius, radius) == 0;
	    }
	 @Override
		public int compareTo(Circle o) {
			return Double.compare(this.radius, o.radius);
		}
	 @Override
	    public int hashCode() {
	        return Double.hashCode(radius);
	    }
	
	//Print Method
	public void printCircle() {
		System.out.println("The circle is created "+getDateCreated()+" and the radius is "+radius);
	}

	
}
