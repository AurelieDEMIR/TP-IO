import java.io.File;
import java.util.Scanner;


public class Exercice01 {

	public static void main (String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez un chemin d'accès pour vérifier son existence : "); //demande à l'utilisateur d'entrer son chemin d'accès
		String Chemin = sc.next(); //récupère le chemin entré
		
		File c = new File(Chemin); //déclare la classe File qui gère les fichiers et dossiers
		//la methode exists vérifie l'existence, affiche le message qui correspond à l'existence ou non du chemin
		if(c.exists()) System.out.println("Il existe !");
		else System.out.println("Il n'existe pas !");

}
}
