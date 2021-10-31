package employee_wage_builder_prg;

public class Employee_UC4 {
	public final static int IS_FULL_TIME =1;
	public final static int IS_PART_TIME =2;
	public final static int EMP_RATE_PER_HRS =20;
	
	public static void main(String[] args) {
			int empHrs=0;
			int empWage=0;
	double randomNumber = Math.floor(Math.random()* 10)%3;
	
	
        switch ((int)randomNumber) {
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
	
		empWage = empHrs*EMP_RATE_PER_HRS;
		System.out.println("EMP WAGE " +empWage);
		
	}
}

