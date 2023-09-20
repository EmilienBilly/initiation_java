package initiation_java;

public class TableauMultidimensionnel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Création d'un tableau multi
		int [][] tableau = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9},
		};
		
		// Itération sur un tableau multi
		for (int i = 0; i < tableau.length; i++) {
			for ( int j = 0; j < tableau [i].length; j++) {
				System.out.println(tableau[i][j] + "");
			}
			// pour passer a la ligne 
			System.out.println();
		}
		
		String [][] tableauMulti = {
				{"natation", "vélo", "course a pieds"},
				{"triathlon", "cyclisme", "athlétisme"},
		};
		
		for ( int i = 0; i < tableauMulti.length; i++) {
			for ( int j = 0; j < tableauMulti [i].length; j++) {
				System.out.println(tableauMulti[i][j] + "");
			}
			System.out.println();
		}
	}

}
