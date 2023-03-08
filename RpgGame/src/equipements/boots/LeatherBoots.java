package equipements.boots;

import equipements.leggings.Leggings;

public class LeatherBoots extends Leggings {

	public LeatherBoots() {
		super();
		this.name = "Jambière en cuir";
		this.bonusHp  = 10 ;
		this.bonusDef = 10 ;
		this.bonusCc  =  1 ;
		this.dropRate = 20.0 ;
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
