package com.tanriverdi.model;

import java.time.LocalDate;
import java.util.List;

public class Character {
    private final String nickname;
    private final CharacterClass characterClass;
    private final List<CharacterSkill> characterSkills;
    private final LocalDate createdDate;

    public Character(String nickname, CharacterClass characterClass, List<CharacterSkill> characterSkills, LocalDate createdDate) {
        this.nickname = nickname;
        this.characterClass = characterClass;
        this.characterSkills = characterSkills;
        this.createdDate = createdDate;
    }

    public String getNickname() {
        return nickname;
    }

    public CharacterClass getCharacterClass() {
        return characterClass;
    }

    public List<CharacterSkill> getCharacterSkills() {
        return characterSkills;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }
}
