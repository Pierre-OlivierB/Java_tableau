

public class TableauAnimal {
	/*Initialisation de l'animal*/
	public void initialisationAnimal() {
		/*Configuration de l'animal*/
		Animal denver= new Animal("Denver", 10, 1);
		/*Configuration du temps*/
		Temps horloge=new Temps(0,"jeune",0);
		System.out.println("Quel nom voulez-vous donner à votre animal?");
		String rep=Clavier.lireString();
		denver.setNom(rep);
		System.out.println("Ton dinosaur s'appelle: "+denver.getNom());
		boolean vivant=false;
		/*boucle d'action de l'animal*/
		do {
			/*statut(denver);*/
			vivant=true;
			/*affichage de l'état puis mise en action et du temps qui passe*/
			montreEtat(denver, horloge);
			actions(denver, horloge);
			/*vérifications des constantes*/
			if(denver.getEnergie()<1) {
				System.out.println(denver.getNom()+"  se sent à bout d'énergie.");
			}
			else if(denver.getPoids()>15) {
				System.out.println(denver.getNom()+" est plus vert que d'habitude. Il ne se sent pas bien.");
			}
			else if(horloge.getTempsPasse()>23) {
				tombeDeFatigue(denver, horloge);
				vivant=!vivant;
			}
			else if(horloge.getJourDeVie()>10) {
				horloge.setTrancheAge("Vieux");
				vivant=!vivant;
			}
			else {
				System.out.println(denver.getNom()+" se sent bien.");
				vivant=!vivant;
			}	
		}
		while(!vivant);
		System.out.println(denver.getNom()+" est mort! Paix à son âme.");
		System.out.println("Après "+horloge.getJourDeVie()+" jours et "+horloge.getTempsPasse()+" heures de vie, le "+ horloge.getTrancheAge()+" "+denver.getNom()+" n'est plus!");
	}
	/*Présentation de l'état de l'animal*/
	public static void montreEtat(Animal animal, Temps passe) {
		System.out.println("Actuellement "+animal.getNom()+" a "+animal.getEnergie()+" d'énergie.");
		int jourVie=passe.getJourDeVie();
		int journee=passe.getTempsPasse();
		String nom=animal.getNom();
		System.out.println(nom+" a "+jourVie+" jours de vie. Dans le monde de "+nom+" il est "+journee+"h!");
	}
	/*propositions d'actions*/
	public static void actions(Animal animal,Temps passe) {
		System.out.println("Que voulez-vous faire avec "+animal.getNom()+" ?");
		System.out.println("Réponse 1: Manger; 2: Jouer; 3: Dormir.(Réponse attendue: 1/ 2/ 3)");
		int choix=Clavier.lireInt();
		//choix manger
		if(choix==1) {
			System.out.println("Vous avez choisi de nourrir "+animal.getNom()+", il est content!");
			mangerAnimal(animal,passe);
		}
		//choix jouer
		else if(choix==2) {
			System.out.println("Vous avez choisi de jouer avec "+animal.getNom()+", il est content!");
			jouerAnimal(animal,passe);
		}
		//choix dormir
		else if(choix==3) {
			System.out.println("Vous avez choisi de lui demander d'aller se coucher. "+animal.getNom()+" le fait à reculon!");
			if(animal.getEnergie()>15) {
				System.out.println(animal.getNom()+" ne vous écoute pas, il veut faire autre chose!");
				return;
			}
			dormirAnimal(animal,passe);
		}
		else {
			System.out.println(animal.getNom()+" n'a pas bien compris ce que tu voulais faire.");
			return;
		}
	}
	/*calcul de l'énergie perdue*/
	public static void energieAnimal(Animal animal) {
		int n=animal.getEnergie();
		int r= Random();
		animal.setEnergie(n-r);
	}
	/*poids-- grâce à actions & temps++, 
	 * plus de temps passé plus de poids perdu*/
	public static void jouerAnimal(Animal animal,Temps passe) {
		System.out.println(animal.getNom()+" court partout");
		System.out.println(animal.getNom()+" sort sa guitare et joue un morceau.");
		energieAnimal(animal);
		int p=animal.getPoids();
		int h=passe.getTempsPasse();
		int r = Random();
		passe.setTempsPasse(h+r);
		p=p-r;
		if(p<1) {
			p=1;
		}
		animal.setPoids(p);
	}
	/*domir = energie++; dormir = temmps++ +1*/
	public static void dormirAnimal(Animal animal, Temps passe) {
		System.out.println(animal.getNom()+" va se coucher");
		sommeilNormal(animal,passe);
		System.out.println(animal.getNom()+" est à "+animal.getEnergie()+" d'energie!");
		System.out.println("Voulez-vous le laisser dormi? (Réponse attendu: o/ n)");
		String r=Clavier.lireString();
		if(r.equals("o")) {
			if(passe.getTempsPasse()>23) {
				continueDeDormir(animal,passe);
			}
			else {
				/*int h=animal.getEnergie();
				h=h+Random();
				animal.setEnergie(h);*/
				sommeilNormal(animal,passe);
				System.out.println(animal.getNom()+" se réveille doucement...");
			}
			
		}
		else if(r.equals("n")) {
			System.out.println("Vous réveillez doucement "+animal.getNom()+". L'animal ouvre les yeux et vous sourrit.");
			
		}
		else {
			System.out.println("Vous ne savez pas quoi faire, sans faire exprès, vous réveillez"+animal.getNom()+"!");	
		}
}
	/*Manger = poids++ && energie++*/
	public static void mangerAnimal(Animal animal, Temps passe) {
		System.out.println(animal.getNom()+" vous tourne autour pour trouver la nourriture.");
		System.out.println("Vous finnissez par lui en donner.");
		System.out.println(animal.getNom()+" vous sourrit!");
		int m=animal.getEnergie();
		int r=Random();
		m=m+r;
		int h=passe.getTempsPasse();
		passe.setTempsPasse(h+r);
		if(r>3) {
			System.out.println("Attention l'animal a beaucoup mangé.");
			}
		if(r == 1) {
			System.out.println("Vous lui avait peu donné à manger. L'animal a encore faim.");
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
	/*+24h => l'animal tombe de fatigue*/
	public static void tombeDeFatigue(Animal animal,Temps passe) {
		System.out.println(animal.getNom()+" a sommeille.");
			int h=passe.getTempsPasse();
			passe.setTempsPasse(h-24);
			int j=passe.getJourDeVie();
			j++;
			passe.setJourDeVie(j);
			System.out.println(animal.getNom()+" s'effondre de sommeil.");
			pleinReve(animal, passe);
			
	}
	/*L'utilisateur le laisse dormir: cas passage des 24h*/
	public static void continueDeDormir(Animal animal,Temps passe) {
		int h=animal.getEnergie();
		int r =Random();
		h=h+r;
		animal.setEnergie(h);
		System.out.println(animal.getNom()+" continue de dormir");
		int g=passe.getTempsPasse();
		passe.setTempsPasse(g-24);
		int j=passe.getJourDeVie();
		j++;
		passe.setJourDeVie(j);
		System.out.println("Après "+r+"h de sommeil supplémentaires "+animal.getNom()+" se réveille de lui même!");
	}
	/*si tombe de fatigue */
	public static void pleinReve(Animal animal, Temps passe) {
		int h=animal.getEnergie();
		int r =Random();
		h=h+r;
		animal.setEnergie(h-1);
		System.out.println(animal.getNom()+" continue de dormir");
		int g=passe.getTempsPasse();
		passe.setTempsPasse(g+r);
		System.out.println("Après "+r+"h de sommeil supplémentaires "+animal.getNom()+" se réveille de lui même!");
	}
	/*calcul du sommeil normal*/
	public static void sommeilNormal(Animal animal, Temps passe) {
		int h=animal.getEnergie();
		int p=passe.getTempsPasse();
		int ran=Random();
		h=h+ran;
		passe.setTempsPasse(p+ran+1);
		animal.setEnergie(h);
		//System.out.println(animal.getNom()+" dort toujours.");
	}
	
	
	/*temps jouer*/
//	public void tempsJouer() {
//		int jouer = 
//	}
	/*temps dormir*/
	
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
