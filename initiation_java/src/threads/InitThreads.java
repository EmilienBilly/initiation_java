package threads;

public class InitThreads {

	public static void main(String[] args) {
		// Créer et démarrer un thread
		Thread thread1 = new Thread(new MonRunnable("Thread 1"));
		thread1.start();
		
		// Créer et démarrer un autre thread
		Thread thread2 = new Thread(new MonRunnable("Thread 2"));
		thread2.start();
		
		// Attendre que les deux threads se terminent
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			System.err.println("Le thread principal a été interrompu");
		}
		
		// Afficher un message lorsque les threads sont terminés
		System.out.println("Les threads ont terminé leur exécution");
	}

}
