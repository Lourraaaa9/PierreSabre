package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation=0;
	
	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom,boisson,argent);
		this.clan = clan;
	}

	
	public int getReputation() {
		return reputation;
	}

	public void extorquer(Commercant victime) {
		parler("Tiens, tiens ne serait-ce pas une faible marchand qui passe par là ?");
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		int sous = victime.seFaireExtorquer();
		this.gagnerArgent(sous);
		parler("J'ai piqué les " + sous + " sous de " + victime.getNom() + ", ce qui me fait " +this.getArgent() + " sous dans ma poche. Hi ! Hi !");
		this.reputation+=1;
	
	}
	
	public int perdre() {
		int argent=this.getArgent();
		this.perdreArgent(argent);
		this.reputation-=1;
		parler("J'ai perdu mon duel et mes " + argent + " sous, snif... J'ai déshonor le clan de " + this.clan);		
		return argent;
	}
	
	public void gagner(int gain) {
		this.gagnerArgent(gain);
		this.reputation+=1;
		parler("Ce ronin pensait vraiment battre " + this.getNom() + " du clan de " + this.clan + " ? Je l'ai dépouillé de ses " + gain + " sous");
	}
}
