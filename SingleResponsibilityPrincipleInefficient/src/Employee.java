import java.io.*;

/**
 *
 * @author Saju
 *
 */


/***
 *
 * Single Responsibility Principle(SRP): A class/entity should have one, and only one, reason to change.
 * 
 * Employee class knows too many things.
 * 
 * Fragility: A change to one part of the system causes it to break in many other,
 * completely unrelated, parts.
 * 
 * This class knows way too much. 
 * It knows how to calculate pay and taxes,
 * how to read and write itself on disk, 
 * how to convert itself to XML and back, 
 * and how to print itself on various reports. 
 * This class has Fragility problem. 
 * Change from SAX to JDOM and we have to change Employee. 
 * Change from Access to Oracle, and we have to change Employee.
 * Change the format of the tax report and we have to change Employee. 
 * This design is badly coupled.
 * 
 */
public class Employee {

	public double calculatePay() {
		return 0.0;
	}

	public double calculateTaxes() {
		return 0.0;
	}

	public void writeToDisk() {

	}

	public void readFromDisk() {

	}

	public String createXML() {
		return null;
	}

	public void parseXML(String xml) {

	}

	public void displayOnEmployeeReport(PrintStream stream) {

	}

	public void displayOnPayrollReport(PrintStream stream) {

	}

	public void displayOnTaxReport(PrintStream stream) {

	}

}
