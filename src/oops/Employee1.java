package oops; 

public class Employee1 {


	int e1Id;
	String e1Name;
	int salary;
	String address;
	
	
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


       public String toString() 
       {
    	   
             
			return "ID: " + e1Id + "\nName: " + e1Name + "\nSalary: " + salary + "\nAddress: " + address +
            "\nPF (18%): " + Pf() + "\nAnnual Salary: " + annualSalary();

       
       }
}



