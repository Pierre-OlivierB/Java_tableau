
public class C_POINT extends C_POSITION{
//	private int x;
//	private int y;
	private int z;
	private char nom;
	
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	public char getNom() {
		return nom;
	}
	public void setNom(char nom) {
		this.nom = nom;
	}
	
	public C_POINT(){
		super(0,0);
	}
//	public C_POINT(int x,int y, int z) {
//		super(0,0);
//		this.z=z;
//	}
	public C_POINT(char nom) {
		super(3,7);
		this.nom=nom;
	}
	public void affiche() {
		super.affiche();
		System.out.println(nom+"("+this.x+","+this.y+")");
	}
}
