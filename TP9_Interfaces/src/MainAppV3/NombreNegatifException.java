package MainAppV3;

@SuppressWarnings("serial")
class NombreNegatifException extends Exception{
	public NombreNegatifException() {
		System.out.println("Vous essayez d'instancier une classe C_Point avec une coordonée négative !");
	}
}
