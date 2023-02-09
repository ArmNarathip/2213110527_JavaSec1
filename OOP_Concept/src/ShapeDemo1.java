import java.util.*;
public class ShapeDemo1 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {	
		double radius = scan.nextDouble();
		double height = scan.nextDouble();
		Circle cr = new Circle(radius,null);
		System.out.println("Circle[radius="+radius+"]");
		System.out.println("Circle[area="+cr.getArea()+"]");
		System.out.println();
		System.out.println("Cylinder[height="+height+",radius="+radius+"]");
		Cylinder cld = new Cylinder(radius,height);
		System.out.println("Cylinder[area="+cld.getArea()+"]");
		System.out.println("Cylinder[volume="+cld.getVolume()+"]");
	}

}
