package monster;

import stat.BaseStat;
import character.Character;
import race.Goblin;
import race.MonsterRace;
import race.Troll;

public class Monster implements BaseStat {
	
	private MonsterRace monsterRace;
	
	// Base Stat
	private int baseHp     ;
	private int baseAtk    ;
	private int baseDef    ;
	private int baseSpeed ;
	private int baseLvl	   ;
	
	// Final Stat
	public int finalHp     ;
	public int finalAtk    ;
	public int finalDef    ;
	private int finalSpeed ;
	private int finalLvl   ;
	
	// Status
	public boolean dead;
		
	public Monster(String monsterRace) {
		switch(monsterRace) {
		
		case "Goblin":
			this.monsterRace = new Goblin();
			break;
			
		case "Troll":
			this.monsterRace = new Troll();
			break;
			
		default:
			break;
		}
		
		// Stat
		this.baseHp    = BaseStat.hp    ;
		this.baseAtk   = BaseStat.atk   ;
		this.baseDef   = BaseStat.def   ;
		this.baseSpeed = BaseStat.speed ;
		this.baseLvl   = BaseStat.lvl   ;

		// Final Stat
		this.finalHp  = this.baseHp  	 ;
		this.finalAtk = this.baseAtk  	 ;
		this.finalDef = this.baseDef 	 ;
		this.finalSpeed = this.baseSpeed ;
		this.finalLvl = this.baseLvl     ;
	}
	
	// Getter	

	public int getFinalHp() {
		return finalHp;
	}

	public int getFinalAtk() {
		return finalAtk;
	}

	public int getFinalDef() {
		return finalDef;
	}

	public int getFinalSpeed() {
		return finalSpeed;
	}
	
	public MonsterRace getMonsterRace() {
		return monsterRace;
	}

	public int getFinalLvl() {
		return finalLvl;
	}
	
	// Setter
	
	public void setFinalHp(int finalHp) {
		this.finalHp = finalHp;
	}
	
	public void setFinalAtk(int finalAtk) {
		this.finalAtk = finalAtk;
	}
	
	public void setFinalDef(int finalDef) {
		this.finalDef = finalDef;
	}
	
	public void setFinalSpeed(int finalSpeed) {
		this.finalSpeed = finalSpeed;
	}
	
	// Status
	
	public boolean isDead() {
		return dead;
	}
		
	// Combat

	public void attack(Character opponent) {
		if (opponent.isDead()) {
			System.err.println("The opponent is already dead !");
			return;
		}
		int tmp = opponent.finalHp;
		opponent.finalHp -= (this.finalAtk - (this.finalAtk * opponent.finalDef / 100));
		if (opponent.finalHp <= 0) {
				opponent.dead = true;
			opponent.finalHp = 0;
		}
		if (tmp < opponent.finalHp) {
			opponent.setFinalHp(tmp);
		}
	}
	
	// toString
	
	public String toString() {
		if (this.isDead()) {
			return "Race : [DEAD] %s%n".formatted(monsterRace) +
					"%d PV%n".formatted(finalHp) 			   +
					"%d ATK%n".formatted(finalAtk) 			   +
					"%d DEF%n".formatted(finalDef) 			   +
					"%d LVL%n".formatted(finalLvl);
		}
		return "Race : %s%n".formatted(monsterRace) +
				"%d PV%n".formatted(finalHp) 		+
				"%d ATK%n".formatted(finalAtk) 		+
				"%d DEF%n".formatted(finalDef) 		+
				"%d LVL%n".formatted(finalLvl);	
	}
}
