package employee_wage_builder_prg;

public class EmployeeWageCompute {
	
	public static final int IS_PRESENT = 1;
	public static final int IS_PART_TIME = 2;
	public static final int NO_OF_DAYS = 20;
	public static final int TOTAL_WORKING_HRS = 100;
	public static final int WAGE_PER_HOUR = 20;

	public static int computeEmployeeWage() {
		int total_hrs = 0;
		int total_emp_hrs = 0;
		int total_wage = 0;
		int total_working_days = 0;
		while (NO_OF_DAYS >= total_working_days && TOTAL_WORKING_HRS >= total_hrs) {
			total_working_days++;
			int empCheck = (int)Math.floor(Math.random() * 10) % 3;
			
			switch ((int) empCheck) {
			case IS_PRESENT:
				total_hrs = 8;
				System.out.println("employee is present  ");
				break;
			case IS_PART_TIME:
				total_hrs = 4;
				System.out.println("employee is part time");
				break;
			default:
				total_hrs = 0;
			}
			total_emp_hrs += total_hrs;

		}
		int wage = total_emp_hrs * WAGE_PER_HOUR;
		System.out.println("employee wage : " + wage);
		System.out.println("employee  working hrs :" + total_emp_hrs);
		return total_emp_hrs;
	}
	public static void main(String[] args) {
		computeEmployeeWage();
		
	}
	
}
