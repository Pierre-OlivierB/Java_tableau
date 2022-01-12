
public class C_CERCLE {
	
	int x;
	int y;
	int r;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	
	public C_CERCLE(int abs, int ord, int rayon) {
		this.x=abs;
		this.y=ord;
		this.r=rayon;
	}
	public void deplace(int delta_x, int delta_y) {
		this.x=delta_x;
		this.y=delta_y;
	}
	public void affiche() {
		System.out.println("La position de x est: "+x);
		System.out.println("La position de y est: "+y);
	}
//	public void affiche(int position) {
//		System.out.println("La position de x est: "+position);
//		System.out.println("La position de y est: "+y);
//	}
	public boolean compare(int cercle) {
		System.out.println("Les rayons comparés sont: "+cercle+" et "+r);
		if (r>cercle) {
			System.out.println("Le rayon de base est plus grand que le rayon donné");	
			return true;
		}
		else {
			System.out.println("Le rayon de base est plus petit ou égal que le rayon donné");
			return false;
		}
		
	}
	public double surface() {
		double s=2*(3.14)*(r^2);
		return s;
	}
}
