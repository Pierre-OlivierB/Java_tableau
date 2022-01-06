import java.util.Iterator;
import java.util.Scanner;

public class Notes {
	/*float note[][] = new float[3][4];
	
	for (int i = 0; i < note.length; ++i) {
		for (int j=0; j < note[0].length; ++j) {
		note[i][j] = Alea.alea(0, 10);
		}
	}*/
	static double note[][]= {
			{4.75,5.00,5.75,5.25},
			{3.00,5.25,4.75,6.00},
			{4.25,5.00,4.75,5.52}
	};
	/*Ceci créé un tableau pour les moyennes*/
	double moyenne[] = new double[3];
	/*Ceci calcule les moyennes*/
	public void calculeMoyennes() {
		double sum;
		for(int i = 0; i<3;++i) {
			sum = 0.0;
			for(int j=0;j<4;++j) {
				sum+=note[i][j];
			}
			moyenne[i] = sum/4;
			/*4 notes par grp*/
		}
	}
	/*affiche les notes stockés et leurs moyennes*/
	public void afficheNotesMoy() {
		for(int i=0;i<4; ++i) {
			System.out.print("\tét."+i);
			/*affichage n° étudiant après un tab*/
		}
		System.out.println("\tmoyenne");
		/*affichage du titre moyenne après un tab puis saut de ligne*/
		for(int i=0;i<3;i++) {
			System.out.print("Grp"+i+'\t');
			/*affichage n° Grp PUIS un tab*/
			for(int j=0;j<4;j++) {
				System.out.print(note[i][j]+"\t");
				/*affichage d'une note après l'autre PUIS un tab*/
			}
			System.out.println(moyenne[i]);
			/*affichage d'une moyenne après l'autre PUIS un changement de ligne*/
		}
	}
	/*Méthode pour tester*/
	public static void testNotes() {
		Notes f= new Notes();
		f.calculeMoyennes();
		f.afficheNotesMoy();
	}
	/*3. Exercices sur les matrices*/
	/*1- Dans une méthode « matAlea43() »
En utilisant les boucles imbriquées 
et en vous aidant de l'exemple au dessus.
Remplir 
une matrice de 4 colonnes 
et
 3 lignes 
 de nombres aléatoires.*/
	
	public void matAlea43() {
	System.out.println("Exo 1");
	int n = 3;
	int m = 4;
	double [][] a = new double[n][m];
	for (int i=0;i<n;i++) {
		for(int j=0; j<m;j++) {
			a[i][j] =10*Math.random();
			}
		}
	for(int i=0;i<a.length;i++) {
		for (int j=0;j<a[0].length;j++) {
			System.out.print(a[i][j]+"\t");
			}
		System.out.println();
		}
		
	}
	/*Tableau défini par des paramètres*/
	public void matAlea43(int c, int d) {
		System.out.println("Exo 2");
		int n = c;
		int m = d;
		double [][] a = new double[n][m];
		for (int i=0;i<n;i++) {
			for(int j=0; j<m;j++) {
				a[i][j] =10*Math.random();
				}
			}
		for(int i=0;i<a.length;i++) {
			for (int j=0;j<a[0].length;j++) {
				System.out.print(a[i][j]+"\t");
				}
			System.out.println();
			}
	}
	/*Tableau défini par l'utilisateur*/
	public void matClavier() {
		System.out.println("Exo 3");
		Scanner scaner = new Scanner(System.in);
		System.out.println("Combien voulez-vous de lignes?");
		int n = scaner.nextInt();
		System.out.println("Combien voulez-vous de colonnes?");
		int m = scaner.nextInt();
		double [][] a = new double[n][m];
		for (int i=0;i<n;i++) {
			for(int j=0; j<m;j++) {
				a[i][j] =10*Math.random();
				}
			}
		for(int i=0;i<a.length;i++) {
			for (int j=0;j<a[0].length;j++) {
				System.out.print(a[i][j]+"\t");
				}
			System.out.println();
			}
	}
	
}
