package equipements.boots;

public class LeatherBoots extends Boots {

	public LeatherBoots() {
		super();
		this.name = "Jambière en cuir";
		
		this.bonusHp  = 2 ;
		this.bonusDef = 2 ;
		
		this.dropRate = 40.0 ;
	}

	// toString

	public String toString() {
		return super.toString() +
				"%s%n".formatted(name) +
				"%-4d PV%n".formatted(bonusHp) +
				"%-4d DEF%n".formatted(bonusDef);
	}
	
}
