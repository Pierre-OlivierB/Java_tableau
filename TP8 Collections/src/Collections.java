import java.util.*;
public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*LinkedList Test*/
		
		/*List<Integer> liste_1 = new LinkedList<Integer>();
		// Integer est le type d'élément de la collection
		// ou LinkedList <Integer> liste_1 = new LinkedList<Integer> ();
		liste_1.add(152);
		liste_1.add(155);
		for (int i = 0; i < liste_1.size(); i++) {
		System.out.println("Element à l'index : " + i + " = " + liste_1.get(i));
		}*/
		
		/*ArrayList Test*/
		// ArrayList liste_1 = new ArrayList ();
		/*ArrayList<Integer> liste_1 = new ArrayList<Integer>();
		liste_1.add(152);
		liste_1.add(154);
		/*remplace la case 0 par 555
		 * donc ici 152 par 555*/
		/*liste_1.set(0, 555);
		for (int i = 0; i < liste_1.size(); i++) {
			System.out.println("Element à l'index : " + i + " = " + liste_1.get(i));
		}*/
		
		/*Hashtable*/
		//Hashtabletable_de_hachage = new Hashtable();
		/*Hashtable<Integer, String> table_de_hachage = new
		Hashtable<Integer, String>();
		table_de_hachage.put(1, "PRINTEMPS");
		table_de_hachage.put(5, "ETE");
		table_de_hachage.put(10, "AUTOMNE");
		table_de_hachage.put(30, "HIVER");
		Enumeration<String> enumeration = table_de_hachage.elements();
		
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}*/
		
		/*HashSet*/
		HashSet<String> hs = new HashSet<String>();
		hs.add("toto");
		hs.add("tata");
		hs.add("titi");
		Iterator<String> it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("\nParcours avec un tableau d'objet");
		System.out.println("----------------------------------");
		Object[] obj = hs.toArray();
		for (Object o : obj) {
			System.out.println(o);
		}
		
	}

}
