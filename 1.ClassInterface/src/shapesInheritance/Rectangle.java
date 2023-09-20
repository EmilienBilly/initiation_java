package shapesInheritance;

public class Rectangle extends GeometricShape{
	private double height;
	private double width;
	
	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}
	
	@Override
	public String getName() {
		return "Rectangle";
	}
	
	public double calculateArea() {
		return height * width;
	}
}
