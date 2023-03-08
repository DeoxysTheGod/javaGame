package equipements.chestplates;

import equipements.leggings.Legging;

public class LeatherChestplates extends Chestplates {

	public LeatherChestplates() {
		super();
		this.name = "Plastron en cuir";
		this.bonusHp  = 10 ;
		this.bonusDef = 20 ;
		this.bonusCc  =  0 ;
		this.dropRate = 10.0 ;
	}

	// toString

	public String toString() {
		return super.toString() +
				"%s%n".formatted(name) +
				"%-4d PV%n".formatted(bonusHp) +
				"%-4d DEF%n".formatted(bonusDef) +
				"%-4d CC%n".formatted(bonusCc);
	}
	
}