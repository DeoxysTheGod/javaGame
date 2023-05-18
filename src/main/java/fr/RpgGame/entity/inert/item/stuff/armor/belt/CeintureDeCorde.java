package fr.RpgGame.entity.inert.item.stuff.armor.belt;

public class CeintureDeCorde extends Belt {

	public CeintureDeCorde() {
		setName("Ceinture de corde");
		setDescription("C'est simplement une corde...\nRien de plus...");
		
		setHp(2);
		setAtk(2);
		setDef(1);
	}
	
	public String toString() {
    	return super.toString() +
    			"%-4d PV%n".format(String.valueOf(getHp()))  +
    			"%-4d ATK%n".format(String.valueOf(getAtk())) +
    			"%-4d DEF%n".format(String.valueOf(getDef()));
    }
	
}
