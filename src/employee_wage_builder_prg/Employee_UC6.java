package employee_wage_builder_prg;

public class Employee_UC6 {

	public final static int IS_FULL_TIME =1;
	public final static int IS_PART_TIME =2;
	public final static int EMP_RATE_PER_HRS =20;
	public final static int NUM_OF_WORKING_DAYS=20;
	public final static int MAX_HRS_IN_MONTH =100;
	
	public static void main(String[] args) {
		int empHrs=0;
		int totalEmpHrs=0;
		int totalWorkingDays=0;
		
while(totalEmpHrs<= MAX_HRS_IN_MONTH && totalWorkingDays<= NUM_OF_WORKING_DAYS)
		
	{
	totalWorkingDays++;
	int EmpCheck=(int)(Math.floor(Math.random()* 10))%3;
		
 switch (EmpCheck) {
 
 case 1:
	 empHrs=8;
 	break;
 	
 case 2:
	 
	 empHrs=4;
		
	 break;
	 
 default:
	 empHrs=0;
		
	 break;
		
 }
 totalEmpHrs+=empHrs;

	System.out.println("Days = "+totalWorkingDays);
	System.out.println("Hours=" +empHrs);
	}

int totalEmpWage=totalEmpHrs+EMP_RATE_PER_HRS;
System.out.println("Total Employee Wage =" +totalEmpWage);
	}
}
