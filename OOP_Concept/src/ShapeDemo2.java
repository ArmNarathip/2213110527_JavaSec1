import java.util.*;
public class ShapeDemo2 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		double[] radius	= new double[5];
		double[] height = new double[5];
		for(int i=0;i<=4;i++) {
			radius[i] = scan.nextDouble();
			height[i] = scan.nextDouble();
		}		
		for(int i=0;i<=4;i++) {
			Cylinder cld = new Cylinder(radius[i],height[i]);
			System.out.println("Cylinder "+(i+1)+", volume="+cld.getVolume());
		}
	}
}
