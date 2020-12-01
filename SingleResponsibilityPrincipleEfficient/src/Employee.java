
/**
 *
 * @author Saju
 *
 */


/***
 *
 *
 * Single Responsibility Principle(SRP): A class/entity should have one, and only one, reason to change.
 *
 * From Inefficient Employee class, we have to modify the class to remove problems.
 * We are going to implement Single Responsibility Principle.
 * 
 * We have to separate all these concepts into their own classes 
 * so that each class has one, and only one, reason to change. 
 * We’d like the Employee class to deal with pay and taxes, 
 * an XML related class to deal with converting Employee instances to and  from XML, 
 * an EmployeeDatabase class to deal with reading and writing Employee instances to and from the database, 
 * and individual classes for each of the various reports. In short, we want a separation of concerns.
 * 
 */
public class Employee {

	public double calculatePay() {
		return 0.0;
	}

	public double calculateTaxes() {
		return 0.0;
	}
}
