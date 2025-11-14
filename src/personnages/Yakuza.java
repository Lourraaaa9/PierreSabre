package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation=0;
	
	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom,boisson,argent);
		this.clan = clan;
	}
	
	public void extorquer(Commercant victime) {
		parler("Tiens, tiens ne serait-ce pas une faible marchand qui passe par là ?");
		parler(victime.nom + ", si tu tiens à la vie donne moi ta bourse !");
		int sous = victime.seFaireExtorquer();
		this.argent+=sous;
		parler("J'ai piqué les " + sous + " sous de " + victime.nom + ", ce qui me fait " +this.argent + " sous dans ma poche. Hi ! Hi !");
	
	}

}
