package personnages;

public class Chaudron {
	private int quantitePotion;
	private int forcePotion;
	
	public Chaudron(int quantitePotion, int forcePotion) {
		super();
		this.quantitePotion = quantitePotion;
		this.forcePotion = forcePotion;
	}
	
	public void remplirChaudron(int quantite, int forcePotion) {
		this.quantitePotion = quantite;
		this.forcePotion = forcePotion;
	}
	
	public Boolean resterPotion() {
		return quantitePotion != 0;
	}
	
	public int prendreLouche() {
		if (quantitePotion == 0) {
			return 0;
		} else {
			quantitePotion--;
			return forcePotion;
		}
	}
	
}
