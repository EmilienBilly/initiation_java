package animalsInterface;

public class Aligator implements Run, Swim{
	private String name;
	
	public Aligator(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		System.out.println(name + " court. ");
	}
	
	@Override
	public void swim() {
		System.out.println(name + " nage. ");
	}
}
