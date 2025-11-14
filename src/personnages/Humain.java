package personnages;

public class Humain {
	private String nom;
	private String boisson;
	private int argent;
	protected int nbConaissance;
	protected Humain[] memoire = new Humain[30];
	
	
	
	public Humain(String nom, String boisson, int argent) {
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}
	public String getNom() {
		return nom;
	}
	public int getArgent() {
		return argent;
	}
	protected void parler(String texte) {
		System.out.println("(" + this.nom + ")-" + texte);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + this.nom + " et j'aime boire du " + this.boisson);
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + this.boisson +" ! GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		if (this.argent>prix) {
		parler("J'ai " +this.argent+" sous en poche. Je vais pouvoir m'offrir un(e) " + bien + " pour " + prix + " sous");
		this.argent-=prix;
		}else {
			parler("Je n'ai plus que " +this.argent+" sous en poche. Je ne peux même pas m'offrir un(e) " + bien + " à " + prix + " sous");
		}
	}
	
	protected void gagnerArgent(int gain) {
		this.argent+=gain;
	}
	
	protected void perdreArgent(int perte) {
		this.argent-=perte;
	}
	
	public void faireConnaissanceAvec(Humain humain) {
		this.direBonjour();
		humain.repondre(this);
		this.memoriser(humain);
	}
	
	private void repondre(Humain humain) {
		this.direBonjour();
		this.memoriser(humain);
	}
	
	private void memoriser(Humain humain) {
		if (nbConaissance<30){
		this.memoire[nbConaissance]=humain;
		nbConaissance+=1;
		}else {
			
		}
	}
	
	public void listerConnaissance() {
		String texte = "Je connais beaucoup de monde dont : ";
		for (int i=0;i>nbConaissance-1;i++) {
			texte+=memoire[i].getNom() + ", ";
		}
		texte+=memoire[nbConaissance].getNom();
		parler(texte);
	}
}




















