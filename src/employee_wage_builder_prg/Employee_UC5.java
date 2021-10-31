package employee_wage_builder_prg;

public class Employee_UC5 {
	public final static int IS_FULL_TIME =1;
	public final static int IS_PART_TIME =2;
	public final static int EMP_RATE_PER_HRS =20;
	
	public static void main(String[] args) {
		
		int totalEmpHrs = 0;
	for (int i = 1;i <=20; i++)
	{
		int randomNumber =(int)Math.floor(Math.random()* 10)%3;
		int empHrs=0;
		
    switch (randomNumber) {
    	case IS_FULL_TIME:
    	   System.out.println("Employee is Present");
    	empHrs=8;
    	      break;
    	case IS_PART_TIME:
		   System.out.println("Employee is present but Part Time");
		empHrs=4;
    	      break;
    	default:
			System.out.println("Employee is Absent");
			break;
    }
    totalEmpHrs+= empHrs;
	
	}
	
	int empWage = totalEmpHrs*EMP_RATE_PER_HRS;
	System.out.println("Emp Wage of month : " + empWage);
	
       }

}
