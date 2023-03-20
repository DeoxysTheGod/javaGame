package entity.alive.character.playableCharacter;

import java.util.*;

/**
 * @author B. Quentin
 */
public class PlayableCharacter extends Character {

    /**
     * Default constructor
     */
    public PlayableCharacter() {
    }

    /**
     * 
     */
    private Trait trait;

    /**
     * 
     */
    private Inventory inventory;

    /**
     * 
     */
    private SlotStuff stuff;

    /**
     * 
     */
    private int xp = 0;

    /**
     * @return
     */
    public String getTrait() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public int getXp() {
        // TODO implement here
        return 0;
    }

    /**
     * @param xp 
     * @return
     */
    public void setXp(int xp) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public void showStuff() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public void showStats() {
        // TODO implement here
        return null;
    }

    /**
     * @param stuff 
     * @return
     */
    public void equipStuff(Stuff stuff) {
        // TODO implement here
        return null;
    }

    /**
     * @param stuff 
     * @return
     */
    public void disequipStuff(Stuff stuff) {
        // TODO implement here
        return null;
    }

    /**
     * @param item 
     * @return
     */
    public void useItem(Consumable item) {
        // TODO implement here
        return null;
    }

    /**
     * @param item 
     * @return
     */
    public void deleteItem(Item item) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public void updateStats() {
        // TODO implement here
        return null;
    }

}