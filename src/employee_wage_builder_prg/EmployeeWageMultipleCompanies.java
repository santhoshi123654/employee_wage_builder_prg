package employee_wage_builder_prg;

public class EmployeeWageMultipleCompanies {
	public static final int IS_PRESENT = 1;
	public static final int IS_PART_TIME = 2;
	
		public static int calculationOfWage(String company_Name ,int wagePerHour,int total_Working_Hours,int total_Working_Days) {

	    int total_hrs = 0;
		int emp_hrs = 0;
		int total_emp_hrs=0;
		int no_Of_days = 0;
		while (total_emp_hrs<=total_Working_Days && no_Of_days<total_Working_Days) {
			total_Working_Days++;
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
		int wage = total_emp_hrs * wagePerHour;
		System.out.println("The "+company_Name+" has employee working hours "+total_emp_hrs+" total wage "+wage);
		return total_emp_hrs;
	}
	public static void main(String[] args) {
		calculationOfWage("jio",50,25,30);
		calculationOfWage("dmart",55,22,27);
	}
}