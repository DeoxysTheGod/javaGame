package fr.RpgGame.entity.inert.item.consumable.food;

/**
 * @author Valentin
 */
public class TartineDeConfitureSansConfiture extends Food{

    public TartineDeConfitureSansConfiture() {
        setName("La tartine de confiture sans confiture");

        setDescription("C'est l'histoire d'une tartine de confiture qui tombe toujours par terre du côté de la confiture...\n" +
                "Un chef cuisto c'est dit : \"si elle tombe toujours du côté de la confiture, alors je vais créé quelque chose\"...\n" +
                "Il a réfléchit longtemps...\n" +
                "longtemps...\n" +
                "longtemps...\n" +
                "longtemps...\n" +
                "trop longtemps\n" +
                "pour créer... la tartine de confiture sans confiture !");

        setHeal(1);
    }

    @Override
    public String toString() {
        return super.toString()
                + "soin : " + getHeal() + " PV";
    }
}
