package classes;

public class Tank extends CharacterClass {
	
	private int bonusHp   = 100;
	private int bonusAtk  = 0;
	private int bonusDef  = 100;
	private int bonusCc   = 0;
	private int bonusLuck = 0;

	// Getter

	public int getBonusHp() {
		return bonusHp;
	}

	public int getBonusAtk() {
		return bonusAtk;
	}

	public int getBonusDef() {
		return bonusDef;
	}

	public int getBonusCc() {
		return bonusCc;
	}

	public int getBonusLuck() {
		return bonusLuck;
	}
	
	public String toString() {
		return "Tank";
	}
	
}
