package fr.RpgGame.spell;

public class GesteDestructeur extends Spell {

    /**
     * God mod for dev test
     */
    public GesteDestructeur() {
        super("Geste Destructeur", SpellType.OFFENSIVE);

        setDescription("Un simple geste qui enlève la vie");

        setSpellDamage(999999);
    }

}
