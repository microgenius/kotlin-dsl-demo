package com.tanriverdi.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CharacterBuilder {
    private String nickname;
    private CharacterClass characterClass;
    private List<CharacterSkill> characterSkills;
    private LocalDate createdDate;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public CharacterClass getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(CharacterClass characterClass) {
        this.characterClass = characterClass;
    }

    public List<CharacterSkill> getCharacterSkills() {
        return characterSkills;
    }

    public void setCharacterSkills(List<CharacterSkill> characterSkills) {
        this.characterSkills = characterSkills;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public void addCharacterSkill(CharacterSkill characterSkill) {
        if (characterSkills == null) {
            characterSkills = new ArrayList<>();
        }
        this.characterSkills.add(characterSkill);
    }

    public Character build() {
        return new Character(nickname, characterClass, characterSkills, createdDate);
    }
}
