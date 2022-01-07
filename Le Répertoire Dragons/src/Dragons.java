import java.time.LocalDate;

public class Dragons {
	private String nom;
	private String sexe;
	private int taille;
	private int nmbrEcailles;
	private String feu;
	private String comportAmour;
	
	/*Construction:*/
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public int getTaille() {
		return taille;
	}
	public void setTaille(int taille) {
		this.taille = taille;
	}
	public int getNmbrEcailles() {
		return nmbrEcailles;
	}
	public void setNmbrEcailles(int nmbrEcailles) {
		this.nmbrEcailles = nmbrEcailles;
	}
	public String getFeu() {
		return feu;
	}
	public void setFeu(String feu) {
		this.feu = feu;
	}
	public String getComportAmour() {
		return comportAmour;
	}
	public void setComportAmour(String comportAmour) {
		this.comportAmour = comportAmour;
	}
	public Dragons() {
		
	}
	public Dragons(String nom,String sexe,int taille,int nmbrEcailles,String feu,String comportAmour) {
		this.setNom(nom);
		this.setSexe(sexe);
		this.setTaille(taille);
		this.setNmbrEcailles(nmbrEcailles);
		this.setFeu(feu);
		this.setComportAmour(comportAmour);		
	}
	
	
}
