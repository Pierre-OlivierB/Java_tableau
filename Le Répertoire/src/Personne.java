import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Personne {


	// TODO Auto-generated method stub
	private String nom;
	private String prenom;
	private final int numero;
	private static int nbInstances;
	private LocalDate date_nais;
	private String adresse;
	private String codePostale;
	private String ville;
	private int age;

	
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getCodePostale() {
		return codePostale;
	}
	public void setCodePostale(String codePostale) {
		this.codePostale = codePostale;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public String getNom() {
		return nom;
	}
	public void setNom (String n) {
		nom=n.toUpperCase();
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String p) {
		prenom=p.toLowerCase();
	}
	public int getNumero() {
		return numero;
	}
	public static int getNbInstances() {
		return nbInstances;
	}
	
	public LocalDate getDateNaissance() {
		return date_nais;
	}
	public void setDateNaissance(int annee, int mois, int jour) {
		LocalDate c = LocalDate.of(annee,mois,jour);
		date_nais=(LocalDate) c;
		/*long millis = date.getTime();*/			
	}
	
	public Personne() {
		nbInstances++;
		numero=nbInstances;
	}
	@Override
	public String toString() {
		return "Personne numéro "+ this.numero+ "; \nNombre total de personne : "+nbInstances; 
	}
	
	public long calculAge() {
		return date_nais.until(LocalDate.now(),ChronoUnit.YEARS);
		}
	public void affichage() {
		System.out.println("Son nom est : "+getNom());
		System.out.println("Son prenom est : "+getPrenom());
		System.out.println("Son âge est : "+getDateNaissance());
	}
	public Personne (String nom, String prenom) {
		this.setNom(nom);
		this.setPrenom(prenom);
		nbInstances++;
		numero = nbInstances;
	}
}
