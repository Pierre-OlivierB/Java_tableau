package MainAppV2;

public class C_CERCLE2 extends C_FIGURE{
	int r;
	int aire;
	
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	
	public C_CERCLE2(int rayon) {
		super(1,2);
		this.r=rayon;
	}
	public void deplace(int delta_x, int delta_y) {
		this.x=delta_x;
		this.y=delta_y;
	}
	
//	public void affiche(int position) {
//		System.out.println("La position de x est: "+position);
//		System.out.println("La position de y est: "+y);
//	}
//	public boolean compare(int cercle) {
//		System.out.println("Les rayons comparés sont: "+cercle+" et "+r);
//		if (r>cercle) {
//			System.out.println("Le rayon de base est plus grand que le rayon donné");	
//			return true;
//		}
//		else {
//			System.out.println("Le rayon de base est plus petit ou égal que le rayon donné");
//			return false;
//		}
//		
//	}
	public void affiche() {
		//super.affiche();
		System.out.println(" et de rayon"+ r);
	}
	public int Aire() {
		super.Aire();
		aire=((super.Aire())/super.Aire())*2*3*(this.r*this.r);
		return aire;
	}
	public double surface() {
		double s=2*(3.14)*(r^2);
		return s;
	}
}
