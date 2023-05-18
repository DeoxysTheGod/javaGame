package fr.RpgGame.entity.inert.item.stuff;

import fr.RpgGame.entity.inert.item.Item;
import fr.RpgGame.statistique.Statistiques;

public abstract class Stuff extends Item implements Statistiques {

	private int hp   ;
	private int atk  ;
	private int def  ;
	private int cc   ;
	private int luck ;
	
    public Stuff() {
    	super();
    }

    // getter
    
    public int getHp() {
        return hp;
    }

    public int getAtk() {
        return atk;
    }

    public int getDef() {
        return def;
    }

    public int getCc() {
        return cc;
    }

    public int getLuck() {
        return luck;
    }
    
    // setter
    
    public void setHp(int hp) {
		this.hp = hp;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public void setLuck(int luck) {
		this.luck = luck;
	}

	public String toString() {
    	return super.toString();
    }
}