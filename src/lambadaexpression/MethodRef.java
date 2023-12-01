package lambadaexpression;

public class MethodRef 
{
	static void display()
	{
		System.out.println("hello");
	}
	public static void main(String[] args) {
	
		//	MethodRef m=new MethodRef();
		Demo d=MethodRef::display;
		
		d.demo();

	}

}
