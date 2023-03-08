package equipements.helmets;

public class LeatherHelmet extends Helmet {

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
		return "-%s-%n".formatted(name) +
				"%d PV%n".formatted(bonusHp) +
				"%d DEF%n".formatted(bonusDef) +
				"%d CC%n".formatted(bonusCc);
	}
	
}
