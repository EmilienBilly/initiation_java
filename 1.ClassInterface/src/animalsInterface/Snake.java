package animalsInterface;

public class Snake implements Crawl, Swim, Climb{
private String name;
	
	public Snake(String name) {
		this.name = name;
	}
	
	@Override
	public void crawl() {
		System.out.println(name + " rampe. ");
	}
	
	@Override
	public void swim() {
		System.out.println(name + " nage. ");
	}

	@Override
	public void climb() {
		System.out.println(name + " grimpe. ");
	}
}
