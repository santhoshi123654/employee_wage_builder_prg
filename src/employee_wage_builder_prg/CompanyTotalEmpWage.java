package employee_wage_builder_prg;

public class CompanyTotalEmpWage {

		public static final int IS_PART_TIME = 1;
		public static final int IS_FULL_TIME = 2;

		private final String company;
		private final int empRatePerHour;
		private final int numOfWorkingDays;
		private int maxHoursPerMonth;
		private int totalEmpWage;

		public CompanyTotalEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
			super();
			this.company = company;
			this.empRatePerHour = empRatePerHour;
			this.numOfWorkingDays = numOfWorkingDays;
			this.maxHoursPerMonth = maxHoursPerMonth;
		}

		public void computeEmployeeWage() {

			int empHrs = 0;
			int totalEmpHrs = 0;
			int totalWorkingDays = 0;

			while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
				totalWorkingDays++;
				int empCheck = (int) Math.floor(Math.random() * 10) % 3;
				switch (empCheck) {
				case IS_PART_TIME:
					empHrs = 4;
					break;
				case IS_FULL_TIME:
					empHrs = 8;
					break;
				default:
					empHrs = 0;
				}
				totalEmpHrs += empHrs;
				System.out.println("Day :" + totalWorkingDays + " Emp Hr: " + empHrs);
			}
			totalEmpWage = totalEmpHrs * empRatePerHour;
			System.out.println("Total Emp Wage for " + company + " Company: " + totalEmpWage);

		}

		@Override
		public String toString() {
			return "EmployeeWage [company=" + company + ", totalEmpWage=" + totalEmpWage + "]";
		}

		public static void main(String[] args) {

			CompanyTotalEmpWage dMart = new CompanyTotalEmpWage("DMart", 20, 2, 10);
			CompanyTotalEmpWage jio = new CompanyTotalEmpWage("jio", 10, 4, 20);
			dMart.computeEmployeeWage();
			System.out.println(dMart);
			jio.computeEmployeeWage();
			System.out.println(jio);

		}
	}
