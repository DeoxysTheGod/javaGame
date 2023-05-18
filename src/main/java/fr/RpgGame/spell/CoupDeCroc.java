package fr.RpgGame.spell;

public class CoupDeCroc extends Spell{

    public CoupDeCroc() {
        super("Coup de croc", SpellType.OFFENSIVE);

        setDescription("Miam miam, tu seras mon repas de la semaine !");

        setSpellDamage(5);
    }
}
