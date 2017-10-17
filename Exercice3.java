import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Exercice3 {

		private FiltreNom instFiltreNom = new FiltreNom();
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Entrez le répertoire dont les fichiers .txt doivent apparaître : ");//on indique à l'utilisateur d'entrer son choix au clavier
			String Chemin = sc.next(); //récupère la réponse de l'utilisateur
			Exercice3 listFile = new Exercice3(Chemin, ".txt");
			
			// Traitement de Fichier
			String fichier[]= listFile.listeFichier();
			
			if (fichier.length != 0)
			{
				for (String element : fichier)
					System.out.println (element);
			}
			else
				System.out.println ("Il n'y a aucun fichier avec cette extension");
		}
		
		private File myDir; // Répertoire à partir d'où sera effectué le listing
		
		
		 //ListFile : Constructeur permettant d'indiquer le répertoire 
		 
		public Exercice3(String path, String masqueFiltre)
		{
			myDir = new File (path);
			instFiltreNom.setMasqueFiltre(masqueFiltre);
		}

		 //liste l'ensemble des fichiers présents dans le répertoire précisé à partir de ListFile
		 
		public String [] listeFichier()
		{
			String[] fichier=myDir.list(instFiltreNom);
			return fichier;
		}		
		
		class FiltreNom implements FilenameFilter {
		   private String masque;
		   
		 
		   public void setMasqueFiltre(String masque)
		   {
			   this.masque = masque;
		   }

		   public boolean accept (File repFiltre, String nom)
		   {   
			   File fichier = new File (repFiltre, nom);
			   if (!fichier.isDirectory())
			   {
					Pattern pattern = Pattern.compile(masque,Pattern.CASE_INSENSITIVE);

					Matcher matcher = pattern.matcher(nom);

					return matcher.find();
			   }
			   else
			      return false;
		   }
		}
}
