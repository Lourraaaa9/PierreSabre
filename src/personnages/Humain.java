package personnages;

public class Humain {
	protected String nom;
	protected String boisson;
	protected int argent;
	
	
	
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
	
	private void gagnerArgent(int gain) {
		this.argent+=gain;
	}
	
	private void perdreArgent(int perte) {
		this.argent-=perte;
	}
}
