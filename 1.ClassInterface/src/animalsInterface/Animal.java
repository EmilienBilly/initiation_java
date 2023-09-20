package animalsInterface;

public class Animal implements Climb, Swim, Crawl, Fly, Run {
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	@Override
	public void climb() {
		System.out.println(name + " grimpe.");
	}
	
	@Override
	public void swim() {
		System.out.println(name + " nage.");
	}
	
	@Override
	public void crawl() {
		System.out.println(name + " rampe.");
	}
	
	@Override
	public void fly() {
		System.out.println(name + " vole.");
	}
	
	@Override
	public void run() {
		System.out.println(name + " court.");
	}
}
