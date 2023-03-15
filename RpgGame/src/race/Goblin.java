package race;

public class Goblin extends MonsterRace {

	private int bonusHp    = 0  ;
	private int bonusAtk   = 5  ;
	private int bonusDef   = 0  ;
	private int bonusSpeed = 10 ;

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
	public int getBonusSpeed() {
		return bonusSpeed;
	}

	public String toString() {
		return "Goblin";
	}
}
