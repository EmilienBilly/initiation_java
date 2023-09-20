package arrayList;

import java.util.ArrayList;

public class ArrayListInit {

	public static void main(String[] args) {
		ArrayList<String> capitalList = new ArrayList<>();
		
		capitalList.add("England:London");
		capitalList.add("Germany:Berlin");
		capitalList.add("Norway:Oslo");
		capitalList.add("USA:Washington DC");
		
		String cityOfEngland = null;
		for (String capital : capitalList) {
			String[] keyValue = capital.split(":");
			if (keyValue.length == 2 && keyValue[0].equals("England") ) {
				cityOfEngland = keyValue[1];
				break;
			}
		}
		System.out.println("La capitale de l'Angleterre est : " + cityOfEngland);
		
		capitalList.remove(0);
		System.out.println(capitalList);
		
		int listSize = capitalList.size();
		System.out.println(listSize);
		
		System.out.println("Liste des pays dans la liste: ");
		for (String capital : capitalList) {
			String [] keyValue = capital.split(":");
			if (keyValue.length == 2) {
				System.out.println(keyValue[0]);
			}
		}
	}

}
