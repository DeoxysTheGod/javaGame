package fr.RpgGame.entity.inert.chest;

import fr.RpgGame.entity.inert.Inert;
import fr.RpgGame.inventory.Inventory;

public class Chest extends Inert {

	private Inventory inventory;
	
    public Chest() {
    	super();
    	inventory = new Inventory();
    }

}