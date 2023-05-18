package fr.RpgGame.entity.alive;

import fr.RpgGame.entity.Entity;

public abstract class Alive extends Entity {

	private boolean alive; // true if the entity is alive
	
    public Alive() {
    	super();
    	alive = true;
    }

    public boolean isAlive() {
        return alive;
    }

}