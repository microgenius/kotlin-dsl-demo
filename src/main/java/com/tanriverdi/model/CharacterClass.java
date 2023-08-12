package com.tanriverdi.model;

public class CharacterClass {
    private final CharacterClassType type;

    public CharacterClass(CharacterClassType type) {
        this.type = type;
    }

    public CharacterClassType getType() {
        return type;
    }

    public enum CharacterClassType {
        ROGUE,
        WARRIOR,
        MAGE,
        PRIEST,
        WARLOCK,
        BARD,
        RANGER,
        DRUID,
        PALADIN,
        BARBARIAN,
    }
}