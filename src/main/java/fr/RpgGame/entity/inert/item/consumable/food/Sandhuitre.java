package fr.RpgGame.entity.inert.item.consumable.food;

public class Sandhuitre extends Food {

    public Sandhuitre() {
        setName("Sand'Huître");
        setDescription("C'est une idée originale d'un grand chef mais je ne suis pas sûr de pouvoir le finir");
        setHeal(15);
    }

    @Override
    public String toString() {
        return super.toString()
                + "soin : " + getHeal() + " PV";
    }
}
