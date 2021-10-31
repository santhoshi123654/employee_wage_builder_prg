package employee_wage_builder_prg;

public class Employee_UC2 {
	public static void main(String[] args) {
	    
		int IS_PRESENT=1;
	    int IS_PART_TIME=2;
	    int EMP_RATE_PER_HRS=20;
	    
	    int empHrs=0;
		int empWage=0;
			double randomNumber = Math.floor(Math.random()* 10)%3;
			
			if(IS_PRESENT == randomNumber) {
			System.out.println("The employee is present ");
	     		empHrs=8;
			}
			else
			{
				System.out.println("Employee is absent ");
			}
			  empWage=empHrs*EMP_RATE_PER_HRS;
			  System.out.println("Emp Wage :" +empWage);
			  
	     }
	 }
