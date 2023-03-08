package character;

import stat.BaseStat;
import classes.*;
import equipements.*;
import equipements.helmets.*;
import equipements.rings.*;

public class Character implements BaseStat {

	private CharacterClass characterClass;
	
	// Base Stat
	private int baseHp   ;
	private int baseAtk  ;
	private int baseDef  ;
	private int baseCc   ;
	private int baseLuck ;
	
	// Equipements
	private Stuff helmet;
	private Ring ring;
	
	// Final Stat
	private int finalHp   ;
	private int finalAtk  ;
	private int finalDef  ;
	private int finalCc   ;
	private int finalLuck ;
	
	public Character(String characterClass) {
		switch(characterClass) {
		
		case "Tank":
			this.characterClass = new Tank();
			break;
			
		case "Robber":
			this.characterClass = new Robber();
			break;
			
		default:
			break;
		}
		
		// Stat
		this.baseHp   = BaseStat.hp     + this.characterClass.getBonusHp()   ;
		this.baseAtk  = BaseStat.atk    + this.characterClass.getBonusAtk()  ;
		this.baseDef  = BaseStat.def    + this.characterClass.getBonusDef()  ;
		this.baseCc   = BaseStat.cc     + this.characterClass.getBonusCc()   ;
		this.baseLuck = BaseStat.luck   + this.characterClass.getBonusLuck() ;
		
		// Equipements
		this.helmet = new NoHelmet();
		this.ring = new Ring();
		
		// Final Stat
		this.finalHp   = this.baseHp   ;
		this.finalAtk  = this.baseAtk  ;
		this.finalDef  = this.baseDef  ;
		this.finalCc   = this.baseCc   ;
		this.finalLuck = this.baseLuck ;
	}
	
	// Getter
	
	public String getHelmet() {
		return helmet.toString();
	}
	
	public String getRing() {
		return ring.toString();
	}
	
	// Update des stats après avoir équipé quelquechose
	
	public void updateStat() {
		this.finalHp   = this.baseHp   + helmet.getBonusHp()   + ring.getHp()   ;
		this.finalAtk  = this.baseAtk  + helmet.getBonusAtk()  + ring.getAtk()  ;
		this.finalDef  = this.baseDef  + helmet.getBonusDef()  + ring.getDef()  ;
		this.finalCc   = this.baseCc   + helmet.getBonusCc()   + ring.getCc()   ;
		this.finalLuck = this.baseLuck + helmet.getBonusLuck() + ring.getLuck() ;
	}
	
	// Setter and Unsetter
	
	public void equipHelmet(Stuff helmet) {
		this.helmet = helmet;
		updateStat();
	}
	
	public void disequipHelmet() {
		this.helmet = new NoHelmet();
		updateStat();
	}
	
	public void equipRing(Ring ring) {
		this.ring = ring;
		updateStat();
	}
	
	public void disequipRing() {
		this.ring = new Ring();
		updateStat();
	}
	
	// toString
	
	public String toString() {
		return "Character[characterClass=" + characterClass +
				", hp="   + finalHp   +
				", atk="  + finalAtk  +
				", def="  + finalDef  +
				", cc="   + finalCc   +
				", luck=" + finalLuck + "]";
	}
	
}
