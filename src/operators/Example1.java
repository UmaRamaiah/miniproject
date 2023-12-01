package operators;

public class Example1 {

	public static void main(String[] args) {
		  int x = 10;
	        int y = 2;
	        
	        int z = (x++) + (--x) + (x--) + (--y);
	        
	        System.out.println("x: " + x);
	        System.out.println("y: " + y);
	        System.out.println("z: " + z);

	}

}
