package employee_wage_builder_prg;

public class Employee_UC1 {
	public static void main(String[] args) {
		int IS_PRESENT = 1;
			double randNumber = Math.floor(Math.random()* 10)%2;
			if(IS_PRESENT == randNumber) {
		
			System.out.println("employee is present");
			}
			else {
				System.out.println("Employee is absent");
			}
		}

}

