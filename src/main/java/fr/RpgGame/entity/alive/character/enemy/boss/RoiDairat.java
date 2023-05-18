package fr.RpgGame.entity.alive.character.enemy.boss;

import fr.RpgGame.spell.*;

public class RoiDairat extends Boss{
    public RoiDairat() {
        super();
        setName("Roi Dairat"); // Jeu de mot "Roi des rats" / "Roi Dairat"

        setHp(50);
        setAtk(10);
        setDef(10);
        setCc(5);

        addSpell(new Boulottage());
        addSpell(new CoupDeCroc());
    }
}
