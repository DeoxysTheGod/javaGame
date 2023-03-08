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
		return super.toString() +
				"%s%n".formatted(name) +
				"%-4d PV%n".formatted(bonusHp) +
				"%-4d ATK%n".formatted(bonusAtk) +
				"%-4d DEF%n".formatted(bonusDef) +
				"%-4d Chance%n".formatted(bonusLuck);
	}
	
}
