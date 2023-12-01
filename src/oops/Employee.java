package oops;

public class Employee {
	
	private int employeeId;
	private String employeeName;
	private int salary;
	private String address;
	 private static int idgen=8001;
	    public Employee()
	    {
	        employeeId=idgen++;
	    }
	    Employee( int employeeId, String employeeName, int salary, String address) {
	        this.employeeId = employeeId;
	        this.employeeName = employeeName;
	        this.salary = salary;
	        this.address = address;
	    }
	    
	    public int geteId() {
	        return employeeId;
	    }
	    public void seteId(int employeeId) {
	        this.employeeId = employeeId;
	    }
	    public String geteName() {
	        return employeeName;
	    }
	    public void seteName(String eName) {
	        this.employeeName = employeeName;
	    }
	    public int getSalary() {
	        return salary;
	    }
	    public void setSalary(int salary) {
	        this.salary = salary;
	    }
	    public String getAddress() {
	        return address;
	    }
	    public void setAddress(String address) {
	        this.address = address;
	    }
	    public static int getIdgen() {
	        return idgen;
	    }
	    public static void setIdgen(int idgen) {
	        Employee.idgen = idgen;
	    }
	
	double annualSalary()
	{
		int annualSal=salary*12;
		return annualSal;
	}
	double Pf()
	{
		double pf=(salary*18)/100.0;
		return pf;
	}



	
			  
			  
		  }
		  
		
	
	
	
	
		

	


