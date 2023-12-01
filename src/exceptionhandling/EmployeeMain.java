package exceptionhandling;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Employee e1=new Employee("uma",56000,"pune");
	        Employee e2=new Employee("sri",70000,"banglore");

	        Employee e3=new Employee("mathi",66000,"mumbai");

	        System.out.println(e1);
	        System.out.println(e2);
	        System.out.println(e3);
	        System.out.println("==================================");
	        maxSalary(e2);
	    }
	    
	    public static void maxSalary(Employee e)
	    {
	        if(e.getSalary()>60000)
	        {
	            System.out.println("Eligible for OnSite Work");
	        }
	        else
	        {
	            try
	            {
	            throw new NotEligibleForOnsiteException("no eligible for onsite");
	            }
	            catch(NotEligibleForOnsiteException s)
	            {
	                System.out.println(s);
	            }

	}

}
}
