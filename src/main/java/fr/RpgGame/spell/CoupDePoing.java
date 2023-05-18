package fr.RpgGame.spell;

public class CoupDePoing extends Spell {

    public CoupDePoing() {
        super("Coup de poing", SpellType.OFFENSIVE);

        setDescription("Le puissant guerrier rassemble toute ses forces et fait appel à la puissance des dieux !\n" +
                        "Afin de donner un grand... coup de poing... Dit comme ça, ça fait moins bien...");

        setSpellDamage(6);
    }
}
