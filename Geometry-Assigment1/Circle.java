package geometry;

public class Circle {

	double radius;
	
	double getArea() {
		return Math.PI * radius * radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	double getPerimeter() {
		return 2 * Math.PI * radius;
	}
}
