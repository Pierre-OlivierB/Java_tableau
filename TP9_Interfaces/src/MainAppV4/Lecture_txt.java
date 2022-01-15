package MainAppV4;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import MainAppV3.C_PRINCIPALE;
import MainAppV3.NombreNegatifException;
import MainAppV3.TropGrandNombreException;

public class Lecture_txt {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException,NombreNegatifException,TropGrandNombreException, ClassNotFoundException{
		// TODO Auto-generated method stub
		//Tp8
//		EXO 1 : Cr�ez un fichier texte avec � bloc notes �.
//		Puis r�aliser un programme permettant de lire ce 
		//fichier texte caract�re par caract�re en affichant �
//		l��cran les caract�res lus au fur et � mesure.
//		L�utilisateur devra donner le chemin et le nom du fichier.
		
		Scanner s=new Scanner(System.in);
		
		FileReader Flux_Fichier;
		int c;
		//nom fichier � cr�er
		String nomFich;
		// nom fichier lu pour copie
		String repPath;
		String repName;
		String fullPath;
//		int n;
//		int num=1;
		
		
		
//		System.out.println("Quel est le chemin du fichier � lire?");
//		repPath = s.nextLine();
//		System.out.println("Quel est son petit nom?");
//		repName = s.nextLine();
//		//cr�ation du passage
//		fullPath=repPath+repName;
//		Flux_Fichier = new FileReader(fullPath);
//		
//		//Cr�ation d'un fichier qui copie le pr�c�dent avec le nom donn� par l'utilisateur
//		System.out.print("donnez le nom du fichier a cr�er : ");
//		nomFich=s.nextLine();
//		FileOutputStream sortie= new FileOutputStream(nomFich);
//		do {
//			c=Flux_Fichier.read();
//			char car=(char)c;
//			//num++;
//			if(c!=-1) {
//				System.out.println(car);
//				//copie du fichier
//				sortie.write(car);
//			}
//		}while(c!=-1);	
//		sortie.close();
//		System.out.println("*** fin creation fichier ***");
		
		//Exo2
//		Cr�ez avec � bloc notes � un fichier texte.
//		R�aliser un programme qui va cr�er, � partir du fichier pr�c�dent, un nouveau fichier dans lequel
//		tous les caract�res �a� seront transform�s par le caract�re �A�.
//		Apr�s l�ex�cution de votre programme, vous devez avoir 2 fichiers : 
		//celui d�origine et celui cr�� par
//		votre programme.
		
		//Cr�ation d'un fichier avec le nom donn� par l'utilisateur
//		System.out.print("donnez le nom du fichier a cr�er : ");
//		nomFich=s.nextLine();
//		FileOutputStream sortie= new FileOutputStream(nomFich);
		
		//Exo 3 Undo
		
		//Exo 4
//		S�rialisation.
//		Sauvegarder plusieurs objets "point" dans un fichier appel� : Fich_Points.obj
//		Ces objets seront instanci�s via la classe C_POINT d�j� utilis�e.
//		Afin de v�rifier cette sauvegarde, faites une lecture du fichier appel� : 
		//Fich_Points.obj et affichez les
//		coordonn�es de chacun des points.
		C_POINT2 point1 = new C_POINT2 (33,3);
		C_POINT2 point2 = new C_POINT2 (42,5);
		C_POINT2 []point = new C_POINT2 [2];
		point[0]=point1;
		point[1]=point2;
		
		FileOutputStream sortie = new FileOutputStream ("Fich_Points2.obj"); // Cr�ation d'un fichier
		ObjectOutputStream serie = new ObjectOutputStream (sortie);
		serie.writeObject (point);
		
		FileInputStream entree = new FileInputStream ("Fich_Points2.obj");//lecture d'un fichier
		ObjectInputStream serie2 = new ObjectInputStream (entree);
		point = (C_POINT2[])serie2.readObject();
		sortie.close();
		
	}

}
