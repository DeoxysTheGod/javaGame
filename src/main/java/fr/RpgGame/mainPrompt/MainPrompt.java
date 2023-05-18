package fr.RpgGame.mainPrompt;


import fr.RpgGame.action.Fight;
// Character
import fr.RpgGame.entity.alive.character.enemy.mob.RatTiboise;
import fr.RpgGame.entity.alive.character.playableCharacter.PlayableCharacter;

import fr.RpgGame.spell.*;
import fr.RpgGame.trait.*;

// import of interfaces
import fr.RpgGame.interfaces.*;

/**
 * this class display the game in the prompt
 */
import static java.lang.Thread.sleep;

public class MainPrompt {

    public static void main(String[] args) throws InterruptedException {
        String answerString;
        PlayableCharacter player;
        // Game Start
        int answerInt;
        System.out.print("Bienvenue dans *Nom du jeu*\n" + PlayerInput.separator);
        System.out.println("Vous devez créer un personnage.");
        answerString = PlayerInput.getAString("Choisissez votre nom : ");
        System.out.print(PlayerInput.separator);
        PlayerInput.clear();

        answerInt = PlayerInput.choice("Choisissez une classe :", new String[] {"Berzerker", "Mage", "Voleur", "Tank", "Guerrier"});
        switch (answerInt) {
            case 0:
                player = new PlayableCharacter(answerString, new Berzerker());
                break;
            case 1:
                player = new PlayableCharacter(answerString, new Mage());
                break;
            case 2:
                player = new PlayableCharacter(answerString, new Robber());
                break;
            case 3:
                player = new PlayableCharacter(answerString, new Tank());
                break;
            case 4:
                player = new PlayableCharacter(answerString, new Warrior());
                break;
            default:
                player = new PlayableCharacter(answerString, new Berzerker());
                break;
        }
        System.out.println("Voici votre personnage : ");
        System.out.print(player.toString() + PlayerInput.separator);
        sleep(2000);
        PlayerInput.clear();
        if (player.getName().equals("Akihiko Kayaba")) {
            player.addSpell(new GesteDestructeur());
        }

        System.out.print("Un combat commence\n");
        new Fight(player, new RatTiboise()).fight();

        PlayerInput.clear();
        System.out.println(player.showStats());
        sleep(2000);
        PlayerInput.clear();

        new Fight(player, new RatTiboise()).fight();
        PlayerInput.clear();
        System.out.println(player.showStats());

    }

}
