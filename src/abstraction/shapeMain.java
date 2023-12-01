package abstraction;

public class shapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//circle c=new circle();
		//c.draw();
		circle c= new circle(45);
		System.out.println(c);
		Rectangle r=new Rectangle(32,10);
		System.out.println(r);
		c.display();
		
		

	}

}
