import character.Character;
import equipements.helmets.*;
import equipements.rings.*;
import inventory.Inventory;
import equipements.*;

public class Test {

	public static void main(String[] args) {
		Character c1 = new Character("Tank");
		
		// creation of an inventory
		System.out.println("********");
		c1.addItemToInventory(new LordRing());
		c1.addItemToInventory(new LeatherHelmet());
		c1.addItemToInventory(new LordRing());
		System.out.println(c1.getInventory());
		System.out.println(c1.getStockageOfInventory());
		System.out.println("*********");
		System.out.println(c1.getItemInfoFromInventory(1));
		
		System.out.println("**********");
		c1.equipStuff(1);
		System.out.println(c1);
		System.out.println(c1.getInventory());
		
		System.out.println("**********");
		c1.equipStuff(1);
		System.out.println(c1);
		System.out.println(c1.getInventory());
		
		System.out.println("**********");
		c1.disequipStuff(c1.getHelmet());
		System.out.println(c1);
		System.out.println(c1.getInventory());
		
		/* ceci ne fonctionne pas à cause du getStuff je changerai plutard
		System.out.println("**********");
		c1.getStuff();
		*/
	}
}
