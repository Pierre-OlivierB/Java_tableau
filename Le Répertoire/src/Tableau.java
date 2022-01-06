import java.util.Scanner;

public class Tableau {
	Scanner scanner = new Scanner(System.in);
	public void personneClavier() {
		System.out.println("Exo 1");
		/*Déclaration variables*/
		String prenom="";
		String nom="";
		String adresse="";
		int codePostal=0;
		String ville="";
		Integer age=0;
		Personne[] array;
		/*Tableau à 6colonnes et le nombre de personnes en lignes*/
		System.out.println("Combien voulez-vous d'objet?");
		int n =4;	
		array= new Personne[n];

		/*array[0]=new Personne("prenom","oui","adresse",10000,"ville",100);
		array[1]=new Personne("prenom","non","adresse",10000,"ville",50);
		array[2]=new Personne("prenom","ok","adresse",10000,"ville",120);
		array[3]=new Personne("prenom","plop","adresse",10000,"ville",25);*/
		for (int i=0;i<n;i++) {
			scanner.nextLine();
			array[i]=new Personne(prenom,nom,adresse,codePostal,ville,age);
			/*insertion objet i prenom*/
			System.out.print("Nouvelle personne: ");
			System.out.println("Quel est son prénom?");
			prenom=scanner.nextLine();
			array[i].setPrenom(prenom);
			
			/*insertion objet i nom*/
			System.out.println("Quel est son nom?");
			nom=scanner.nextLine();
			array[i].setNom(nom);
					
			/*insertion objet i adresse*/
			System.out.println("Quel est son adresse?");
			adresse=scanner.nextLine();	
			array[i].setAdresse(adresse);
					
			/*insertion objet i CP*/
			System.out.println("Quel est son code postal?");
			codePostal=scanner.nextInt();
			array[i].setCodePostale(codePostal);		
			
			/*insertion objet i ville*/
			scanner.nextLine();
			System.out.println("Quel est sa ville?");
			ville=scanner.nextLine();
			array[i].setVille(ville);
			
			/*insertion objet i age*/		
			System.out.println("Quel est son âge?");
			age=scanner.nextInt();
			array[i].setAge(age);
					
		}
		/*Impression des caractéristiques de l'objet*/
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i].getPrenom()+"\t");
			System.out.print(array[i].getNom()+"\t");
			System.out.print(array[i].getAdresse()+"\t");
			System.out.print(array[i].getCodePostale()+"\t");
			System.out.print(array[i].getVille()+"\t");
			System.out.println(array[i].getAge()+" Ans");
			}
		/*Test tri bulle dans la fonction*/
		/*int taille = array.length;*/
		Personne temp = new Personne();
		
		for(int i=0; i<n-1;i++) {
			for(int j=1;j<n-i;j++)
			if (array[j-1].getAge()>array[j].getAge()) {
				//echanges des éléments
				temp=array[j-1];
				array[j-1]=array[j];
				array[j]=temp;
			}
		}
		
		/*array=tri_a_bulles(array);*/
		System.out.print("La personne la plus jeune est "+array[0].getNom()+". ");
		System.out.println("La personne la plus âgé est "+array[n-1].getNom()+". ");	
	
	}
}
	/*Tri-bulles pour connaitre le plus jeune et le plus vieux*/
	
	
	
	/*static Personne[]tri_a_bulles(Personne []array){
		int taille = array.length;
		Personne []tmp =new Personne[taille];
		for(int i=0; i<taille;i++) {
			for(int j=1;j<(taille-i);j++) {
				//echanges des éléments
				tmp[taille]=array[j-1];
				array[j-1]=array[j];
				array[j]=tmp[taille];
			}
		}
		return array;
	}
}*/
/*Tentatives :*/

/*for(int j=0;j<array.length;j++) {
array[j].getAge().compareTo(array[j++].getAge());
if((array[j].getAge().compareTo(array[j++].getAge()))==1) {
	System.out.println("La personne la plus âgé est "+array[j].getNom());			
}
else if(array[j].getAge().compareTo(array[j++].getAge())==-1) {
	System.out.print("La personne la plus jeune est "+array[j].getNom());
}

}*/
/*if(array.length==1) {
System.out.print("Il n'y a qu'une personne :"+array[0].getNom());
}
else if(array.length==2){
if(array[0].getAge()>array[1].getAge()) {
	System.out.println("La personne la plus âgé est "+array[0].getNom());
	System.out.print("La personne la plus jeune est "+array[1].getNom());
}
else {
	System.out.println("La personne la plus âgé est "+array[1].getNom());
	System.out.print("La personne la plus jeune est "+array[0].getNom());
}
}
else{
for(int j=0;j<array.length;j++) {
	for(int k=1;k<array.length;k++) {
		if(j!=k) {
			if(array[j].getAge()>array[k].getAge()) {
		System.out.println("La personne la plus âgé est "+array[j].getNom());
			}
			else if(array[j].getAge()<array[k].getAge()) {
		System.out.print("La personne la plus jeune est "+array[j].getNom());	
			}
			else{
		System.out.print("Bah fréro?");
			}
		}
		
	}
	
	
}
}*/
/* son nom, 
* prénom, 
* adresse, 
* code postal, 
* ville et 
* age ( ce sera un entier )*/

/*Exo 2*/
/*Modifier affichage : Dévoile le nom du plus âgé et du plus jeune*/
