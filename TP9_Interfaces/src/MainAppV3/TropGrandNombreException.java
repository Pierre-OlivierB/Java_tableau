package MainAppV3;

public class TropGrandNombreException extends Exception {
	public TropGrandNombreException() {
		System.out.println("Vous essayez d'instancier une classe C_Point avec une coordon�e trop grande(>100) !");
	}
}

