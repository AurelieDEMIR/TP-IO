import java.io.*;
import java.util.Scanner;


public class Exercice5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream(new File("fichier1.txt")); //m�thode fis qui va lire le fichier
			fos = new FileOutputStream(new File("fichier2.txt")); //m�thode fos va �crire dans le nouveau 

			byte[] buf = new byte[8];
			int n = 0;

			while ((n = fis.read(buf)) >= 0) {
				fos.write(buf);
				for (byte bit : buf) {
					System.out.print("\t" + bit + "(" + (char) bit + ")");
				}
				System.out.println("");
				buf = new byte[8];
			}
			System.out.println("Copie termin�e !");
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		} 
		finally {
			try {
				if (fis != null)
					fis.close();
			} 
			catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if (fos != null)
				fos.close();
			} 
			catch (IOException e){
            e.printStackTrace();
			}
		}
	}
}