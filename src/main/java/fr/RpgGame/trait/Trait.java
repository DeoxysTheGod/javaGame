package fr.RpgGame.trait;

import fr.RpgGame.statistique.Statistiques;

public class Trait implements Statistiques {
	
	private int hp;
	private int atk;
	private int def;
	private int cc;
	private int luck;
	
    public Trait(int hp, int atk, int def, int cc, int luck) {
    	this.hp   = hp  ;
    	this.atk  = atk ;
    	this.def  = def ;
    	this.cc   = cc  ;
    	this.luck = luck;
    }

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
    
}