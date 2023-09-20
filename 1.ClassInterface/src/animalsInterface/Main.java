package animalsInterface;

public class Main {

	public static void main(String[] args) {
		// Création d'un animal
		Animal aligator = new Animal("Alligator");
		
		aligator.swim();
		
		aligator.run();
		
		
		Animal snake = new Animal("Serpent");
		
		snake.crawl();
		snake.climb();
		snake.swim();
		
		Dog dog = new Dog("Caniche");
		dog.swim();
		dog.run();
	}

}
