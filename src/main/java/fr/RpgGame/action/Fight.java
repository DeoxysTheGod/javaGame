package fr.RpgGame.action;

import fr.RpgGame.entity.alive.character.Character;
import fr.RpgGame.entity.alive.character.playableCharacter.PlayableCharacter;
import fr.RpgGame.interfaces.PlayerInput;

import static java.lang.Thread.sleep;

public class Fight {

    private final PlayableCharacter player;
    private final Character enemy;

    private int round;

    public Fight(PlayableCharacter player, Character enemy) {
        this.player = player;
        this.enemy = enemy;
        round = 1;
    }

    // Setter
    public void setRound(int round) {
        this.round = round;
    }

    /**
     * this method create a fight place
     */
    public void fight() throws InterruptedException { //TODO the enemy attack according to a behavior predefined by its class
        int choice1;
        int choice2;
        while (player.getVarHp() > 0 && enemy.getVarHp() > 0) {
            // display ATH
            PlayerInput.clear();
            System.out.println(player.getName() + " - " + player.getVarHp() + "/" + player.getHp());
            System.out.println(enemy.getName() + " - " + enemy.getVarHp() + "/" + enemy.getHp());
            System.out.println(PlayerInput.separator);

            player.getSpellListToString(); // get the name of the spells of the player
            choice1 = PlayerInput.choice("Quel sort voulez vous faire ? :", player.getSpellStringList());
            choice2 = PlayerInput.choice("Qui est la cible ? :", new String[]{player.getName(), enemy.getName()});
            if (choice2 == 0) {
                player.doABattleAction(player, choice1);
            } else {
                player.doABattleAction(enemy, choice1);
            }
            sleep(2000); // Wait 2s
        }
        if (player.getVarHp() <= 0) {
            System.out.println("Vous avez perdu !");
        } else {
            System.out.println("Vous avez gagné !");
            int earnedXp = enemy.getLvl()*12; // this is not the final formula
            player.giveXp(earnedXp);
        }
        sleep(1000); // Wait 1s
    }
}
