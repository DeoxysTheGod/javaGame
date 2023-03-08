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
		c1.addItemToInventory(new LordRing());
		c1.addItemToInventory(new LeatherHelmet());
		c1.addItemToInventory(new LordRing());
		System.out.println(c1.getInventory());
		System.out.println("*********");
		System.out.println(c1.getItemFromInventory(1));
		System.out.println(c1.getStockageOfInventory());
		
	}
}
