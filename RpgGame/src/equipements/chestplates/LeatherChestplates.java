package equipements.chestplates;

public class LeatherChestplates extends Chestplates {

	public LeatherChestplates() {
		super();
		this.name = "Plastron en cuir";
		
		this.bonusHp  = 2 ;
		this.bonusDef = 3 ;
		
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
