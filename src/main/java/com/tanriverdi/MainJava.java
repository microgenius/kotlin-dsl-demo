package com.tanriverdi;

import java.time.LocalDate;

import com.tanriverdi.model.Character;
import com.tanriverdi.model.CharacterBuilder;
import com.tanriverdi.model.CharacterClassBuilder;
import com.tanriverdi.model.CharacterSkillBuilder;

import static com.tanriverdi.model.CharacterClass.*;

public class MainJava {
    public static void main(String[] args) {
        final CharacterBuilder builder = new CharacterBuilder();

        builder.setNickname("DumDum");

        final CharacterClassBuilder classBuilder = new CharacterClassBuilder();
        classBuilder.setType(CharacterClassType.BARBARIAN);
        builder.setCharacterClass(classBuilder.build());

        final CharacterSkillBuilder skillBuilder = new CharacterSkillBuilder();
        skillBuilder.setName("Sword");
        skillBuilder.setLevel(7);
        builder.addCharacterSkill(skillBuilder.build());

        skillBuilder.setName("Shield");
        skillBuilder.setLevel(5);
        builder.addCharacterSkill(skillBuilder.build());

        skillBuilder.setName("Axe");
        skillBuilder.setLevel(10);
        builder.addCharacterSkill(skillBuilder.build());

        builder.setCreatedDate(LocalDate.now());

        final Character character = builder.build();
        System.out.println("Created character is: " + character.getNickname());
    }
}
