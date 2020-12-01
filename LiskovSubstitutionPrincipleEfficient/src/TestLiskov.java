import java.util.*;


/**
 * 
 * @author Saju
 *
 */


/***
 * 
 * Liskov Substitution Principle(LSP): Subclass/derived class should be substitutable for their base/parent class.
 *
 * Recall Inefficient Code, we are getting trouble to calculate total pay of all employees 
 * because of VolunteerEmployee.
 * All this confusion has come about because we have violated the LSP. 
 * VolunteerEmployee is not substitutable for Employee. 
 * Users of Employee are impacted by the very presence of VolunteerEmployee. 
 * And this results in strange exceptions and odd instanceof clauses in if statements, 
 * all of which violate the OCP. We know we are violating the LSP whenever 
 * we try to make it illegal to invoke a function on a derivative. 
 * We may also be violating the LSP if we make a derivative method degenerate, 
 * i.e. implemented with nothing. 
 * In both cases we are saying that this function makes no sense in this derivative. 
 * And that’s a violation of LSP that can eventually lead to nasty exceptions and instanceof tests. 
 * 
 * Then what’s the solution to the VolunteerEmployee problem? 
 * 
 * Volunteers are not employees. It makes no sense to call calculatePay on them, 
 * so they should not derive from Employee, 
 * and they should not be passed to methods that need to call calculatePay.
 *
 *
 */


public class TestLiskov {

	public static void main(String[] args) {
		
		SalariedEmployee salariedEmployee1 = new SalariedEmployee(100000);
		SalariedEmployee salariedEmployee2 = new SalariedEmployee(400000);
		SalariedEmployee salariedEmployee3 = new SalariedEmployee(600000);
		SalariedEmployee salariedEmployee4 = new SalariedEmployee(900000);
		
		HourlyEmployee hourlyEmployee1 = new HourlyEmployee(10000, 22);
		HourlyEmployee hourlyEmployee2 = new HourlyEmployee(9000, 25);
		HourlyEmployee hourlyEmployee3 = new HourlyEmployee(12000, 19);
		HourlyEmployee hourlyEmployee4 = new HourlyEmployee(14000, 21);
		
		
		List<Employee> employees = new ArrayList<>();
		employees.add(salariedEmployee1);
		employees.add(salariedEmployee2);
		employees.add(salariedEmployee3);
		employees.add(salariedEmployee4);
		
		employees.add(hourlyEmployee1);
		employees.add(hourlyEmployee2);
		employees.add(hourlyEmployee3);
		employees.add(hourlyEmployee4);
		
		double totalPay = calculateTotalPay(employees);
		System.out.println(totalPay);
		
	}

	private static double calculateTotalPay(List<Employee> employees) {
		double totalPay = 0.0;
		for (Employee employee : employees) {
			totalPay += employee.calculatePay();
		}
		return totalPay;
	}

}
