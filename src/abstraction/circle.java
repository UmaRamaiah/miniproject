package abstraction;

public class circle extends shape
{

	
		private int radius;
		public circle()
		{
			
		}
		public circle(int radius) {
			super();
			this.radius = radius;
		}
		public int getRadius() {
			return radius;
		}
		public void setRadius(int radius) {
			this.radius = radius;
		}


		@Override
		public double getArea() {
			return Math.PI*radius*radius;
			
		}
		@Override
		public double getPerimeter() {
			return 2*Math.PI*radius;
			
		}
		@Override
		public String toString() {
			return "Circle [radius=" + radius + ", getArea()=" + getArea() + ", getPerimeter()=" + getPerimeter() + "]";
		}
		@Override
		void draw() {
			// TODO Auto-generated method stub
			
		}
			
		}