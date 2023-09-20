package shapesInterface;

public class Rectangle implements GeometricShape{
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
	
	@Override
	public double calculateArea() {
		return height * width;
	}
}
