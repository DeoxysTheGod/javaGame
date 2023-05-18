package fr.RpgGame.spell;

public class Boulottage extends Spell {

    // TODO Explain the pun (=jeu de mot)
    public Boulottage() {
        super("Boulottage", SpellType.OFFENSIVE);

        setDescription("Couic, couic... On dirait du caoutchouc !");

        setSpellDamage(3);
    }

}
