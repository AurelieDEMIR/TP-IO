import java.io.File;
import java.util.Scanner;


public class Exercice01 {

	public static void main (String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez un chemin d'acc�s pour v�rifier son existence : "); //demande � l'utilisateur d'entrer son chemin d'acc�s
		String Chemin = sc.next(); //r�cup�re le chemin entr�
		
		File c = new File(Chemin); //d�clare la classe File qui g�re les fichiers et dossiers
		//la methode exists v�rifie l'existence, affiche le message qui correspond � l'existence ou non du chemin
		if(c.exists()) System.out.println("Il existe !");
		else System.out.println("Il n'existe pas !");

}
}
