import java.util.Iterator;
import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palin="";
		String test="";
		int longMot;
		/*int midMot;*/
		
		System.out.println("Saisissez un palindrome: ");
		test = Clavier.lireString();
		
		System.out.println("Le mot choisi est: "+test);
		System.out.println("Le mot choisi est: "+test.length());
		
		longMot=test.length();
		
		for(int i= longMot-1;i>=0;i--)
			palin+=test.charAt(i);
		/*palin est le mot inversé de test*/
		/*s'ils sont égaux c'est un palindrome*/
		if(test.equals(palin)) {
			System.out.println("Ceci est bien un palindrome");
		}
		else {
			System.out.println("Ceci n'est PAS un palindrome");
		}
		
		/*System.out.println("Le mot choisi est: "+longMot);*/
		/*compter le nombre de lettre
		 * couper à la moitier
		 * séparer par lettre la deuxième partie
		 * inverser le sens de l'apparition
		 * vérifier l'égalité*/
		
	}

}
