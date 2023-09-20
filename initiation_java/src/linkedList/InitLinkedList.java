package linkedList;

import java.util.LinkedList;

public class InitLinkedList {

	public static void main(String[] args) {
		// Création d'une liste chaînée
		LinkedList<String> linkedList = new LinkedList<>();
		
		// Ajouter des éléments dans la liste
		linkedList.add("Manger");
		linkedList.add("Boire");
		linkedList.add("Dormir");
		
		// Affichage de la liste
		System.out.println("Liste chaînée initiale : " + linkedList);
		
		// Ajout d'un élément au début de la liste
		linkedList.addFirst("Nouvel élément en premier");
		
		// Ajouter un élément en dernier
		linkedList.addLast("Nouvel élément en dernier");
		
		// Supprimer un élément avec son indice
		linkedList.remove(1);
		
	}

}
