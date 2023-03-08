import character.Character;
import equipements.helmets.*;
import equipements.rings.*;
import equipements.*;

public class Test {

	public static void main(String[] args) {
		Character c1 = new Character("Tank");
		
		c1.equipStuff(new LeatherHelmet());
		c1.equipStuff(new LordRing());
		System.out.println(c1);
		
	}	
}
