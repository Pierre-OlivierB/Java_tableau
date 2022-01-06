
public class Nom{
			String[] preNom= {"Leila","Kader", "Richard", "Pablo",
					"Guillaume","Fethi", "Garance", "Charles", "Sébastien",
					"Eric", "Jose Luis"
			};
			String[] nomDeFamille = {"ABERKANE","AOUAD","AVISSE", "BLEY", "LAFFORGE",
					"MEZILLET", "RICHARD", "TAMDRARI", "TRAPE", "TSHIBWID","VICENTE"
					
			};
		
			/*public void afficheNoms() {
				for (int i = 0; i<preNom.length; i++) {
					System.out.println(preNom[i]+ " "+ nomDeFamille[i]);
					}
			}*/
			public void afficheString() {
				for (String j: preNom) {
					System.out.println(j);
				}
				for (String h: nomDeFamille) {
					System.out.println(h);
				}
			}
}