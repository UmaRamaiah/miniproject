package oops;

public class Empolyeemain {
	

	public static void main(String[] args) {
		 Employee employee1 = new Employee(1001, "mathi", 50000, "123 Main St.");
		 
		
		System.out.println("Employee Id"+employee1.geteId());
		System.out.println("Emlopyee Name"+employee1.geteName());
		System.out.println("Employee Adress"+employee1.getAddress());
		System.out.println("Employee Salary"+employee1.getSalary());
		System.out.println("Employee AnnualSalary"+ employee1.annualSalary());
		System.out.println(employee1.Pf());
		 System.out.println("===============================");
		    Employee employee2=new Employee(1002,"Sri", 60000, "456 Elm St.");
			
			System.out.println("Employee Id:"+employee2.geteId());
			System.out.println("Emlopyee Name:"+employee2.geteName());
			System.out.println("Employee Adress:"+employee2.getAddress());
			System.out.println("Employee Salary:"+employee2.getSalary());
			System.out.println("Employee AnnualSalary:"+employee2.annualSalary());
			System.out.println( employee2.Pf());

	
	
	 
	

	

	}
}

