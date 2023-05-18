package fr.RpgGame.entity.inert.item.consumable;

import fr.RpgGame.entity.inert.item.Item;

public class Consumable extends Item {

    private int heal;

    public Consumable() {
    	super();
    }

    public int getHeal() {
        return heal;
    }

    public void setHeal(int heal) {
        this.heal = heal;
    }

    public String toString() {
        return super.toString();
    }
}