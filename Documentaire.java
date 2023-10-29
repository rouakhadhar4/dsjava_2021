package ds_2021;

public class Documentaire extends Film {
	private String sujet;
	private final float tarif=2f;
	Documentaire(String titre, String r, String pays, int d,String sujet)
	{
		super(titre,r,pays,d);
	
		this.sujet=sujet;
		
		
	}
	@Override
	public String toString() {
		return super.toString()+" sujet=" + sujet + ", tarif=" + tarif ;
	}
	public float totalVenteBillets()
	{
		
		float montant=this.nb*tarif;
		return montant; 
		
	}
	
	

}
