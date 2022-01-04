import java.util.Iterator;

public class CarrImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Exercice 3*/
		/*Programme Fairesomme
		Var
		ValeurLue : Nombre
		Lasomme : Nombre
		Début
		Lasomme =0
		Ecrire(ecran, " Entrez une série de valeurs")
		Lire(clavier, Valeurlue)
		Tant que ValeurLue<>0 || Faire
		Lasomme=LaSomme+ValeurLue
		lire(clavier, ValeurLue)
		Fin tanque
		Afficher " La somme des valeurs saisie est ", Lasomme
		fin*/
		int []valeur;
		int ValeurLue;
		double LaSomme = 0;
		valeur = new int[5];
		System.out.println("Entrez une série de valeurs :");
		int i;
		i=0;
		
		
		do {
			ValeurLue = Clavier.lireInt();
			if (ValeurLue!=0) {
			LaSomme+=ValeurLue;
			System.out.println("La somme des valeurs saisies est "+LaSomme);
			valeur[i]=ValeurLue;
			System.out.println(valeur[i]);
			for(int j=0;j<valeur.length;j++) {
				System.out.println("Voici le tableau "+valeur[j]);
				}
			i++;
			}
			else {
				System.out.println("La somme des valeurs saisies est "+LaSomme);
				
			}
			
			
			}while (i<=4);
		
		
		
		/*Exercice 2*/
		/*double []car= {10, 11, 12, 10, 11, 12, 15, 16, 8, 10};
		double total =0;
		for(int i=0;i<car.length;i++) {
			total= total+ car[i];
		}
		double moyenne = total/car.length;
		System.out.println("La moyenne est :" + moyenne);
		for(int i=0;i<car.length;i++) {
			if (car[i]>=moyenne) {
			System.out.println("Les notes audessus de la moyenne sont :"+ car[i]);
			}
		}*/
		
		/*int n;
		int m;
		int o;
		int p;
		int q;
		int r;
		int t;
		n=10;
		m=11;
		o=12;
		p=10;
		q=11;
		car= new int [n];
		car= new int [m];
		car= new int [o];
		car= new int [p];
		car= new int [q];
		t=5;
		r=(n+m+o+p+q)/t;
		for(int i=0; i<t-1;i++)
		if (r<=i) {
			System.out.println("Les valeurs audessus de la moyenne sont: "+Array[i]);
		}

		
		
		/*int m;
		int o;
		int p;
		int q;
		int r;
		System.out.print("Rentrez 5 valeurs: ");
		n = Clavier.lireInt();
		m = Clavier.lireInt();
		o = Clavier.lireInt();
		p = Clavier.lireInt();
		q = Clavier.lireInt();
		
		car = new int[n];
		car = new int[m];
		car = new int[o];
		car = new int[p];
		car = new int[q];
		
		System.out.println("Vous avez entré les valeurs suivantes: "+n+"; " +m+"; " + o+"; " + p+"; " +q);
		
		r = (n+m+o+p+q)/5;
		
		System.out.println("La moyenne des valeurs rentrées est : "+ r+ ".");
		/*for (int i=0; i<n; i++)
			car[i]=(2*i+1)*(2*i+1);
		for (int i=0;i<n;i++)
			System.out.println((2*i+1)+ " a pour carre " + car[i]+ ".");*/
		
		
	}

}
/*Ecrire un programme qui : 
 * Lit dans un tableau 
 * 5 valeurs fournie au clavier 
 * En calcule et en affiche la moyenne, 
 * la plus grande et la plus petite valeur*/