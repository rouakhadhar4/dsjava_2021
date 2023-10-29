package ds_2021;

public class test {

	public static void main(String[] args) {
		Jcc J =new Jcc(2,"2021");
		Documentaire D=new Documentaire("Le dernier refuge","Ousman","Mali",86,"La guerre civile");
		D.setNb(30);
	    Film  F=new Film("Insurrection","Jilani Saadi","Tunisie",105);
	     F.setNb(45);
	    J.ajoutFilm(D);
	    J.ajoutFilm(F);
	    J.listeFilmsJCC();
	    D.totalVenteBillets();
	    F.totalVenteBillets();
	    double montantTotalVentes = J.totalVenteBilletsJCC();
	    System.out.println("Montant total des ventes de billets pour les JCC : " + montantTotalVentes + " €");
	      
	  
		

	}

}
