import java.util.Scanner;

public class saisirInformations {
	Scanner scanner = new Scanner(System.in);
	
	public saisirInformations() {
		String prenom;
		String nom;
		String adresse;
		String codePostal;
		String ville;
		String age;
		
		System.out.println("Quel est son prénom?");
		prenom=scanner.nextLine();
		System.out.println("Quel est son nom?");
		nom=scanner.nextLine();
		System.out.println("Quel est son adresse?");
		adresse=scanner.nextLine();
		System.out.println("Quel est son code postal?");
		codePostal=scanner.nextLine();
		System.out.println("Quel est sa ville?");
		ville=scanner.nextLine();
		System.out.println("Quel est son âge?");
		age=scanner.nextLine();
	}
	
}
