package fr.RpgGame.spell;

public class Repos extends Spell {

    public Repos() {
        super("Repos", SpellType.HEAL);

        setDescription("Un peu de repos ne vous fera pas de mal.");

        setSpellHeal(4);
    }

}
