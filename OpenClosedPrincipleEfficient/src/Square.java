
/**
 * 
 * @author Saju
 *
 */
public class Square implements AreaInterface {
	
	private double length;
	
	public Square(double length) {
		this.length = length;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public double calculateArea() {
		return this.length * this.length;
	}
	
	
}
