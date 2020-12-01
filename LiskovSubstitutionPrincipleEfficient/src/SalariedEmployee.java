
/**
 * 
 * @author Saju
 *
 */
public class SalariedEmployee extends Employee {

	private double salary;

	public SalariedEmployee(double salary) {
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public double calculatePay() {
		return this.salary;
	}

}
