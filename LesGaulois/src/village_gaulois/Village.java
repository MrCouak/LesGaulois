package village_gaulois;

import personnages.Gaulois;

public class Village {
	private String nom;
	private int nbVillageois = 0;
	private int maxVillageois;
	private Gaulois chef;
	private Gaulois[] villageois;

	public Village(String nom, int maxVillageois, Gaulois chef) {
		super();
		this.nom = nom;
		this.maxVillageois = maxVillageois;
		this.chef = chef;
		this.villageois = new Gaulois[maxVillageois];
		chef.setVillage(this);
	}

	public String getNom() {
		return nom;
	}

	public Gaulois getChef() {
		return chef;
	}

	public void ajouterVillageois(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois++;
		gaulois.setVillage(this);
		
	}

	public Gaulois trouverVillageois(int numVillageois) {
		if (numVillageois >= 1 && numVillageois <= maxVillageois) {
			return villageois[numVillageois - 1];
		} else {
			System.out.println("Il n'y a pas autant d'habitants dans notre village!");
			return null;
		}
	}

	public void afficherVillage() {
		System.out.println("Dans le village \"" + getNom() + "\" du chef " + getChef() + " vivent les légendaires gaulois :");
		for (int i = 0; i < nbVillageois; i++) {
			System.out.println("- " + villageois[i]);
		}
	}
	
	public static void main(String[] args) {
		Gaulois abraracourcix = new Gaulois("Abraracourcix", 6);
		Village village = new Village("Village des Irréductibles", 30, abraracourcix);
		village.trouverVillageois(30);
		Gaulois asterix = new Gaulois("Asterix", 8);
		village.ajouterVillageois(asterix);
		Gaulois gaulois = village.trouverVillageois(1);
		System.out.println(gaulois);
		gaulois = village.trouverVillageois(2);
		System.out.println(gaulois);
		village.afficherVillage();
		
		Gaulois obelix = new Gaulois("Obelix", 25);
		village.ajouterVillageois(obelix);
		village.afficherVillage();
		Gaulois doublepolemix = new Gaulois("Doublepolémix", 25);
		
		abraracourcix.sePresenter();
		obelix.sePresenter();
		doublepolemix.sePresenter();
	}
}
