package fr.RpgGame.entity.inert.item.stuff.armor.amulet;

public class AmuletteDeCorde extends Amulet {

    public AmuletteDeCorde() {
        setName("Collier de corde");
        setDescription("C'est un collier en corde de mauvaise facture.\n" +
                        "Mais je pense qu'il peut faire l'affaire... \n" +
                        "Au moins pendant quelques temps... J'espère...");
        setHp(3);
        setAtk(2);
        setDef(2);
    }

    public String toString() {
        return super.toString() + "%-4d PV%n".formatted(getHp()) + "%-4d ATK%n".formatted(getAtk()) + "%-4d DEF%n".formatted(getDef());
    }

}
