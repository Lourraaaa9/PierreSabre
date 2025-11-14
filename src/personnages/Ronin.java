package personnages;

public class Ronin extends Humain {
	private int honneur =1;

	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int don = (int) (this.getArgent()*0.1);
		parler(beneficiaire.getNom() + " prend ces " + don + " sous.");
		beneficiaire.recevoir(don);
		this.perdreArgent(don);
	}
	
	public void provoquer(Yakuza adversaire) {
		parler("Je t'ai trouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand !");
		if (honneur*2>=adversaire.getReputation()) {
			this.honneur+=1;
			parler("Je t'ai eu petit yakusa !");
			this.gagnerArgent(adversaire.perdre());
		}else {
			this.honneur-=1;
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse en ont pris un coup.");
			int argent=getArgent();
			adversaire.gagner(argent);
			this.perdreArgent(argent);
		}
	}
	

}
