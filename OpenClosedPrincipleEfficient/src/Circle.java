
/**
 * 
 * @author Saju
 *
 */
public class Circle implements AreaInterface {

	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return this.radius * this.radius * Math.PI;
	}

}
