package fr.RpgGame.spell;

import fr.RpgGame.state.State;

public class Spell {

    private String spellType;

    private int spellHeal;
    private int spellDamage;
    private State[] spellState;

    private String name;
    private String description;

    public Spell(String name, SpellType spellType) {
        this.name = name;
        this.spellType = spellType.type;

        description = "Les développeurs sont feignants, il va falloir attendre.";

        spellHeal = 0;
        spellDamage = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSpellType() {
        return spellType;
    }

    public void setSpellType(String spellType) {
        this.spellType = spellType;
    }

    public int getSpellHeal() {
        return spellHeal;
    }

    public void setSpellHeal(int spellHeal) {
        this.spellHeal = spellHeal;
    }

    public int getSpellDamage() {
        return spellDamage;
    }

    public void setSpellDamage(int spellDamage) {
        this.spellDamage = spellDamage;
    }

    public State[] getSpellState() {
        return spellState;
    }

    public void setSpellState(State[] spellState) {
        this.spellState = spellState;
    }
}
