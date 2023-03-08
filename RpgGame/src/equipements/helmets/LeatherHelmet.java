package equipements.helmets;

import equipements.Stuff;

public class LeatherHelmet extends Stuff {

	public LeatherHelmet() {
		super();
		this.name = "Casque en cuir";
		this.bonusHp  = 10 ;
		this.bonusDef = 10 ;
		this.bonusCc  =  1 ;
		this.dropRate = 20.0 ;
	}

	// toString

	public String toString() {
		return "-" + name + "" + "-\n" +
				bonusHp   + " PV\n"   +
				bonusDef  + " DEF\n"  +
				bonusCc   + " CC\n";
	}
	
}
