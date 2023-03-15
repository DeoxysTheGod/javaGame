package classes;

public class Tank extends CharacterClass {
	
	private int bonusHp    = 100 ;
	private int bonusAtk   = 0   ;
	private int bonusDef   = 100 ;
	private int bonusCc    = 0   ;
	private int bonusSpeed = 1   ;
	private int bonusLuck  = 0   ;

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
	
	@Override
	public String toString() {
		return "Tank";
	}
}
