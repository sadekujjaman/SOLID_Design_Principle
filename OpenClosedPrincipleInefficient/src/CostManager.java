
/**
 * 
 * @author Saju
 *
 */


/***
 * 
 * Currently we have two shape Rectangle and Circle.
 * We are calculating their cost per unit area with the following calculate method.
 * For this we have to calculate area of respective shape(Rectangle or Circle) then
 * multiply area with cost per unit.
 * 
 * Now if we want to calculate the cost for Square(or another shape) we have to modify 
 * calculate method in CostManager class. We need to add another code snippet 
 * for Square(or another shape) to calculate area.
 *  
 * It breaks the open-closed principle. 
 * According to this principle, we can not modify we can extend.
 *
 */
public class CostManager {

	public double calculate(Object obj) {
		double costPerUnit = 1.5;
		double area = 0.0;
		
		if(obj instanceof Rectangle) {
			Rectangle rectangle = (Rectangle) obj;
			area = rectangle.getWidth() * rectangle.getHeight();
		}
		else if(obj instanceof Circle) {
			Circle circle = (Circle) obj;
			area = circle.getRadius() * circle.getRadius() * Math.PI;
		}
		return area * costPerUnit;
	}
	
}
