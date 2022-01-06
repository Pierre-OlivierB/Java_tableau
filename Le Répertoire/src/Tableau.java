import java.util.Scanner;

public class Tableau {
	Scanner scanner = new Scanner(System.in);
	public void personneClavier() {
		System.out.println("Exo 1");
		/*Déclaration variables*/
		String prenom="";
		String nom="";
		String adresse="";
		int codePostal=0;
		String ville="";
		int age=0;
		
		/*Tableau à 6colonnes et le nombre de personnes en lignes*/
		System.out.println("Combien voulez-vous de lignes?");
		int n = scanner.nextInt();
		Personne[] array;
		array= new Personne[n];
		System.out.println(n);		
		for (int i=0;i<n;i++) {
			scanner.nextLine();
			array[i]=new Personne(prenom,nom,adresse,codePostal,ville,age);
			System.out.print("Nouvelle personne: ");
			System.out.println("Quel est son prénom?");
			prenom=scanner.nextLine();
			array[i].setPrenom(prenom);
			
			System.out.println("Quel est son nom?");
			nom=scanner.nextLine();
			array[i].setNom(nom);
					
			
			System.out.println("Quel est son adresse?");
			adresse=scanner.nextLine();	
			array[i].setAdresse(adresse);
					
			/*scanner.nextInt();*/
			System.out.println("Quel est son code postal?");
			codePostal=scanner.nextInt();
			array[i].setCodePostale(codePostal);		
			
			scanner.nextLine();
			System.out.println("Quel est sa ville?");
			ville=scanner.nextLine();
			array[i].setVille(ville);
			
			/*scanner.nextInt();*/		
			System.out.println("Quel est son âge?");
			age=scanner.nextInt();
			array[i].setAge(age);
					
		}
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i].getPrenom()+"\t");
			System.out.print(array[i].getNom()+"\t");
			System.out.print(array[i].getAdresse()+"\t");
			System.out.print(array[i].getCodePostale()+"\t");
			System.out.print(array[i].getVille()+"\t");
			System.out.println(array[i].getAge());
			}
		
		/* son nom, 
		 * prénom, 
		 * adresse, 
		 * code postal, 
		 * ville et 
		 * age ( ce sera un entier )*/
	}
	
}
