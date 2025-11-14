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
	
	public void provoquer(Yakuza adversaire) {
		parler("Je t'ai trouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand !");
		if (honneur*2>=adversaire.getReputation()) {
			this.honneur+=1;
			parler("Je t'ai eu petit yakusa !");
			this.argent+=adversaire.perdre();
		}else {
			this.honneur-=1;
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse en ont pris un coup.");
			adversaire.gagner(this.argent);
			this.argent=0;
		}
	}
	

}
