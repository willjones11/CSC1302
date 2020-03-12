package Lab8;
import java.awt.*;

public class CircleClient {
	public static void main(String[] args) {
		Point center = new Point(10,5);
		Circle circle = new Circle(center, 7);
		System.out.println(circle.toString());
		System.out.println("Area = " + circle.getArea());
		System.out.println("Circumference= " + circle.getCircumference());
		Point p2 = new Point(5,7);
		if (circle.contains(center, p2)) {
			System.out.println(" ("+ p2 +" ) lies within the circle");
			
		}
		else {
			System.out.println("(" + p2 + ") doesnt lie within the circle");
		}
	}
}
