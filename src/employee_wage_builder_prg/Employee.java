package employee_wage_builder_prg;

public interface Employee {

	public void addcompanyEmpWage(String company, int empRatePerHour, int numOfworkingDays, int maxHoursPerMonth);
	
	public void computeEmpWage();
	
	}
