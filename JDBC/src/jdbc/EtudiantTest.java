package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EtudiantTest {

	public static void main(String[] args) {
		
		// Les infos de connexion à la DB
		String jdbcUrl = "jdbc:mysql://localhost:3306/JDBC"; // URL de la base de données (changez-la en fonction de votre configuration)
        String user = "root"; // Nom d'utilisateur MySQL
        String password = ""; // Mot de passe MySQL
        
        try {
            // Étape 1 : Charger le pilote JDBC MySQL
            // Le pilote JDBC doit être chargé pour que vous puissiez l'utiliser pour vous connecter à MySQL.
            // Ici, nous utilisons la méthode statique forName() pour charger le pilote.
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Étape 2 : Établir une connexion à la base de données
            // La méthode getConnection() établit une connexion à la base de données en utilisant l'URL, le nom d'utilisateur et le mot de passe fournis.
            Connection connection = DriverManager.getConnection(jdbcUrl, user, password);

            // Étape 3 : Vérifier si la connexion a réussi
            // Nous vérifions si la connexion est différente de null pour déterminer si la connexion a réussi.
            if (connection != null) {
                System.out.println("Connexion à la base de données réussie !");
            } else {
                System.out.println("La connexion à la base de données a échoué.");
            }
            
            System.out.println("MENU");
            System.out.println("1: Ajouter un étudiant");
            System.out.println("2: Supprimer l'étudiant");
            System.out.println("3: Mettre à jour l'étudiant");
            System.out.println("4: Afficher la liste des étudiants");
            System.out.print("Enterez votre choix : ");
            
            try (Scanner userInput = new Scanner(System.in)) {
				String choice = userInput.nextLine(); // Lire l'inout
				
				switch(choice){
				   
			       case "1": 
			           System.out.println("Vous avez choisi d'ajouter un étudiant");
			           
			           // data to insert
			           String nom = "Billy";
			           String prenom = "Emilien";
			           String dateDeNaissance = "1995-07-05";
			           String email = "emilien.billy@gmail.com";
			           String matricule = "E240";
			           
			           String sqlRequest = "INSERT INTO etudiants (nom, prenom, date_naissance, email, matricule) VALUES (?, ?, ?, ?, ?);";
			            
			            PreparedStatement preparedStatement = connection.prepareStatement(sqlRequest);
			            
			            preparedStatement.setString(1, nom);
			            preparedStatement.setString(2, prenom);
			            preparedStatement.setString(3, dateDeNaissance);
			            preparedStatement.setString(4, email);
			            preparedStatement.setString(5, matricule);
			            
			            int affectedLines = preparedStatement.executeUpdate();
			            
			            if (affectedLines > 0) {
			            	System.out.println("Insertion OK");
			            } else {
			            	System.out.println("Insertion non OK");
			            }
			           
			           break;
			   
			       case "2":
			           System.out.println("Hello");
			           break;
			   
			       case "3":
			           System.out.println("Buenos dias");
			           break;
			           
			       case "4":
			    	   System.out.println("Vous voulez afficher la liste des étudiants");
			    	   String sql = "SELECT * FROM etudiants";
			            
			            Statement statement = connection.createStatement();
			            ResultSet result = statement.executeQuery(sql);
			             
			            int count = 0;
			             
			            while (result.next()){
			                String lastName = result.getString("nom");
			                String firstName = result.getString("prenom");
			                String birthDate = result.getString("date_naissance");
			                String mail = result.getString("email");
			                String matric = result.getString("matricule");
			             
			                String output = "User #%d: %s - %s - %s - %s";
			                System.out.println(String.format(output, ++count, lastName, firstName, birthDate, mail, matric));
			            }
			    	   
			           break;
			   }
			}
            
            // Étape 5 : Fermer la connexion lorsque vous avez fini
            // Il est important de fermer la connexion lorsque vous avez terminé pour libérer les ressources.
            connection.close();
        } catch (ClassNotFoundException e) {
            // Gestion des exceptions liées au chargement du pilote JDBC
            e.printStackTrace();
        } catch (SQLException e) {
            // Gestion des exceptions liées à la connexion à la base de données
            e.printStackTrace();
        }
	}

}
