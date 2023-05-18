package fr.RpgGame.spell;

public enum SpellType {
    HEAL ("Soin"),
    OFFENSIVE("Offensif"),
    DEFENSIVE ("Defensif"),
    SUPPORT ("Support"),
    MIXED ("Mixte");

    final String type;

    private SpellType(String str) {
        type = str;
    }

    public String getType() {
        return type;
    }
}
