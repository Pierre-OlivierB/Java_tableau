import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TableauDragons {
	static Scanner scanner = new Scanner(System.in);
	public void choixPersonne() {
		personneClavier();
	}
	public static void personneClavier() {
		System.out.println("Exo 1");
		/*Déclaration variables*/
		String nom="";
		String sexe="";
		int taille=0;
		int nmbrEcailles=0;
		String feu="";
		String comportAmour="";
		
		Dragons[] array;
		String reponse="";
		boolean test =false;
		
		/*Initialisation du tableau*/
		int n=1;
		array= new Dragons[n];
		/*Début de la boucle de création de dragons (min=1)*/
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
					
			/*insertion objet i nombre d'écailles*/
			System.out.println("Quel est son nombre d'écailles");
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
			System.out.println("Votre réponse: "+reponse);
			
			/*copy du tableau et ajout de case*/
			if(reponse.equals("o")) {
				test=!test;
				System.out.println("Votre réponse: "+n);
				array=Arrays.copyOf(array, n+1);
				n++;
			}
			else {
				System.out.println("Votre tableau est donc le suivant: ");
			}
		}
		while(!test);
		/*Impression des caractéristiques de l'objet*/
		System.out.println("Quel Dragon voulez vous choisir? Le tableau va de 1 à "+array.length);
		int recherche=scanner.nextInt();
		recherche=recherche-1;
		/*Affichage du dragon choisit*/
		System.out.print("Nom: "+array[recherche].getNom()+"\t");
		System.out.print("Sexe: "+array[recherche].getSexe()+"\t");
		System.out.print("Taille: "+array[recherche].getTaille()+"cm\t");
		System.out.print("Ecailles: "+array[recherche].getNmbrEcailles()+"\t");
		System.out.print("Feu :"+array[recherche].getFeu()+"\t");
		System.out.println("Amour: "+array[recherche].getComportAmour());
		
		/*Affichage Dragon avec ou sans feu?*/
		scanner.nextLine();
		System.out.println("Quel Dragon voulez vous choisir? Avec feu ou sans feu? Réponse attendu: f/sf");
		String rechercheFeu=scanner.nextLine();
		/*Toues les Dragons avec feu*/
		if(rechercheFeu.equals("f")) {
			for(int i=0; i<array.length;i++) {
				if(array[i].getFeu().equals("oui")) {
					System.out.println("Nom: "+array[i].getNom()+" Feu "+array[i].getFeu());
				}
			}
		}
		/*Toues les Dragons sans feu*/
		else if(rechercheFeu.equals("sf")) {
			for(int i=0; i<array.length;i++) {
			if(array[i].getFeu().equals("non")) {
					System.out.println("Nom: "+array[i].getNom()+" Feu "+array[i].getFeu());
				}
			}
		}
			
			/*}*/
		/*Test tri bulle dans la fonction*/
		/*Objet Dragon pour mémoire tampon*/
		Dragons temp = new Dragons();
		/*Tri du plus petit au plus grand*/
		for(int i=0; i<n-1;i++) {
			for(int j=1;j<n-i;j++)
			if (array[j-1].getTaille()>array[j].getTaille()) {
				//echanges des éléments
				temp=array[j-1];
				array[j-1]=array[j];
				array[j]=temp;
			}
		}
		
		System.out.print("Le dragon le plus petit est "+array[0].getNom()+". ");
		System.out.println("Le dragon le plus grand est "+array[n-1].getNom()+". ");
		
		/*Changement puis affichage du comportement changer et du nom associer*/
		array[0].setComportAmour("Oh l'amour!");
		
		System.out.println("Le dragon dont le comportement a été modifier est: "+array[0].getNom()+". Son comportement est maintenant: "+ array[0].getComportAmour());
		
		/*Possibilité de supprimer un dragon(le 3eme) s'il y en a plus de 1*/
		if(array.length>1) {
			array=Arrays.copyOf(array, n-1);
			
			for(int i=0;i<array.length;i++) {
				System.out.println("Le nouveau tableau est :");
				System.out.println(array[i].getNom());
			}
			/*
			Dragons[] dragonSup = new Dragons[1];
			for (int i =0;i<array.length;i++) {
				if (i==0) {
					array[i] = removeDragons(array[i]);
					break;
				}
			}
			System.out.println("Voici le nouveau tableau: ");
			for(int i=0; i<array.length;i++) {
				System.out.println(" "+array[i].getNom());
			}*/
		}
		else {
			System.out.println("On ne peut pas supprimer un dragon quand c'est le dernier de son espèce.");
		}
	
	}
	/*Methode de suppression de  Dragons*/
	/*public static Dragons[] removeDragons(Dragons array, int index) {
		List<Dragons>tempList=new ArrayList<Dragons>(Arrays.asList(array));
		tempList.remove(index);
		return tempList.toArray(new Dragons[0]);
	}*/

}
