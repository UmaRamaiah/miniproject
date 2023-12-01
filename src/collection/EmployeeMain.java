package collection;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee("Uma",56000,"pune");
		Employee e2=new Employee("sri",70000,"banglore");

		Employee e3=new Employee("mathi",66000,"mumbai");

		ArrayList<Employee>emplist=new ArrayList<Employee>();
		emplist.add(e1);
		emplist.add(e2);

		emplist.add(e3);
		System.out.println(emplist);
		
		System.out.println("=================Sorting==================");
		Collections.sort(emplist);
       for(Employee e:emplist)
       {
    	   System.out.println(e);
       }
	


	}

}
