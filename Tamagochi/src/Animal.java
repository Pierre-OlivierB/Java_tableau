
public class Animal {
	private String nom;
	private int energie;
	private String jouer;
	private String dormir;
	private String manger;
	private int poids;
	
	
	public int getPoids() {
		return poids;
	}
	public void setPoids(int poids) {
		this.poids = poids;
	}
	public String getManger() {
		return manger;
	}
	public void setManger(String manger) {
		this.manger = manger;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getEnergie() {
		return energie;
	}
	public void setEnergie(int energie) {
		this.energie = energie;
	}
	public String getJouer() {
		return jouer;
	}
	public void setJouer(String jouer) {
		this.jouer = jouer;
	}
	public String getDormir() {
		return dormir;
	}
	public void setDormir(String dormir) {
		this.dormir = dormir;
	}
	public Animal() {
		
	}
	public Animal(int energie,String dormir) {
		this.setEnergie(energie);
		this.setDormir(dormir);
	}
	public Animal(int energie,String jouer,String manger,int poids) {
		this.setEnergie(energie);
		this.setJouer(jouer);
		this.setManger(manger);
		this.setPoids(poids);
	}
	public Animal(String nom, int energie,String jouer,String dormir,String manger, int poids) {
		this.setNom(nom);
		this.setEnergie(energie);
		this.setJouer(jouer);
		this.setDormir(dormir);
		this.setManger(manger);
		this.setPoids(poids);
	}
	
}
