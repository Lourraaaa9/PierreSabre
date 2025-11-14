package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		super(nom, "the", argent);
	}
	
	public int seFaireExtorquer() {
		parler("J'ai tout perdu ! Le monde est trop injuste...");
		int argent=this.getArgent();
		this.perdreArgent(argent);
		return argent;
	}
	
	public void recevoir(int argent) {
		parler(argent + " sous ! Je te remercie généreux donateur !");
		this.gagnerArgent(argent);
	}

}
