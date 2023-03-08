package character;

import stat.BaseStat;
import inventory.Inventory;
import classes.*;
import equipements.*;
import equipements.helmets.*;
import equipements.rings.*;

public class Character implements BaseStat {

	private CharacterClass characterClass;
	private Inventory inventory;
	
	// Base Stat
	private int baseHp   ;
	private int baseAtk  ;
	private int baseDef  ;
	private int baseCc   ;
	private int baseLuck ;
	
	// Equipements
	private Stuff helmet;
	private Stuff ring;
	
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
		
		this.inventory = new Inventory();
		
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
	
	public void showStuff() {
		System.out.println("---- Inventaire ----\n");
		System.out.println(helmet.toString());
		System.out.println(ring.toString());
	}
	
	
	
	// Update des stats après avoir équipé quelquechose
	
	public void updateStat() {
		this.finalHp   = this.baseHp   + helmet.getBonusHp()   + ring.getBonusHp()   ;
		this.finalAtk  = this.baseAtk  + helmet.getBonusAtk()  + ring.getBonusAtk()  ;
		this.finalDef  = this.baseDef  + helmet.getBonusDef()  + ring.getBonusDef()  ;
		this.finalCc   = this.baseCc   + helmet.getBonusCc()   + ring.getBonusCc()   ;
		this.finalLuck = this.baseLuck + helmet.getBonusLuck() + ring.getBonusLuck() ;
	}
	
	// Setter and Unsetter
	
	public void equipStuff(Stuff stuff) {
		if (stuff instanceof Helmet) {
			this.helmet = stuff;
		}
		else if (stuff instanceof Ring) {
			this.ring = stuff;
		}
		updateStat();
	}
	
	public void disequipStuff(Stuff stuff) {
		if (stuff instanceof Helmet) {
			this.helmet = new Stuff();
		}
		else if (stuff instanceof Ring) {
			this.ring = new Stuff();
		}
		updateStat();
	}
	
	// Inventory Management
	
	public void addItemToInventory(Stuff stuff) {
		inventory.addItem(stuff);
	}
	
	public String getItemFromInventory(int index) {
		return inventory.getItem(index);
	}
	
	public String getStockageOfInventory() {
		return inventory.getStockage();
	}
	
	public String getInventory() {
		return inventory.toString();
	}
	
	// toString
	
	public String toString() {
		return "Class : %s%n".formatted(characterClass) +
				"%d PV%n".formatted(finalHp) +
				"%d ATK%n".formatted(finalAtk) +
				"%d DEF%n".formatted(finalDef) +
				"%d CC%n".formatted(finalCc) +
				"%d Chance%n".formatted(finalLuck);
	}
	
}
