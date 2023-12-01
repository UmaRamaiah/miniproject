package oops;

public class Employee1main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 employee1=new Employee1();
		employee1.e1Id=1001;
		employee1.e1Name="Uma";
		employee1.salary=25000;
		employee1.address="KSM nagar";

		 System.out.println("Employee 1 Details:");
	        System.out.println(employee1);
		 System.out.println("===============================");
		 
		 Employee1 employee2=new Employee1();
			employee2.e1Id=1001;
			employee2.e1Name="Sri";
			employee2.salary=35000;
			employee2.address="KSM nagar";
			
			 System.out.println("\nEmployee 2 Details:");
		        System.out.println(employee2);

	}

}
