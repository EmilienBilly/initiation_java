package shapesInheritance;

public class Circle extends GeometricShape {
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public String getName() {
		return "Cercle";
	}
	
	public double calculateArea() {
		return Math.PI * radius *radius;
	}
}
