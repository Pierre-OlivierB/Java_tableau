import java.util.Scanner;

public class MainApp {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Les attributs sont : les coordonnées x et y du centre du cercle
								//le rayon
		C_CERCLE test=new C_CERCLE(5, 10, 5);
		test.affiche();
		test.deplace(6,7);
		test.affiche();
		test.compare(4);
		test.surface();	
		
		//Les méthodes sont : 
		//C_CERCLE (abs, ord, rayon)
		//déplace (delta_x, delta_y)
		//affiche () // utilisez un simple appel à « println »
		//boolean compare ( cercle ) // comparaison des rayons uniquement
		//double surface()
		
		//exo2
//		Créez un tableau de 3 objets de la classe C_CERCLE définie.
		C_CERCLE[]test2=new C_CERCLE[3];
		test2[0]=new C_CERCLE(5, 10, 5);
//		test2[0].setX(5);
//		test2[0].setY(10);
//		test2[0].setR(5);
		test2[1]=new C_CERCLE(4, 8, 3);
//		test2[1].setX(4);
//		test2[1].setY(8);
//		test2[1].setR(3);
		test2[2]=new C_CERCLE(8, 9, 10);
//		test2[2].setX(8);
//		test2[2].setY(9);
//		test2[2].setR(10);
		for(int i=0;i<test2.length;i++) {
			int r=i+1;
		System.out.println("Objet "+ r);
		System.out.println("X: "+test2[i].getX());	
		System.out.println("Y: "+test2[i].getY());
		System.out.println("R: "+test2[i].getR());
		}
		
		//exo 3
		//Créez un tableau de plusieurs objets de la classe C_Cercle
		Scanner s= new Scanner(System.in);
		System.out.println("Combien voulez-vous de cases? ");
		int nombre = s.nextInt();
		int numero=nombre;
		C_CERCLE[]test3=new C_CERCLE[nombre];
		for (int i = 0; i<test3.length;i++) {
//			nombre++;
			test3[i]=new C_CERCLE(numero, nombre, numero);
			System.out.println("X"+i+" "+test3[i].getX());	
			System.out.println("Y"+i+" "+test3[i].getY());
			System.out.println("R"+i+" "+test3[i].getR());	
		}
//			ok=false;
			
//		boolean ok=true;
//		do {
			
			
			
//		} while (!ok);
		
		//TP2 java p.15
		C_POINT test4= new C_POINT('a');
		test4.affiche();
		//TP 3 java p.18
	}
	
}
