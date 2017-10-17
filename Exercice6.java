import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class Exercice6{
  public static void main(String args[])throws IOException{
    int width = 963;    //déclare la largeur de l'image
    int height = 640;   //délcare la longueur de l'image
    BufferedImage image = null; //défini la variable à null
    File f = null;

    //lit l'image
    try{
      f = new File("D:\\Image\\Taj.jpg"); //crée l'objet de class File et passe en paramètre le chemin
      image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB); //crée l'objet de type BufferedImage et passe en paramètre la largeur, hauteur et le type int de l'image
      image = ImageIO.read(f); //lit l'image avec la fonction read() et passe le chemin que nous avons stocké
      System.out.println("Reading complete.");
    }catch(IOException e){
      System.out.println("Error: "+e);
    }

    //écrit l'image
    try{
      f = new File("D:\\Image\\Output.jpg");  //crée l'objet de type File et passe en paramètre le chemin de l'image où nous voulons sauvegarder
      ImageIO.write(image, "jpg", f); //écrit
      System.out.println("Writing complete.");
    }catch(IOException e){
      System.out.println("Error: "+e);
    }
  }
}