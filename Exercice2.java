import java.io.File;
import java.util.Scanner;

public class Exercice2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le répertoire dont les fichiers doivent être listés (exemple: C:\\Users\\Toto) : "); //on indique à l'utilisateur d'entrer son choix au clavier
        String Dossier = sc.next(); //récupère la réponse de l'utilisateur

        File dossier = new File(Dossier); //déclare la class File qui gère les fichiers et les dossiers
        File[] listFichiers = dossier.listFiles();

        {

            for (int i = 0; i < listFichiers.length; i++) { //la boucle continue tant qu'il reste des fichiers

                String fichiers = listFichiers[i].getName(); //récupère le nom des fichiers et les insère dans la variable
                System.out.println(fichiers); //affiche les fichiers
                }
            }
        }
    }
