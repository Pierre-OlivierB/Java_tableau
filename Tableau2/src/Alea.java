
public class Alea {
	/**
	* Entier aléatoire
	* @param lower int // le plus bas
	* @param higher int // le plus haut
	* @return int
	*/
	public static int alea(int lower, int higher ){
		int random = (int)(Math.random() * (higher-lower + 1)) + lower;
		return random;
		
	}
	/*System.out.println(alea(0, 10));*/
	
	/*Tablea de nombre*/
	int[] nombre = new int[5];
	
	/*Méthode container nmb alea*/
	public void stockeNombre() {
		for(int i = 0; i<nombre.length; i++) {
			//nombre[i]=(float)Math.random();
			nombre[i] = alea(1, 6);
		}
	}
	/*Affiche le nombre*/
	public void afficheNombres() {
		for (int i= 0; i<nombre.length;++i) {
			System.out.println(nombre[i]+ "\n");
		}
	}
	
	
}
