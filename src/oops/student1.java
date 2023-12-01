package oops;

public class student1 {
	

	int sId;
	String sName;
	int m1,m2,m3,m4,m5;
	double percentage()
	{
		int total=m1+m2+m3+m4+m5;
		double percentage=(total*100)/500.0;
		return percentage;
	}

	public String toString()
	{
		return "Id=:"+sId+" \nSname=:"+sName+"\nm1=:"+m1+"\nM2=:"+m2
				+"\nM3=:"+m3+"\nm4=:"+m4+"\nm5=:"+m5+"Percentage=:"+percentage();
	

	

	}
}


