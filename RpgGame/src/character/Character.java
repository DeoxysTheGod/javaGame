package character;

import stat.BaseStat;
import inventory.Inventory;
import classes.*;
import equipements.*;
import equipements.boots.*;
import equipements.chestplates.*;
import equipements.helmets.*;
import equipements.leggings.*;
import equipements.rings.*;

public class Character implements BaseStat {

	private CharacterClass characterClass;
	private Inventory inventory;
	
	// Base Stat
	private int baseHp   	   	;
	private int baseAtk  	   	;
	private int baseDef  	   	;
	private int baseCc   	   	;
	private int baseLuck 	   	;
	private int baseLvl	 	   	;
	private int baseXp	 	   	;
	private int baseAmountLvlUp	;
	
	// Equipements
	private Stuff boots		 ;
	private Stuff chestplate ;
	private Stuff helmet	 ;
	private Stuff legging	 ;
	private Stuff ring		 ;
	
	// Final Stat
	private int finalHp   ;
	private int finalAtk  ;
	private int finalDef  ;
	private int finalCc   ;
	private int finalLuck ;
	private int finalLvl  ;
	private int finalXp	  ;
	
	// Status
	private boolean dead;
		
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
		this.baseHp   		 = BaseStat.hp     + this.characterClass.getBonusHp()   ;
		this.baseAtk  		 = BaseStat.atk    + this.characterClass.getBonusAtk()  ;
		this.baseDef  		 = BaseStat.def    + this.characterClass.getBonusDef()  ;
		this.baseCc   		 = BaseStat.cc     + this.characterClass.getBonusCc()   ;
		this.baseLuck 		 = BaseStat.luck   + this.characterClass.getBonusLuck() ;
		this.baseLvl  		 = BaseStat.lvl							   			    ;
		this.baseXp   		 = BaseStat.xp											;
		this.baseAmountLvlUp = BaseStat.amountLvlUp							 		;
		
		// Equipements
		this.helmet = null;
		this.ring = null;
		
