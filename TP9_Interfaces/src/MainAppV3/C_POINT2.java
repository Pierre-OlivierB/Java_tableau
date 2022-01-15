package MainAppV3;

public class C_POINT2 {
	protected int x;
	protected int y;
	
	public C_POINT2(int abs, int ord) throws NombreNegatifException,TropGrandNombreException{
	if((abs>100)||(ord>100)) {
		
		throw new TropGrandNombreException();
		}
	else if((abs < 0) || (ord < 0)) {
		throw new NombreNegatifException();
	}
	else {
		this.x = abs;
		this.y = ord;
		}
	
	}
	public void affiche() {
		System.out.println("Mes coor. cart‚. sont " + x + " " + y);
	}
}
