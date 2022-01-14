
public class C_POSITION {
	protected int x;
	protected int y;
	
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
	C_POSITION(int x, int y){
		this.x=x;
		this.y=y;
	}
	void deplace(int xa, int ya) {
		x+=xa;
		y+=ya;
	}
	void affiche(){
		System.out.println("X="+x);
		System.out.println("Y="+y);
	}
	
}
