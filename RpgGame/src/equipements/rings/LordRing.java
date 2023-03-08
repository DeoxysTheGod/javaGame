package equipements.rings;

public class LordRing extends Ring {
	
	public LordRing() {
		super();
		this.name = "Anneau du Roi";
		
		this.bonusHp   = 40;
		this.bonusAtk  = 20;
		this.bonusDef  = 10;
		this.bonusLuck = 2;
		
		this.dropRate = 5.0;
	}

	public String toString() {
		return "-%s-%n".formatted(name) +
				"%d PV%n".formatted(bonusHp) +
				"%d ATK%n".formatted(bonusAtk) +
				"%d DEF%n".formatted(bonusDef) +
				"%d Chance%n".formatted(bonusLuck);
	}
	
	
}
