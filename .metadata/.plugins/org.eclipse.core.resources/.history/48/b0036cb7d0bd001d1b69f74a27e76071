import character.Character;
import equipements.helmets.*;
import equipements.rings.*;
import inventory.Inventory;
import equipements.*;

public class Test {

	public static void main(String[] args) {
		Character c1 = new Character("Tank");
		
		c1.equipStuff(new LeatherHelmet());
		c1.equipStuff(new LordRing());
		System.out.println(c1);
		c1.showStuff();
		
		// creation of an inventory
		System.out.println("********");
		Inventory i1 = new Inventory();
		System.out.println(i1);
		
		// create and add a stuff to it
		Stuff h1 = new Helmet();
		i1.addItem(h1);
		System.out.println(i1);
	}
}
