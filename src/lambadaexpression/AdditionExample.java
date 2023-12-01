package lambadaexpression;

public class AdditionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Addition a=(x,y)->
			{
				return x+y;
			};
			System.out.println(a.add(4, 5));
			a.display();


	}

}
