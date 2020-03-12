package Lab8;
import java.awt.*;
import java.util.*;

	public class Circle{
		public Point center;
		private int radius;
	Point p = new Point();
	private double x = p.x;
	private double y = p.y;
	public Circle(Point center, int radius) {
		this.radius = radius;
		this.center = center;
	}
	
	public Point getCenter() {
		return center;
	}
	public int getRadius() {
		return radius;
	}
	public double getCircumference() {
		return 2 * Math.PI * radius;
	}
	public double getArea() {
		return Math.PI * radius * radius;	
	}
	public String toString() {
		return ("Circle[center= (" + p.x + ", " + p.y + "), radius= " + radius + "]");
		
	}
	public boolean contains(Point p, Point p1) {
		if(Math.sqrt(Math.pow(p.x - p1.x, 2) + Math.pow(p.y - p1.y, 2)) <= radius) {
			return true;
		}
		return false;
	}
	
}
