package MainAppV2;

public class C_CARRE extends C_FIGURE implements I_CALCUL_GEOMETRIQUE,I_TYPE_FIGURE {
	C_CARRE(){
		super(3,4);
	}
	public void affiche() {
		//super.affiche();
		System.out.println("Est un carré!");
	}
	public int getAire() {
		//super.Aire();
		return(super.getAire());
	}
	public String getType() {
		return "carre";
	}
}
