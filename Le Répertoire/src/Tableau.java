import java.util.Scanner;

public class Tableau {
	Scanner scanner = new Scanner(System.in);
	public void personneClavier() {
		System.out.println("Exo 1");
		/*Tableau à 6colonnes et le nombre de personnes en lignes*/
		System.out.println("Combien voulez-vous de lignes?");
		int n = scanner.nextInt();
		scanner.nextLine();
		int m = 6;
		Personne[] a = new Personne[n];
		/*Personne [][] a = new Personne [n][m];*/
		for (int i=0;i<n;i++) {
			/*Personne gen = new Personne();*/
			for(int j=0; j<m;j++) {
				/*if(i==0) {
					if (j==0) {
						a[][j]= "prenom";
					}
					else if (j==1) {
						a[i][j]= "nom";
					} 
					else if (j==2) {
						a[i][j]= "adresse";
					}
					else if (j==3) {
						a[i][j]= "codePostal";
					}
					else if (j==4) {
						a[i][j]= "ville";
					}
					else if (j==5) {
						a[i][j]= "age";
					}						
				}
				else {*/
					/*if (j==0) {
					System.out.println("Nouvelle personne: ");
					a[i][j]= saisirPrenom();
					}*/
					if (j==1) {
					String nom;
					System.out.println("Quel est son nom?");
					nom=scanner.nextLine();
					a[i][1].setNom(nom);
					} 
					else if (j==2) {
					String adresse;
					System.out.println("Quel est son adresse?");
					adresse=scanner.nextLine();	
					a[i][2].setAdresse(adresse);
					}
					else if (j==3) {
					String codePostal;
					System.out.println("Quel est son code postal?");
					codePostal=scanner.nextLine();
					a[i][3].setCodePostale(codePostal);
					}
					else if (j==4) {
					String ville;
					System.out.println("Quel est sa ville?");
					ville=scanner.nextLine();
					a[i][4].setVille(ville);
					}
					else if (j==5) {
						int age;
						scanner.nextInt();
						System.out.println("Quel est son âge?");
						age=scanner.nextInt();
					a[i][5].setAge(age);
					}
					else {
						scanner.nextLine();
						System.out.print("Nouvelle personne: ");
						String prenom;
						System.out.println("Quel est son prénom?");
						prenom=scanner.nextLine();
						a[i][0].setPrenom(prenom);
					}
				/*}*/
			}
		}
		for(int i=0;i<a.length;i++) {
			for (int j=0;j<a[0].length;j++) {
				System.out.print(a[i][j]+"\t");
				}
			System.out.println();
			}
		
		/* son nom, 
		 * prénom, 
		 * adresse, 
		 * code postal, 
		 * ville et 
		 * age ( ce sera un entier )*/
	}
	/*public String saisirPrenom() {
		String prenom;
		System.out.println("Quel est son prénom?");
		prenom=scanner.nextLine();
		
		return(prenom);
	}
	public String saisirNom() {
		String nom;
		System.out.println("Quel est son nom?");
		nom=scanner.nextLine();
		return(nom);
	}*/
	/*public String saisirAdresse() {
		String adresse;
		System.out.println("Quel est son adresse?");
		adresse=scanner.nextLine();
		return(adresse);
	}*/
	/*public String saisirCodePostal() {
		String codePostal;
		System.out.println("Quel est son code postal?");
		codePostal=scanner.nextLine();
		return(codePostal);
	}*/
	/*public String saisirVille() {
		String ville;
		System.out.println("Quel est sa ville?");
		ville=scanner.nextLine();
		return(ville);
	}*/
	/*public String saisirAge() {
		String age;
		System.out.println("Quel est son âge?");
		age=scanner.nextLine();
		return(age);
	}*/
}
