package fr.RpgGame.entity.alive.character.enemy.mob;

import fr.RpgGame.spell.Boulottage;

import java.util.Random;

public class RatTiboise extends Mob {

    public RatTiboise() {
        super();
        setName("Rat Tiboisé");

        setHp(20);
        setAtk(7);
        setDef(5);
        setCc(3);

        Random rand = new Random();
        setLvl(rand.nextInt(5,7));

        addSpell(new Boulottage());
    }
}
