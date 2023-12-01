package lambadaexpression;

public class MethodRef2 {
	 MethodRef2()
		{
			System.out.println("hello");
		}


	public static void main(String[] args) {
		
		//MethodRef m=new MethodRef();
		
				Demo d=MethodRef2::new;
				d.demo();

	}

}
