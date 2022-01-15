package MainAppV3;

public class C_PRINCIPALE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			C_POINT2 a = new C_POINT2(5, 2);
			a.affiche();
			C_POINT2 b = new C_POINT2(110, -1);
			b.affiche();
		}
		catch(NombreNegatifException e){
			System.out.println("Fin!");
		}
		catch(TropGrandNombreException e) {
			System.out.println("Trop grand!");
		}
		finally {
			System.out.println("Fin du programme");
		}
		
	}

}
