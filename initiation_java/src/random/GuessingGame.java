package random;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner scanner = new Scanner(System.in);
            
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        
        int essais = 0;
        
        while( true ) {
            System.out.println( "Veuillez saisir un chiffre entre 1 et 10" );
            int value = scanner.nextInt();
            essais++;
            
            if ( value == randomNumber ) {
                System.out.println( "Bravo, vous avez trouvé en " + essais + " essais." );
                break;
            } else if ( value < randomNumber ) {
                System.out.println( "La valeur à trouver est plus grande." );
            } else {
                System.out.println( "La valeur à trouver est plus petite." );
            }
        }
         
    }

}
