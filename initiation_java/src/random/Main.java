package random;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random = new Random();
		
		// Génerer un nombre aléatoire entre 0 et 1
		double randomNumber = random.nextDouble();
		System.out.println(randomNumber);
		
		
		// Générer un nombre entier entre 1 et 10
		int randomNumberInt = random.nextInt(10);
		System.out.println(randomNumberInt);
	}

}
