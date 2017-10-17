import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class Exercice6{
  public static void main(String args[])throws IOException{
    int width = 963;    //d�clare la largeur de l'image
    int height = 640;   //d�lcare la longueur de l'image
    BufferedImage image = null; //d�fini la variable � null
    File f = null;

    //lit l'image
    try{
      f = new File("D:\\Image\\Taj.jpg"); //cr�e l'objet de class File et passe en param�tre le chemin
      image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB); //cr�e l'objet de type BufferedImage et passe en param�tre la largeur, hauteur et le type int de l'image
      image = ImageIO.read(f); //lit l'image avec la fonction read() et passe le chemin que nous avons stock�
      System.out.println("Reading complete.");
    }catch(IOException e){
      System.out.println("Error: "+e);
    }

    //�crit l'image
    try{
      f = new File("D:\\Image\\Output.jpg");  //cr�e l'objet de type File et passe en param�tre le chemin de l'image o� nous voulons sauvegarder
      ImageIO.write(image, "jpg", f); //�crit
      System.out.println("Writing complete.");
    }catch(IOException e){
      System.out.println("Error: "+e);
    }
  }
}