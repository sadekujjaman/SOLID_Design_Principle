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
 * Consider the payroll application of a software company. 
 * The Employee class is abstract 
 * and has an abstract method named calculatePay. 
 * It’s pretty clear that SalariedEmployee 
 * will implement this to return the employee’s salary. 
 * It’s also pretty clear that HourlyEmployee will implement it to return 
 * the hourly rate times the sum of the hours on this week’s time cards.
 * 
 * 
 * What would happen if we decided to add a VolunteerEmployee? 
 * How would we implement calculatePay?
 * 
 * At first this may seem obvious. We’d implement calculatePay to return zero as shown below.
	
	public class VolunteerEmployee extends Employee {
		public double calculatePay() {
			return 0;
		}
	}
	
 * This is not right. It doesn't make any sense to even call calculatePay on VolunteerEmployee.
 * We might find ourselves in the embarrassing situation of printing 
 * and mailing a paycheck with a gross pay of zero.
 * So maybe the best thing to do is to throw an exception, 
 * indicating that this function really shouldn’t have been called.
 
 	public class VolunteerEmployee extends Employee {
		public double calculatePay() {
			throw new UnpayableEmployeeException();
		}
	}
 
 * Now every call to calculatePay can throw an UnpayableEmployeeException, 
 * so either the exception must be caught or declared by the caller. 
 * Thus, a constraint upon a derivative has impacted the users of the base class.
 * If we use try catch this will be ugly, complicated, and distracting.
 * 
 * We can solve these problem by following The Liskov Substitution Principle.
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
		// this code violates Open Closed Principle
		for(Employee employee: employees) {
			if(employee instanceof SalariedEmployee) {
				totalPay += employee.calculatePay();
			}
			else if(employee instanceof HourlyEmployee) {
				totalPay += employee.calculatePay();
			}
			
		}
		
		/*
		 * This is ugly, complicated, and distracting
		 * 
		
		for (int i = 0; i < employees.size(); i++) {
			Employee e = (Employee) employees.get(i);
			try {
				totalPay += e.calculatePay();
			} catch (Exception e1) {
				
			}
		}
		
		*/
		
		/*
		 This is also violates Open Closed Principle.
		for(Employee employee: employees) {
			if(!(employee instanceof VolunteerEmployee)) {
				totalPay += employee.calculatePay();
			}	
		}
		
		 */
		return totalPay;
	}

}
