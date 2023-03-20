package entity.alive.character;

import java.util.*;

/**
 * @author B. Quentin
 */
public abstract class Character extends Alive implements Statistiques {

    /**
     * Default constructor
     */
    public Character() {
    }

    /**
     * 
     */
    private int lvl;

    /**
     * @return
     */
    public int getLvl() {
        // TODO implement here
        return 0;
    }

    /**
     * @param lvl 
     * @return
     */
    public void setLvl(int lvl) {
        // TODO implement here
        return null;
    }

    /**
     * calcul des dégâts :
     * 
     * a = attaquant
     * o = opposant
     * 
     * o.Resistance = 1 - 0.8^( o.Def / 100 )
     * 
     * a.Damage = a.dgt_attaque * ( 1 + a.Atk / 100 ) * (1 - o.Resistance ) * ( 1.1 si crit )
     * @return
     */
    public int calcDamage() {
        // TODO implement here
        return 0;
    }

    /**
     * @param opponent 
     * @return
     */
    public void attack(Character opponent) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public int getHp() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public int getAtk() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public int getDef() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public int getCc() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public int getLuck() {
        // TODO implement here
        return 0;
    }

}