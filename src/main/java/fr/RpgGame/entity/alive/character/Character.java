package fr.RpgGame.entity.alive.character;

import fr.RpgGame.entity.alive.Alive;
import fr.RpgGame.spell.CoupDeCroc;
import fr.RpgGame.statistique.Statistiques;

import fr.RpgGame.spell.*;
import fr.RpgGame.state.*;

import java.util.ArrayList;

/**
 * @author Quentin
 */
public abstract class Character extends Alive implements Statistiques {

    // Statistiques de base
    private int hp;
    private int atk;
    private int def;
    private int cc;
    private int luck;

    // Statistiques modifiables
    private int varHp;
    private int varAtk;
    private int varDef;
    private int varCc;
    private int varLuck;

    private double res;
    private double puissance;

    // Etat
    private ArrayList<State> stateList;

    /// Sort

    private ArrayList<Spell> spellList;

    // Statistiques de niveau
    private int lvl;

    public Character() {
        spellList = new ArrayList<>();
        stateList = new ArrayList<>();
    }

    // Getter
    public int getLvl() {
        return lvl;
    }

    public int getHp() {
        return hp;
    }

    public int getAtk() {
        return atk;
    }

    public int getDef() {
        return def;
    }

    public int getCc() {
        return cc;
    }

    public int getLuck() {
        return luck;
    }

    public int getVarHp() {
        return varHp;
    }

    public int getVarAtk() {
        return varAtk;
    }

    public int getVarDef() {
        return varDef;
    }

    public int getVarCc() {
        return varCc;
    }

    public int getVarLuck() {
        return varLuck;
    }

    /**
     * Calulation of the pourcentage of resistance to an attack
     * @return the pourcent of resistance (value beetween 0 and 1)
     */
    public double getRes() {
        return 1 - Math.pow(0.8, getVarDef() / 100.f);
    }

    /**
     * Calculation of the pourcentage of attack
     * @return the pourcent of resistance (value beetween 0 and 1)
     */
    public double getPuissance() {
        return 1 + getVarAtk() / 100.f;
    }

    /**
     * This method extract the spell corresponding to the index passed as a parameter
     * @param index index of the spell to extract
     * @return the spell as an object belonging to the Spell class
     */
    public Spell getSpell(int index) {
        return spellList.get(index);
    }

    public ArrayList<Spell> getSpellList() {
        return spellList;
    }

    public String[] getSpellStringList() {
        String[] list = new String[spellList.size()];
        for (int i = 0; i < spellList.size(); i++) {
            list[i] = spellList.get(i).getName();
        }
        return list;
    }

    /**
     * This method show the spell info corresponding to the index passed as a parameter
     * @param index index of the spell to extract
     * @return the name of the chosen spell
     */
    public String getSpellInfo(int index) {
        return spellList.get(index).toString();
    }

    /**
     * This method show the name of all the spell that the character know
     * @return a string which contain all the name of the spell of the character
     */
    public String getSpellListToString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < spellList.size() - 1; i++) {
            sb.append(spellList.get(i).getName() + "\n");
        }
        sb.append(spellList.get(spellList.size() - 1));
        return sb.toString();
    }

    // Setter
    public void setHp(int hp) {
        this.hp = hp;
        setVarHp(hp);
    }

    public void setAtk(int atk) {
        this.atk = atk;
        setVarAtk(atk);
    }

    public void setDef(int def) {
        this.def = def;
        setVarDef(def);
    }

    public void setCc(int cc) {
        this.cc = cc;
        setVarCc(cc);
    }

    public void setLuck(int luck) {
        this.luck = luck;
        setVarLuck(luck);
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public void setVarHp(int varHp) {
        this.varHp = varHp;
    }

    public void takeDamage(int damage) {
        varHp -= damage;
        if (varHp < 0) {
            varHp = 0;
        }
    }

    public void heal(int heal) {
        varHp += heal;
        if (varHp > hp) {
            varHp = hp;
        }
    }

    public void setVarAtk(int varAtk) {
        this.varAtk = varAtk;
    }

    public void setVarDef(int varDef) {
        this.varDef = varDef;
    }

    public void setVarCc(int varCc) {
        this.varCc = varCc;
    }

    public void setVarLuck(int varLuck) {
        this.varLuck = varLuck;
    }

    public void setRes(double res) {
        this.res = res;
    }

    public void setPuissance(double puissance) {
        this.puissance = puissance;
    }

    /**
     * This method add the spell passed as a parameter in the spell list
     * @param spell that needs to be added
     */
    public void addSpell(Spell spell) {
        spellList.add(spell);
    }

    /**
     * This method do a battle action (attack, heal etc..), has a specific character
     * with a specific spell
     * @param target a character
     * @param spellIndex the spell index in the character's spell list
     */
    public void doABattleAction(Character target, int spellIndex) {

        // Store the spell with the index number
        Spell usedSpell = getSpell(spellIndex);

        // If the type of the spell is offensive
        if (usedSpell.getSpellType().equals(SpellType.OFFENSIVE.getType())) {

            // Calculation of the damage inflicted according to the spell
            int damage = CalculationFormula.calcDamage(this, usedSpell, target);

            // Remove the damage to hp and print who did what to who
            target.takeDamage(damage);
            System.out.printf("\"%s\" utilise \"%s\" sur \"%s\" et inflige %d dégats à \"%s\"%n",
                    this.getName(), usedSpell.getName(), target.getName(), damage, target.getName());

        // Same logic but for a healing spell
        } else if (usedSpell.getSpellType().equals(SpellType.HEAL.getType())) {

            int heal = usedSpell.getSpellHeal();

            int amountOfHeal = (target.getHp() >= target.getVarHp() + usedSpell.getSpellHeal() ?
                    usedSpell.getSpellHeal() : target.getHp() - target.getVarHp());

            target.heal(heal);
            System.out.printf("\"%s\" utilise \"%s\" sur \"%s\" et soigne %d PV à \"%s\"%n",
                    this.getName(), usedSpell.getName(), target.getName(), amountOfHeal, target.getName());

        }
    }

    public String showStats() {
        StringBuilder sb = new StringBuilder();
        sb.append("%-4d PV / %-4d PV%n".formatted(getVarHp(), getHp())
                + "%-4d ATK%n".formatted(getVarAtk())
                + "%-4d DEF%n".formatted(getVarDef())
                + "%-4d CC".formatted((getVarCc())));
        return sb.toString();
    }

    public String toString() {
        return getName() + "\n" +
                "----------------------------\n" +
                showStats();
    }
}