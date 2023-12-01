package lambadaexpression;

public class CubeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Cube cube = x -> x * x * x;
	        double number = 5.0;
	        double result = cube.Cube(number);
	        System.out.println(result);

	}

}
