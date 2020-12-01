
/**
 * 
 * @author Saju
 *
 */
public class HourlyEmployee extends Employee {

	private double totalWorkHours;
	private double hourRate;

	public HourlyEmployee(double hourRate) {
		this.hourRate = hourRate;
		totalWorkHours = 0.0;
	}

	public HourlyEmployee(double hourRate, double totalWorkHours) {
		this.hourRate = hourRate;
		this.totalWorkHours = totalWorkHours;
	}

	public double getTotalWorkHours() {
		return totalWorkHours;
	}

	public void setTotalWorkHours(double totalWorkHours) {
		this.totalWorkHours = totalWorkHours;
	}

	public double getHourRate() {
		return hourRate;
	}

	public void setHourRate(double hourRate) {
		this.hourRate = hourRate;
	}

	@Override
	public double calculatePay() {
		return this.hourRate * totalWorkHours;
	}

}
