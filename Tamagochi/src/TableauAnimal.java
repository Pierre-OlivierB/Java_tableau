

public class TableauAnimal {
	/*Initialisation de l'animal*/
	public void initialisationAnimal() {
		/*Configuration de l'animal*/
		Animal denver= new Animal("Denver", 10, 1);
		System.out.println("Ton dinosaur s'appelle: "+denver.getNom());
		boolean vivant=false;
		/*boucle d'action de l'animal*/
		do {
			/*statut(denver);*/
			vivant=true;
			/*affichage de l'�tat puis mise en action*/
			montreEtat(denver);
			actions(denver);
			/*v�rifications des constantes*/
			if(denver.getEnergie()<1) {
				System.out.println(denver.getNom()+"  se sent � bout d'�nergie.");
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
		System.out.println(denver.getNom()+" est mort! Paix � son �me.");
	}
	/*Pr�sentation de l'�tat de l'animal*/
	public static void montreEtat(Animal animal) {
		System.out.println("Actuellement "+animal.getNom()+" a "+animal.getEnergie()+" d'�nergie.");	
	}
	/*propositions d'actions*/
	public static void actions(Animal animal) {
		System.out.println("Que voulez-vous faire avec "+animal.getNom()+" ?");
		System.out.println("R�ponse 1: Manger; 2: Jouer; 3: Dormir");
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
			System.out.println("Vous avez choisi de lui demander d'aller se coucher. "+animal.getNom()+" le fait � reculon!");
			if(animal.getEnergie()>15) {
				System.out.println(animal.getNom()+"ne vous �coute pas, il veut faire autre chose!");
				actions(animal);
			}
			dormirAnimal(animal);
		}
		else {
			System.out.println(animal.getNom()+" n'a pas bien compris ce que tu voulais faire.");
			actions(animal);
		}
	}
	/*calcul de l'�nergie perdue*/
	public static void energieAnimal(Animal animal) {
		int n=animal.getEnergie();
		int r= Random();
		animal.setEnergie(n-r);
	}
	/*poids-- gr�ce � actions*/
	public static void jouerAnimal(Animal animal) {
		System.out.println(animal.getNom()+" court partout");
		System.out.println(animal.getNom()+" sort sa guitare et joue un morceau.");
		energieAnimal(animal);
		int p=animal.getPoids();
		int r = Random();
		p=p-r;
		if(p<1) {
			p=1;
		}
		animal.setPoids(p);
	}
	/*domir = energie++*/
	public static void dormirAnimal(Animal animal) {
		System.out.println(animal.getNom()+" va se coucher");
		int h=animal.getEnergie();
		h=h+Random();
		animal.setEnergie(h);
		System.out.println(animal.getNom()+" dort toujours.");
		System.out.println(animal.getNom()+" est � "+animal.getEnergie()+" d'energie!");
		System.out.println("Voulez-vous le laisser dormi? R�ponse attendu: o/n");
		String r=Clavier.lireString();
		if(r.equals("o")) {
			h=animal.getEnergie();
			h=h+Random();
			animal.setEnergie(h);
			System.out.println(animal.getNom()+" se r�veille doucement...");
		}
		else if(r.equals("n")) {
			System.out.println("Vous r�veillez doucement "+animal.getNom()+". L'animal ouvre les yeux et vous sourrit.");
			
		}
		else {
			System.out.println("Vous ne savez pas quoi faire, sans faire expr�s, vous r�veillez"+animal.getNom()+"!");	
		}
}
	/*Manger = poids++ && energie++*/
	public static void mangerAnimal(Animal animal) {
		System.out.println(animal.getNom()+" vous tourne autour pour trouver la nourriture.");
		System.out.println("Vous finnissez par lui en donner.");
		System.out.println(animal.getNom()+" vous sourrit!");
		int m=animal.getEnergie();
		int r=Random();
		m=m+r;
		if(r>3) {
			System.out.println("Attention l'animal a beaucoup mang�.");
			}
		if(r == 1) {
			System.out.println("Vous lui avait peu donn� � manger. L'animal a encore faim.");
		}
		animal.setEnergie(m);
		poidsAnimal(animal,r);
	}
	/*poids = poids init + qtt*/
	public static void poidsAnimal(Animal animal,int quantite) {
		int volume=animal.getPoids();
		animal.setPoids(volume+quantite);
		System.out.println("Attention "+animal.getNom()+" prends du poids.");
	}
	/*Calcul du random*/
	public static int Random() {
		int max=5;
		int min=1;
		int range =max-min+1;
		int rand = (int)(Math.random()*range)+min;
		return rand;	
	}
	/*public static void statut(Animal animal) {
		System.out.println(animal.getEnergie());
		System.out.println(animal.getJouer());
		System.out.println(animal.getManger());
		System.out.println(animal.getPoids());
	}*/
}
