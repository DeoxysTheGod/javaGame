package classes;

public class Robber extends CharacterClass {

	private int bonusHp   = 0;
	private int bonusAtk  = 10;
	private int bonusDef  = 0;
	private int bonusCc   = 3;
	private int bonusLuck = 10;

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
		return "Robber";
	}
	
	
}
