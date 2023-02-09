	
public class Cylinder extends Circle {
	private double height;
	public Cylinder(double radius,double height) {
		super(radius, null);
		this.height = height;
	}
	public double getHeight() {
		return this.height;
	}
	public double getVolume() {
		return Math.PI*getRadius()*getRadius()*height;
	}
	public double getArea() {
		return 2*Math.PI*(height+getRadius());
	}
	public String toString() {
		return "height="+height+","+toString();
	}
}