		// Final Stat
		this.finalHp   = this.baseHp   ;
		this.finalAtk  = this.baseAtk  ;
		this.finalDef  = this.baseDef  ;
		this.finalCc   = this.baseCc   ;
		this.finalLuck = this.baseLuck ;
		this.finalLvl  = this.baseLvl  ;
		this.finalXp   = this.baseXp   ;
	}
	
	// Getter
	public Stuff getBoots() {
		return boots;
	}
	public Stuff getChestplate() {
		return chestplate;
	}
	public Stuff getHelmet() {
		return helmet;
	}
	public Stuff getLegging() {
		return legging;
	}
	public Stuff getRing() {
		return ring;
	}
	
	public String getBootsInfo() {
		return boots.toString();
	}
	public String getChestplateInfo() {
		return chestplate.toString();
	}
	public String getHelmetInfo() {
		return helmet.toString();
	}
	public String getLeggingInfo() {
		return legging.toString();
	}
	public String getRingInfo() {
		return ring.toString();
	}
	
	public void getStuff() {
		System.out.println("---- Équipement ----\n");
		if (helmet != null)
			System.out.println(helmet.toString());
		if (chestplate != null)
			System.out.println(chestplate.toString());
		if (ring != null)
			System.out.println(ring.toString());
		if (legging != null)
			System.out.println(legging.toString());
		if (boots != null)
			System.out.println(boots.toString());
	}
	
	// Stats
	
	public void giveXp(int amount) {
		this.finalXp += amount;
		updateLvl();
	}
	
	public void takeXp(int amount) {
	    this.finalXp -= amount;
	    while (this.finalXp < 0) {
	        if (this.finalLvl > 0) {
	            this.finalLvl--;
	            this.finalXp += baseAmountLvlUp;
	        } else {
	            this.finalXp = 0;
	            break;
	        }
	    }
	}
	
	public void giveLvl(int amount) {
		this.finalLvl += amount;
		updateLvl();
	}
	
	public void takeLvl(int amount) {
	    int totalLvl = this.finalLvl - amount;
	    if (totalLvl < 0) {
	        this.finalLvl = 0;
	    } else {
	        this.finalLvl = totalLvl;
	    }
	}
	
	public void resetLvl() {
		this.finalLvl = 0;
	}
	
	public void resetXp() {
		this.finalXp = 0;
	}
	
	public void resetLvlXp() {
		this.finalLvl = 0;
		this.finalXp = 0;
	}
	
	public void lvlSameAs(Character c) {
		this.finalLvl = c.finalLvl;
	}
	
	public void xpSameAs(Character c) {
		this.finalXp = c.finalXp;
	}
	
	public void lvlXpSameAs(Character c) {
		this.finalLvl = c.finalLvl;
		this.finalXp = c.finalXp;
	}
	
	// Update des stats
	
	public void updateLvl() {
	    while (this.finalXp >= baseAmountLvlUp) {
	        this.finalXp -= baseAmountLvlUp;
	        this.finalLvl++;
	    }
	}
	
	// Après avoir équipé quelque chose
	
	public void updateStat() {
		
		this.finalHp   = this.baseHp   ;
		this.finalAtk  = this.baseAtk  ;
		this.finalDef  = this.baseDef  ;
		this.finalCc   = this.baseCc   ;
		this.finalLuck = this.baseLuck ;
		
		if (boots != null) {
			this.finalHp   = this.baseHp   + boots.getBonusHp()   ;
			this.finalAtk  = this.baseAtk  + boots.getBonusAtk()  ;
			this.finalDef  = this.baseDef  + boots.getBonusDef()  ;
			this.finalCc   = this.baseCc   + boots.getBonusCc()   ;
			this.finalLuck = this.baseLuck + boots.getBonusLuck() ;
		}
		if (chestplate != null) {
			this.finalHp   = this.baseHp   + chestplate.getBonusHp()   ;
			this.finalAtk  = this.baseAtk  + chestplate.getBonusAtk()  ;
			this.finalDef  = this.baseDef  + chestplate.getBonusDef()  ;
			this.finalCc   = this.baseCc   + chestplate.getBonusCc()   ;
			this.finalLuck = this.baseLuck + chestplate.getBonusLuck() ;
		}
		if (helmet != null) {
			this.finalHp   = this.baseHp   + helmet.getBonusHp()   ;
			this.finalAtk  = this.baseAtk  + helmet.getBonusAtk()  ;
			this.finalDef  = this.baseDef  + helmet.getBonusDef()  ;
			this.finalCc   = this.baseCc   + helmet.getBonusCc()   ;
			this.finalLuck = this.baseLuck + helmet.getBonusLuck() ;
		}
		if (legging != null) {
			this.finalHp   = this.baseHp   + legging.getBonusHp()   ;
			this.finalAtk  = this.baseAtk  + legging.getBonusAtk()  ;
			this.finalDef  = this.baseDef  + legging.getBonusDef()  ;
			this.finalCc   = this.baseCc   + legging.getBonusCc()   ;
			this.finalLuck = this.baseLuck + legging.getBonusLuck() ;
		}
		if (ring != null) {
			this.finalHp   = this.baseHp   + ring.getBonusHp()   ;
			this.finalAtk  = this.baseAtk  + ring.getBonusAtk()  ;
			this.finalDef  = this.baseDef  + ring.getBonusDef()  ;
			this.finalCc   = this.baseCc   + ring.getBonusCc()   ;
			this.finalLuck = this.baseLuck + ring.getBonusLuck() ;
		}
	}
	
	// Setter and Unsetter
	
	public void equipStuff(int index) {
		Stuff tmp = null;
		Stuff obj = inventory.getItem(index);

		if (obj != null) {
			if (obj instanceof Boots) {
				tmp = this.boots;
				this.boots = obj;
			}
			else if (obj instanceof Chestplates) {
				tmp = this.chestplate;
				this.chestplate = obj;
			}
			else if (obj instanceof Helmet) {
				tmp = this.helmet;
				this.helmet = obj;
			}
			else if (obj instanceof Legging) {
				tmp = this.legging;
				this.legging = obj;
			}
			else if (obj instanceof Ring) {
				tmp = this.ring;
				this.ring = obj;
			}
			inventory.removeItem(index);
			inventory.addItem(tmp);
		}
		else {
			System.out.println("Vous ne pouvez pas équipé cette objet\n");
		}
		updateStat();
	}
	
	public void disequipStuff(Stuff stuff) {
		if (stuff instanceof Boots) {
			this.boots = null;
		}
		else if (stuff instanceof Chestplates) {
			this.chestplate = null;
		}
		else if (stuff instanceof Helmet) {
			this.helmet = null;
		}
		else if (stuff instanceof Legging) {
			this.legging = null;
		}
		else if (stuff instanceof Ring) {
			this.ring = null;
		}
		inventory.addItem(stuff);
		updateStat();
	}
	
	// Inventory Management
	
	public void addItemToInventory(Stuff stuff) {
		inventory.addItem(stuff);
	}
	
	public String getItemInfoFromInventory(int index) {
		return inventory.getItemInfo(index);
	}
	
	public String getStockageOfInventory() {
		return inventory.getStockage();
	}
	
	public String getInventory() {
		return inventory.toString();
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
		opponent.finalHp -= (this.finalAtk - (this.finalAtk * opponent.finalDef / 100));
		if (opponent.finalHp <= 0) {
				opponent.dead = true;
			opponent.finalHp = 0;
		}
	}
	
	// toString
	
	public String toString() {
		if (this.isDead()) {
			return "Class : [DEAD] %s%n".formatted(characterClass) +
					"%d PV%n".formatted(finalHp) +
					"%d ATK%n".formatted(finalAtk) +
					"%d DEF%n".formatted(finalDef) +
					"%d CC%n".formatted(finalCc) +
					"%d LC%n".formatted(finalLuck) +
					"%d LVL%n".formatted(finalLvl) +
					"%d XP%n".formatted(finalXp);
		}
		
		return "Class : %s%n".formatted(characterClass) +
				"%d PV%n".formatted(finalHp) +
				"%d ATK%n".formatted(finalAtk) +
				"%d DEF%n".formatted(finalDef) +
				"%d CC%n".formatted(finalCc) +
				"%d LC%n".formatted(finalLuck) +
				"%d LVL%n".formatted(finalLvl) +
				"%d XP%n".formatted(finalXp);
		
	}
	
}
