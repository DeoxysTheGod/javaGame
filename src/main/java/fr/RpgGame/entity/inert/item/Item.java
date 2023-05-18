package fr.RpgGame.entity.inert.item;

import fr.RpgGame.entity.inert.Inert;

public class Item extends Inert {

	private String description;
	
    public Item() {
    	super();
    	description = "None";
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
    	return getName() + "\n" +
    			"---------------------------------------------------------\n" +
    			getDescription() +
    			"\n---------------------------------------------------------\n";
    }
    
}