package abstraction;

public class Rectangle extends shape{
	 private int width;
	    private int height;

	    public Rectangle() {
	    }

	    public Rectangle(int width, int height) {
	        super();
	        this.width = width;
	        this.height = height;
	    }

	    public int getWidth() {
	        return width;
	    }

	    public void setWidth(int width) {
	        this.width = width;
	    }

	    public int getHeight() {
	        return height;
	    }

	    public void setHeight(int height) {
	        this.height = height;
	    }

	    @Override
	    public double getArea() {
	        return width * height;
	    }

	    @Override
	    public double getPerimeter() {
	        return 2 * (width + height);
	    }

	    @Override
	    public String toString() {
	        return "Rectangle [width=" + width + ", height=" + height + ", getArea()=" + getArea() + ", getPerimeter()=" + getPerimeter() + "]";
	    }

	    @Override
	    void draw() {
	        // Implement the draw method for Rectangle
	    }

}
