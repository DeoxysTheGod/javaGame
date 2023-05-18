package fr.RpgGame.entity;

/**
 * @author Quentin
 */
public abstract class Entity {

	private String name;    // name of any entity
	
    public Entity() {
    	name = "None";  // base name is None
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
}