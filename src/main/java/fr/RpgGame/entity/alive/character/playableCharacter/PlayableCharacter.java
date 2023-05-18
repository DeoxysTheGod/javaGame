package fr.RpgGame.entity.alive.character.playableCharacter;

import fr.RpgGame.entity.alive.character.CalculationFormula;
import fr.RpgGame.entity.alive.character.Character;
import fr.RpgGame.entity.inert.item.Item;
import fr.RpgGame.entity.inert.item.consumable.Consumable;
import fr.RpgGame.entity.inert.item.stuff.Stuff;
import fr.RpgGame.inventory.Inventory;
import fr.RpgGame.spell.*;
import fr.RpgGame.trait.Trait;

public class PlayableCharacter extends Character {
    // Fonctionnalités
    private final Trait trait;
    private Inventory inventory;
    private SlotStuff stuff;

    // Statistiques de niveau
    private int xp;
    private int amountLvlUp;

    public PlayableCharacter(String name, Trait trait) {
        setName(name);

        setHp(trait.getHp());
        setAtk(trait.getAtk());
        setDef(trait.getDef());
        setCc(trait.getCc());
        setLuck(trait.getLuck());

        this.trait = trait;
        this.inventory = new Inventory();
        this.stuff = new SlotStuff();
        this.xp = 0;

        setLvl(1);
        this.amountLvlUp = CalculationFormula.getXpAmountNeeded(getLvl());

        // Sort de base
        addSpell(new CoupDePoing());
        addSpell(new Repos());
    }

    // Getter

    public int getXp() {
        return xp;
    }

    public int getAmountLvlUp() {
        return amountLvlUp;
    }

    public String getTrait() {
        return trait.toString();
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public void showStuff() {
        System.out.println(stuff);
    }

    public void equipStuff(Stuff stuff) {
        //TODO method to equip stuff
    }

    public void disequipStuff(Stuff stuff) {
        //TODO method to disequip stuff
    }

    public void useItem(Consumable item) {
        //TODO method to use a comsumable item
    }

    public void addItem(Item item) {
        //TODO method to add an item to the player's inventory
    }

    public void deleteItem(Item item) {
        //TODO method to delete an item to the player's inventory
    }

    public void updateStats() {
        //TODO method to update player' stats
    }

    public void giveXp(int xp) {
        setXp(getXp() + xp);
        updateLvl();
    }

    public void updateLvl() {
        while (xp >= amountLvlUp) {
            xp -= amountLvlUp;
            setLvl(getLvl() + 1);
            amountLvlUp = CalculationFormula.getXpAmountNeeded(getLvl());
        }
    }

    @Override
    public String showStats() {
        return super.showStats() +
                "%n%-4d Chance%n".formatted(getVarLuck()) +
                "%n%-4d Lvl%n".formatted(getLvl()) +
                "%n%d / %d%n".formatted(getXp(), getAmountLvlUp());
    }
}