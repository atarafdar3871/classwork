package shapes;

/**
 * @author Mr Levin Created 10/16/2017 Lab 2.1 shapes
 *
 */
public class Circle implements Shape {

	// fields
	private int radius;
	private static double pi = 3.14;

	/**
	 * Constructor method
	 * 
	 * @param radius
	 */
	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {

		// A = (pi)(r)^2
		//return Math.PI * Math.pow(this.radius, 2);
		return pi * Math.pow(this.radius, 2);
	}

	@Override
	public double calculatePerimeter() {
		return 2 * pi * this.radius;
	}

	@Override
	public String toString() {
		return String.format("Circle with radius: %d, Area: %f, Perimeter: %f.", this.radius, this.calculateArea(), this.calculatePerimeter());
	}
}
