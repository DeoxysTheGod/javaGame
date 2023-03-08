package equipements.leggings;

public class LeatherLeggings extends Legging {

	public LeatherLeggings() {
		super();
		this.name = "Jambière en cuir";
		this.bonusHp  = 15 ;
		this.bonusDef = 10 ;
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
