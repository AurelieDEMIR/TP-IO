import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
	
public class Exercice4 {

	static File file = new File("hey.txt");
	public static void main(String[] args){
			
		String saisie = ""; // saisie de l'utilisateur
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entrez vos phrases � copier sur le fichier : ");
		
		while(!saisie.equals("quit")){   //la boucle continue si ce que l'utilisateur entre est diff�rent de quit
			
			saisie = scan.nextLine();    //r�cup�re l'entr�e au clavier

			if(!saisie.equals("quit")){  
				
				//reprends le fichier et continue l'�criture
				try(FileWriter writer = new FileWriter(file,true);) {
					saisie = saisie + "\r\n";
					writer.write(saisie);
				}
				catch(FileNotFoundException e){
					e.printStackTrace();
				}
				catch(IOException e){
					e.printStackTrace();
				}
			}
		}
	}
	
}
