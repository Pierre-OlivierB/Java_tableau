import java.util.Arrays;
import java.util.Scanner;

public class TableauDragons {
	static Scanner scanner = new Scanner(System.in);
	public void choixPersonne() {
		personneClavier();
	}
	public static void personneClavier() {
		System.out.println("Exo 1");
		/*D�claration variables*/
		String nom="";
		String sexe="";
		int taille=0;
		int nmbrEcailles=0;
		String feu="";
		String comportAmour="";
		
		Dragons[] array;
		String reponse="";
		boolean test =false;

		int n=1;
		array= new Dragons[n];
		do{
			test=true;
			int i=n-1;
			array[i]=new Dragons(nom,sexe,taille,nmbrEcailles,feu,comportAmour);
			/*insertion objet i nom*/
			System.out.print("Nouveau Dragon: ");
			System.out.println("Quel est son nom?");
			nom=scanner.nextLine();
			array[i].setNom(nom);
			
			/*insertion objet i sexe*/
			System.out.println("Quel est son sexe?");
			sexe=scanner.nextLine();
			array[i].setSexe(sexe);
					
			/*insertion objet i taille*/
			System.out.println("Quel est sa taille?");
			taille=scanner.nextInt();	
			array[i].setTaille(taille);
					
			/*insertion objet i nombre d'�cailles*/
			System.out.println("Quel est son nombre d'�cailles");
			nmbrEcailles=scanner.nextInt();
			array[i].setNmbrEcailles(nmbrEcailles);		
			
			/*insertion objet i feu*/
			scanner.nextLine();
			System.out.println("Crache-t'il du feu?");
			feu=scanner.nextLine();
			array[i].setFeu(feu);
			
			/*insertion objet i comportement amoureux*/		
			System.out.println("Quel est son Comportement amoureux?");
			comportAmour=scanner.nextLine();
			array[i].setComportAmour(comportAmour);
			
			/*question voulez vous continuer?*/
			System.out.println("Voulez vous rajouter un objet? Reponse o/n");
			reponse = scanner.nextLine();
			System.out.println("Votre r�ponse: "+reponse);
			
			/*copy du tableau et ajout de case*/
			if(reponse.equals("o")) {
				test=!test;
				System.out.println("Votre r�ponse: "+n);
				array=Arrays.copyOf(array, n+1);
				n++;
			}
			else {
				System.out.println("Votre tableau est donc le suivant: ");

			}

		}
		while(!test);
		/*Impression des caract�ristiques de l'objet*/
		System.out.println("Quel Dragon voulez vous choisir? Le tableau va de 1 � "+array.length);
		int recherche=scanner.nextInt();
		recherche=recherche-1;
		/*for(int i=0;i<array.length;i++) {*/
		System.out.print("Nom: "+array[recherche].getNom()+"\t");
		System.out.print("Sexe: "+array[recherche].getSexe()+"\t");
		System.out.print("Taille: "+array[recherche].getTaille()+"cm\t");
		System.out.print("Ecailles: "+array[recherche].getNmbrEcailles()+"\t");
		System.out.print("Feu :"+array[recherche].getFeu()+"\t");
		System.out.println("Amour: "+array[recherche].getComportAmour());
		
		scanner.nextLine();
		System.out.println("Quel Dragon voulez vous choisir? Avec feu ou sans feu? R�ponse attendu: f/sf");
		String rechercheFeu=scanner.nextLine();
		if(rechercheFeu.equals("f")) {
			for(int i=0; i<array.length;i++) {
				if(array[i].getFeu().equals("oui")) {
					System.out.println(array[i].getNom()+"Feu "+array[i].getFeu());
				}
				else {
					System.out.println(array[i].getNom()+"Feu "+array[i].getFeu());
				}
			}
		}
			/*}*/
		/*Test tri bulle dans la fonction*/
		Dragons temp = new Dragons();
		
		for(int i=0; i<n-1;i++) {
			for(int j=1;j<n-i;j++)
			if (array[j-1].getTaille()>array[j].getTaille()) {
				//echanges des �l�ments
				temp=array[j-1];
				array[j-1]=array[j];
				array[j]=temp;
			}
		}
		
		System.out.print("La personne la plus petit est "+array[0].getNom()+". ");
		System.out.println("La personne la plus grand est "+array[n-1].getNom()+". ");	
	
	}

}
