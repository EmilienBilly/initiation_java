package queue;

import java.util.LinkedList;
import java.util.Queue;

public class InitQueue {

	public static void main(String[] args) {
		// Création d'une file d'attente en utilisant LinkedList
		Queue<String> queue = new LinkedList<>();
		
		// Enfiler des éléments dans la file d'attente
		queue.offer("Client 1");
		queue.offer("Client 2");
		
		// Afficher la liste d'attente
		System.out.println("File d'attente initiale : " + queue);
		
		// Défiler des éléments (retirer de la tête de la file)
		String clientServi = queue.poll();
		System.out.println(clientServi + ".est servi");
		
		// Afficher la file d'attente après le service
		System.out.println("File d'attente après service : " + queue);
		
		// Accéder à l'élément en tête de la file dans le retirer
		String prichainClient = queue.peek();
		System.out.println("");
	}

}
