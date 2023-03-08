package equipements.chest;

import equipements.leggings.Leggings;

public class LeatherChest extends Leggings {

	public LeatherChest() {
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
