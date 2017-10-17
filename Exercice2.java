import java.io.File;
import java.util.Scanner;

public class Exercice2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le r�pertoire dont les fichiers doivent �tre list�s (exemple: C:\\Users\\Toto) : "); //on indique � l'utilisateur d'entrer son choix au clavier
        String Dossier = sc.next(); //r�cup�re la r�ponse de l'utilisateur

        File dossier = new File(Dossier); //d�clare la class File qui g�re les fichiers et les dossiers
        File[] listFichiers = dossier.listFiles();

        {

            for (int i = 0; i < listFichiers.length; i++) { //la boucle continue tant qu'il reste des fichiers

                String fichiers = listFichiers[i].getName(); //r�cup�re le nom des fichiers et les ins�re dans la variable
                System.out.println(fichiers); //affiche les fichiers
                }
            }
        }
    }
