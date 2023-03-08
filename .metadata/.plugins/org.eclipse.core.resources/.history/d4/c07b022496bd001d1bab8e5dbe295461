import character.Character;
import equipements.helmets.*;
import equipements.rings.*;

public class Test {

	public static void main(String[] args) {
		Character c1 = new Character("Tank");
		
		System.out.println("----------");
		System.out.println(c1);
		System.out.println(c1.getHelmet());
		
		// equipement d'un casque en cuir
		Helmet h1 = new LeatherHelmet();
		c1.equipHelmet(h1);
		
		System.out.println("----------");
		System.out.println(c1);
		System.out.println(c1.getHelmet());
		
		// equipement d'aucun casque
		c1.disequipHelmet();
		
		System.out.println("----------");
		System.out.println(c1);
		System.out.println(c1.getHelmet());
		
		// equipement d'un anneau du roi
		c1.equipRing(new LordRing());
		
		System.out.println("----------");
		System.out.println(c1);
		System.out.println(c1.getHelmet());
		System.out.println(c1.getRing());
		
		
	}
	
}
