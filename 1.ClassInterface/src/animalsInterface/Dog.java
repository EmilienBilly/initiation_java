package animalsInterface;

public class Dog implements Run, Swim{
private String name;
	
	public Dog(String name) {
		this.name = name;
	}
	
	@Override
	public void swim() {
		System.out.println(name + " nage. ");
	}

	@Override
	public void run() {
		System.out.println(name + " court. ");
	}
}
