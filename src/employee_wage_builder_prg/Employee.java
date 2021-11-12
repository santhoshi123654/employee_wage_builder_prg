package employee_wage_builder_prg;

public interface Employee {

	public void addCompanyEmpWage(String company, int empRatePerHour, int numOfworkingDays, int maxHoursPerMonth);

	public void computeEmpWage();
	int getTotalWage (String company);
}
