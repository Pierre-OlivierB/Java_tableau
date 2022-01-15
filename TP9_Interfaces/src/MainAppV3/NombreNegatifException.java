package MainAppV3;

@SuppressWarnings("serial")
public class NombreNegatifException extends Exception{
	public NombreNegatifException() {
		System.out.println("Vous essayez d'instancier une classe C_Point avec une coordonée négative !");
	}
}
