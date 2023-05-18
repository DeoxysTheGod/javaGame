package fr.RpgGame.entity.inert.item.consumable.potion;

public class PetitePotionDeVie extends Potion {

    public PetitePotionDeVie() {
        setName("Petite potion de vie");
        setDescription("Elle est petite... mais ce n'est pas la taille qui compte...\n" +
                        "Pas vrai ?!");

        setHeal(10);
    }

    public String toString() {
        return super.toString()
                + "soin : " + getHeal() + " PV";
    }
}
