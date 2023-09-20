package hashMap;

import java.util.HashMap;

public class HashMapInit {

	public static void main(String[] args) {
		HashMap<String, String> capitalCities = new HashMap<String, String>();
		
		capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        
        String cityOfEngland = capitalCities.get("England");
        System.out.println("La capitale de l'Angleterre est : " + cityOfEngland);
        
        capitalCities.remove("England");
        System.out.println("Après suppression de l'Angleterre : " + capitalCities);
        
        int size = capitalCities.size();
        System.out.println(size);
        
        System.out.println("Liste des pays dans le Hashmap : ");
        
        for (String country : capitalCities.keySet()) {
            System.out.println(country);
        }

	}

}
