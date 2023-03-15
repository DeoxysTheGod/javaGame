package race;

public class Troll extends MonsterRace {

	private int bonusHp    = 3  ;
	private int bonusAtk   = 12  ;
	private int bonusDef   = 4  ;
	private int bonusSpeed = 2 ;

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
		return "Troll";
	}
}
