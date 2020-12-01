
/**
 * 
 * @author Saju
 *
 */


/***
 * 
 * Open-Closed Principle(OCP): Entities should be open for extension, but closed for modification.
 * 
 * Currently we have two shape Rectangle and Circle.
 * We are calculating their cost per unit area with the following calculate method.
 * For this we have to calculate area of respective shape(Rectangle or Circle) then
 * multiply area with cost per unit.
 * 
 * Now if we want to calculate the cost for Square(or another shape) we don't need to modify 
 * calculate method in CostManager class.
 *  
 *  Now we can find Square’s area(or other shape's area) without modifying CostManager class
 *
 */
public class CostManager {

	public double calculate(AreaInterface shape) {
		double costPerUnit = 1.5;
		double area = shape.calculateArea();
		return area * costPerUnit;
	}
	
}
