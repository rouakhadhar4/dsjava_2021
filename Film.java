package ds_2021;


import java.util.Scanner;

	public class Film {
		protected String titre;
		protected String realisateur;
		protected String pays_origine;
		protected int duree;
		protected int nb;
		public int getNb() {
			return nb;
		}
		public void setNb(int nb) {
			this.nb = nb;
		}
		@Override
		public String toString() {
			return "titre=" + titre + ", realisateur=" + realisateur + ", pays_origine=" + pays_origine + ", duree="
					+ duree + ", nb=" + nb ;
		}
		Film (String titre, String r, String pays, int d)
		{
			this.titre=titre;
			this.realisateur=r;
			this.pays_origine=pays;
			this.duree=d;
		
		}
		public float totalVenteBillets () {
			float montant =0;
			Scanner S = new Scanner(System.in);
			int nbr_etudiant=0;
			do {
				
		        System.out.println("Quel est le nombre de places des etudiants? ");
		        nbr_etudiant = S.nextInt();
			}
			while(nbr_etudiant<0 || nbr_etudiant>nb);
			
	        montant =nbr_etudiant *2;
	        
	        int nbr_pub=this.nb - nbr_etudiant;
	        montant+=nbr_pub *3;
	        return montant;
			
		}
	

			
			
			

			
	}
		
		
		

	
	