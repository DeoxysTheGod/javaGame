package character;

import stat.BaseStat;
import classes.*;
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
	private Helmet helmet;
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
		this.helmet = new Helmet();
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
		this.finalHp   = this.baseHp   + helmet.getHp()   + ring.getHp()   ;
		this.finalAtk  = this.baseAtk  + helmet.getAtk()  + ring.getAtk()  ;
		this.finalDef  = this.baseDef  + helmet.getDef()  + ring.getDef()  ;
		this.finalCc   = this.baseCc   + helmet.getCc()   + ring.getCc()   ;
		this.finalLuck = this.baseLuck + helmet.getLuck() + ring.getLuck() ;
	}
	
	// Setter and Unsetter
	
	public void equipHelmet(Helmet helmet) {
		this.helmet = helmet;
		updateStat();
	}
	
	public void disequipHelmet() {
		this.helmet = new Helmet();
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
