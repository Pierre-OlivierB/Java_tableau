

public class TableauAnimal {
	
	public void initialisationAnimal() {
		Animal denver= new Animal("Denver", 10,"Ne joue pas","Ne dort pas","Ne mange pas",1);
		boolean vivant=false;
		do {
			vivant=true;
			montreEtat(denver);
			actions(denver);
			if(denver.getEnergie()<1) {
				System.out.println(denver.getNom()+"  se sent à bout d'énergie.");
			}
			else if(denver.getPoids()>15) {
				System.out.println(denver.getNom()+" est plus vert que d'habitude. Il ne se sent pas bien.");
			}
			else {
				System.out.println(denver.getNom()+" se sent bien.");
				vivant=!vivant;
			}	
		}
		while(!vivant);
		System.out.println(denver.getNom()+" est mort! Paix à son âme.");
	}
	public static void montreEtat(Animal animal) {
		System.out.println("Ton dinosaur s'appelle: "+animal.getNom());
		System.out.println("Actuellement "+animal.getNom()+" a "+animal.getEnergie()+" d'énergie.");
		
	}
	public static void actions(Animal animal) {
		System.out.println("Que voulez-vous faire avec "+animal.getNom()+" ?");
		System.out.println("Réponse 1: Manger; 2: Jouer; 3: Dormir");
		int choix=Clavier.lireInt();
		if(choix==1) {
			System.out.println("Vous avez choisi de nourrir "+animal.getNom()+", il est content!");
			mangerAnimal(animal);
		}
		else if(choix==2) {
			System.out.println("Vous avez choisi de jouer avec "+animal.getNom()+", il est content!");
			jouerAnimal(animal);
		}
		else if(choix==3) {
			System.out.println("Vous avez choisi de lui demander d'aller se coucher. "+animal.getNom()+" le fait à reculon!");
			if(animal.getEnergie()>15) {
				System.out.println(animal.getNom()+"ne vous écoute pas, il veut faire autre chose!");
				actions(animal);
			}
			dormirAnimal(animal);
		}
		else {
			System.out.println(animal.getNom()+" n'a pas bien compris ce que tu voulais faire.");
			actions(animal);
		}
	}
	public static void energieAnimal(Animal animal) {
		int n=animal.getEnergie();
		animal.setEnergie(n-5);
	}
	public static void jouerAnimal(Animal animal) {
		System.out.println(animal.getNom()+" court partout");
		System.out.println(animal.getNom()+" Sort sa guitare et joue un morceau.");
		energieAnimal(animal);
	}
	public static void dormirAnimal(Animal animal) {
		System.out.println(animal.getNom()+" va se coucher");
		int h=animal.getEnergie();
		h=h+Random();
		animal.setEnergie(h);
		System.out.println(animal.getNom()+" dort toujours.");
		System.out.println(animal.getNom()+" est à "+animal.getEnergie()+" d'energie!");
		System.out.println("Voulez-vous le laisser dormi? Réponse attendu: o/n");
		String r=Clavier.lireString();
		if(r.equals("o")) {
			h=animal.getEnergie();
			h=h+Random();
			animal.setEnergie(h);
			System.out.println(animal.getNom()+" se réveille doucement...");
		}
		else if(r.equals("n")) {
			System.out.println("Vous réveillez doucement "+animal.getNom()+". L'animal ouvre les yeux et vous sourrit.");
			
		}
		else {
			System.out.println("Vous ne savez pas quoi faire, sans faire exprès, vous réveillez"+animal.getNom()+"!");	
		}
}
	public static void mangerAnimal(Animal animal) {
		System.out.println(animal.getNom()+" vous tourne autour pour trouver la nourriture.");
		System.out.println("Vous finnissez par lui en donner.");
		System.out.println(animal.getNom()+" vous sourrit!");
		int m=animal.getEnergie();
		m=m+Random();
		animal.setEnergie(m);
		poidsAnimal(animal,m);
	}
	public static void poidsAnimal(Animal animal,int quantite) {
		int volume=animal.getPoids();
		animal.setPoids(volume+quantite);
		System.out.println("Attention "+animal.getNom()+" prends du poids.");
	}
	public static int Random() {
		int max=5;
		int min=1;
		int range =max-min+1;
		int rand = (int)(Math.random()*range)+min;
		if(rand>3) {
			System.out.println("Attention l'animal a beaucoup mangé.");
			}
		if(rand == 1) {
			System.out.println("Vous lui avait peu donné à manger. L'animal a encore faim.");
		}
		return rand;	
	}
}
