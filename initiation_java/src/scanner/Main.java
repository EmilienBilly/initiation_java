package scanner;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Scanner userInputName = new Scanner(System.in);
			System.out.println("Entrer username");
			
			String userName = userInputName.nextLine(); // Lire l'inout
			System.out.println("username is : " + userName);
			
			// Faire un input de type int
			Scanner userInputAge = new Scanner(System.in);
			System.out.println("Enter your age");
			int userAge = userInputAge.nextInt();
			
			System.out.println("Votre âge : " + userAge);
			
			userInputName.close();
			userInputAge.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
