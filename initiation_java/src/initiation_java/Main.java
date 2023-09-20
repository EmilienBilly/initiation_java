package initiation_java;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num;
		 num = 15;
		 
		 // Data types 
		 int chiffre = 5;
		 float monFloat = 4.5f;
		 char monChar = 'D';
		 boolean monBoolean = true;
		 String monTexte = "chaine de caractere";
		 
		 // Typqge avancé Java
		 byte chiffreByte = 127; // entre -128 jusqu'a 127
		 short chiffreShort = 32000; // entre -32,768 jusqu'a 32.767
		 
		 // Type casting 
		 // byte -> short -> char -> int -> long -> float -> double
		 // double -> float -> long -> int -> char -> short -> byte
		 
		 // opéateur d'assignement
		 // =	x = 5
		 // +=	x += 3 equivalent de x = x+3
		 // -=
		 // *= 
		 // /=
		 // %=
		 
		 // Opérateur de comparaison 
		 // ==
		 // !=
		 // >
		 // <
		 // >=
		 // <=
		 
		 // Opérateur logique
		 // &&
		 // ||
		 // !
		 
		 // méthodes de la classe String
		 String prenom = "Emilien";
		 System.out.println(prenom.toUpperCase());
		 System.out.println(prenom.toLowerCase());
		 
		 // Variables swapping 
		 int x = 100;
		 int y = 200;
		 System.out.println("Avant le swap");
		 System.out.println("X = " + x);
		 System.out.println("Y = " + y);
		 
		 // Swapping avec 3 variables
		 int temps = x;
		 x = y;
		 y = temps;
		 System.out.println("Apres le swap");
		 System.out.println("X = " + x);
		 System.out.println("Y = " + y);
		 
		 // Math
		 System.out.println("la plus grande valeur est " + Math.max(5, 3));
		 
		 // Conditions 
		 
	}
		 
}
