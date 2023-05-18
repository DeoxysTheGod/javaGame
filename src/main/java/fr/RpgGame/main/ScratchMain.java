package fr.RpgGame.main;

import fr.RpgGame.entity.alive.character.enemy.boss.Boss;
import fr.RpgGame.entity.alive.character.enemy.boss.RoiDairat;
import fr.RpgGame.entity.alive.character.enemy.mob.*;
import fr.RpgGame.entity.alive.character.playableCharacter.PlayableCharacter;
import fr.RpgGame.entity.inert.item.consumable.food.Sandhuitre;
import fr.RpgGame.entity.inert.item.consumable.potion.PetitePotionDeVie;
import fr.RpgGame.entity.inert.item.stuff.armor.amulet.AmuletteDeCorde;
import fr.RpgGame.entity.inert.item.stuff.armor.belt.CeintureDeCorde;
import fr.RpgGame.inventory.Inventory;
import fr.RpgGame.trait.*;

/**
 * this class is made for quick scratch test
 */
public class ScratchMain {

    public static void main(String[] args) {
        Inventory i1 = new Inventory();

        i1.addItem(new Sandhuitre());
        i1.addItem(new AmuletteDeCorde());
        i1.addItem(new PetitePotionDeVie());
        i1.addItem(new CeintureDeCorde());

        i1.removeItem(2);

        System.out.println(i1);

        i1.sortItemByName();
        System.out.println(i1);

        //System.out.println(i1.getItemInfo(2));

        PlayableCharacter j1 = new PlayableCharacter("Belzebub", new Berzerker());
        Mob m1 = new RatTiboise();

        System.out.println(m1);
        System.out.println("---");
        System.out.println(j1);
        System.out.println("\n---\n");

        m1.doABattleAction(j1, 0);

        System.out.println(j1);
        System.out.println(m1);

        j1.doABattleAction(m1, 0);

        System.out.println(j1);
        System.out.println(m1);

        j1.doABattleAction(j1, 1);

        System.out.println(j1);
        System.out.println(m1);


        System.out.println("Test patchnote 2023/04/15");

        Boss b1 = new RoiDairat();
        PlayableCharacter j2 = new PlayableCharacter("Dérastos Tizeur", new Mage());

        System.out.println(b1);
        System.out.println("---");
        System.out.println(j2);
        System.out.println("\n---\n");

        j2.doABattleAction(b1, 0);

        System.out.println(j2);
        System.out.println(b1);

        b1.doABattleAction(j2, 0);

        System.out.println(j2);
        System.out.println(b1);

        b1.doABattleAction(j2, 1);

        System.out.println(j2);
        System.out.println(b1);
    }
}
