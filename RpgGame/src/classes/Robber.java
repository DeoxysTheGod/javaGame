package classes;

public class Robber extends CharacterClass {

	private int bonusHp    = 0  ;
	private int bonusAtk   = 10 ;
	private int bonusDef   = 0  ;
	private int bonusCc    = 3  ;
	private int bonusSpeed = 5  ;
	private int bonusLuck  = 10 ;

	// Getter
	
	@Override
	public int getBonusHp() {
		return bonusHp;
	}

	@Override
	public int getBonusAtk() {
		return bonusAtk;
	}

	@Override
	public int getBonusDef() {
		return bonusDef;
	}

	@Override
	public int getBonusCc() {
		return bonusCc;
	}
	
	@Override
	public int getBonusSpeed() {
		return bonusSpeed;
	}

	@Override
	public int getBonusLuck() {
		return bonusLuck;
	}

	public String toString() {
		return "Robber";
	}
}
