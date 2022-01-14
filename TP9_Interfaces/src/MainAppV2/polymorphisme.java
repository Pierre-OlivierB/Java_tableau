package MainAppV2;

import java.util.Scanner;

public class polymorphisme {
	static int total;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TP 3 java p.18
		
		//Consignes:
		
		//But:
//		Réaliser un programme permettant de dessiner 100 figures sur l’écran d'un ordinateur. 
		//Restrictions:
		//Ces figures pouvant être des cercles ou des carrés au choix de l’utilisateur.
		//Indices:
//		Pour cela, il suffira de créer un tableau de 100 objets de type C_FIGURE.
		//Notes:
//		Ce tableau ne sera pas divisé en 50 cercles et 50 carrés, mais il pourra contenir 100 figures 
		//(cercle ou carré) non déterminés lors du lancement du programme.
		
//		Vous pouvez appeler votre classe C_FIGURE et en dériver les classes C_CERCLE et C_CARRE.
//		Votre classe C_FIGURE aura 2 attributs x et y correspondants aux coordonnées des figures à dessiner.
//		Votre classe C_CERCLE aura un attribut rayon et votre class C_CARRE aura un attribut coté.
//		La méthode affiche ( ) sera redéfinie.
		
		C_FIGURE[]container=new C_FIGURE[100];
		Scanner s= new Scanner(System.in);
		System.out.println("Voici un tableau de 100 objets. Combien voulez de cercles par rapport aux carrés? Réponse attendu: 0 à 100");
		int nmbrCercle= s.nextInt();
		int nmbrCarre=100-nmbrCercle;
		
		System.out.println("Nombre de cercle: "+nmbrCercle);
		
		
		for(int i=0; i<nmbrCercle;i++) {
			container[i]=new C_CERCLE2(5);
		}
		for(int i=nmbrCercle; i<100;i++) {
			container[i]=new C_CARRE();
		}
		for(int i=0;i<100;i++) {
			container[i].affiche();
			container[i].Aire();
		}
//		System.out.println(container[5].getA());
		for(int i=0;i<100;i++) {
			total = container[i].getA();
			System.out.println(total);
			Aire_Totale(total);
		}
		System.out.println(total);
		
		//for
	}
	public static int Aire_Totale(int ajout) {
		total+=ajout;
		return total;
		}
	

}
