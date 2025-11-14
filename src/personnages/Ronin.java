package personnages;

public class Ronin extends Humain {
	private int honneur =1;

	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int don = (int) (this.argent*0.1);
		parler(beneficiaire.nom + " prend ces " + don + " sous.");
		beneficiaire.recevoir(don);
		this.argent-=don;
	}
	

}
