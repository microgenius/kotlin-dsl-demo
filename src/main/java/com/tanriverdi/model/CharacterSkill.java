package com.tanriverdi.model;

public class CharacterSkill {
    private final String name;
    private final int level;

    public CharacterSkill(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }
}
