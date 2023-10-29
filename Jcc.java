package ds_2021;


	public class Jcc {
		public Film competition[];
		private int annee;
		private final int NBFMAX=30;
		private int nbF=0;
		
		 Jcc(int taille,String annee)
			{
			 competition =new Film[taille];
				
				
			}
		 public void ajoutFilm (Film f)
		 {
				
				 if(this.nbF<NBFMAX)
				 {
					 competition[nbF]=f;
					 nbF++;
					 
				 }
				 else
				 {
					 System.out.println("La compétition est au complet");
				 }
		 }
	
		 public void listeFilmsJCC() {
			    for (int i = 0; i < competition.length; i++) {
			        if (competition[i] != null) {
			            System.out.println(competition[i].toString());
			        }
			    }
			}
		 double totalVenteBilletsJCC() {
			    double total = 0;
			    for (int i = 0; i < competition.length; i++) {
			    	 if (competition[i] != null)
			        total = total + competition[i].totalVenteBillets();
			    }
			    return total;
			}
	
	
		 
		 


}
