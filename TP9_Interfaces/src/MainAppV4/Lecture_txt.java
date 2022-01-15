package MainAppV4;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.RandomAccess;
import java.util.Scanner;

public class Lecture_txt {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		//Tp8
//		EXO 1 : Créez un fichier texte avec « bloc notes ».
//		Puis réaliser un programme permettant de lire ce 
		//fichier texte caractère par caractère en affichant à
//		l’écran les caractères lus au fur et à mesure.
//		L’utilisateur devra donner le chemin et le nom du fichier.
		
		Scanner s=new Scanner(System.in);
		
		FileReader Flux_Fichier;
		int c;
		//nom fichier à créer
		String nomFich;
		// nom fichier lu pour copie
		String repPath;
		String repName;
		String fullPath;
//		int n;
//		int num=1;
		
		
		
		System.out.println("Quel est le chemin du fichier à lire?");
		repPath = s.nextLine();
		System.out.println("Quel est son petit nom?");
		repName = s.nextLine();
		//création du passage
		fullPath=repPath+repName;
		Flux_Fichier = new FileReader(fullPath);
		
		//Création d'un fichier qui copie le précédent avec le nom donné par l'utilisateur
		System.out.print("donnez le nom du fichier a créer : ");
		nomFich=s.nextLine();
		FileOutputStream sortie= new FileOutputStream(nomFich);
		do {
			c=Flux_Fichier.read();
			char car=(char)c;
			//num++;
			if(c!=-1) {
				System.out.println(car);
				//copie du fichier
				sortie.write(car);
			}
		}while(c!=-1);	
		sortie.close();
		System.out.println("*** fin creation fichier ***");
		
		//Exo2
//		Créez avec « bloc notes » un fichier texte.
//		Réaliser un programme qui va créer, à partir du fichier précédent, un nouveau fichier dans lequel
//		tous les caractères ‘a’ seront transformés par le caractère ‘A’.
//		Après l’exécution de votre programme, vous devez avoir 2 fichiers : 
		//celui d’origine et celui créé par
//		votre programme.
		
		//Création d'un fichier avec le nom donné par l'utilisateur
//		System.out.print("donnez le nom du fichier a créer : ");
//		nomFich=s.nextLine();
//		FileOutputStream sortie= new FileOutputStream(nomFich);
		
		//Exo 3 Undo
		
		//Exo 4
//		Sérialisation.
//		Sauvegarder plusieurs objets "point" dans un fichier appelé : Fich_Points.obj
//		Ces objets seront instanciés via la classe C_POINT déjà utilisée.
//		Afin de vérifier cette sauvegarde, faites une lecture du fichier appelé : 
		//Fich_Points.obj et affichez les
//		coordonnées de chacun des points.
			
	}

}
