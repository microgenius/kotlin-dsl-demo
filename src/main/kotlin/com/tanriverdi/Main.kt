package com.tanriverdi

import com.tanriverdi.extensions.August
import com.tanriverdi.extensions.DateContext
import com.tanriverdi.model.Character
import com.tanriverdi.model.CharacterBuilder
import com.tanriverdi.model.CharacterClass.CharacterClassType
import com.tanriverdi.model.CharacterClassBuilder
import com.tanriverdi.model.CharacterSkill
import com.tanriverdi.model.CharacterSkillBuilder

fun main() {
    val character = character {
        nickname = "DumDum"

        characterClass {
            type = CharacterClassType.BARBARIAN
        }

        skills {
            skill {
                name = "Sword"
                level = 7
            }

            skill {
                name = "Shield"
                level = 5
            }

            skill {
                name = "Axe"
                level = 10
            }
        }

        createdDate = 12 August 2023
    }

    println("Created character is: ${character.toStr()}")
}

fun Character.toStr(): String {
    return "${this.nickname} - ${this.characterClass.type} - ${this.createdDate}"
}

fun CharacterBuilder.characterClass(block: CharacterClassBuilder.() -> Unit) {
    characterClass = CharacterClassBuilder().apply(block).build()
}

fun CharacterBuilder.skills(block: SKILLS.() -> Unit) {
    if (this.characterSkills == null) {
        this.characterSkills = ArrayList()
    }

    this.characterSkills.addAll(SKILLS().apply(block))
}

fun character(block: context(DateContext) CharacterBuilder.() -> Unit): Character {
    val builder = CharacterBuilder()
    with(DateContext) {
        block(builder)
    }
    return builder.build()
}

class SKILLS : ArrayList<CharacterSkill>() {
    fun skill(block: CharacterSkillBuilder.() -> Unit) {
        add(CharacterSkillBuilder().apply(block).build())
    }
}