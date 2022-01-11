
public class Temps {
	//nombre de jour resté en vie
	private int jourDeVie;
	//trancheAge selon le nombre de jour passé en vie
	private String trancheAge;
	//temps dépensé par activités
	private int tempsPasse;	
	
	
	public int getJourDeVie() {
		return jourDeVie;
	}
	public void setJourDeVie(int jourDeVie) {
		this.jourDeVie = jourDeVie;
	}
	public String getTrancheAge() {
		return trancheAge;
	}
	public void setTrancheAge(String trancheAge) {
		this.trancheAge = trancheAge;
	}
	public int getTempsPasse() {
		return tempsPasse;
	}
	public void setTempsPasse(int tempsPasse) {
		this.tempsPasse = tempsPasse;
	}
	public Temps() {
		
	}
	public Temps(int ceJourDevie, String cetTrancheAge, int leTempsPasse) {
		this.setJourDeVie(ceJourDevie);
		this.setTrancheAge(cetTrancheAge);
		this.setTempsPasse(leTempsPasse);
	}
	public Temps(int ceJourDevie, int leTempsPasse) {
		this.setJourDeVie(ceJourDevie);
		this.setTempsPasse(leTempsPasse);
	}
	public Temps(int leTempsPasse) {
		this.setTempsPasse(leTempsPasse);
	}	
}
