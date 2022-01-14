package MainAppV2;

public class C_FIGURE {
	protected int x;
	protected int y;
	protected int a;
//	protected int aireTot;
	
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
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
	public C_FIGURE(int abs, int ord) {
		this.x=abs;
		this.y=ord;
	}
	public void deplace(int delta_x, int delta_y) {
		this.x=delta_x;
		this.y=delta_y;
	}
	public void affiche() {
		System.out.println("La position de x est: "+x);
		System.out.println("La position de y est: "+y);
	}
	public int Aire() {
		this.a= x*y;
		return a;
	}
	
}
