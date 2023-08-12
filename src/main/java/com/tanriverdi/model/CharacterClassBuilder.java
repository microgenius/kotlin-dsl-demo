package com.tanriverdi.model;

import static com.tanriverdi.model.CharacterClass.*;

public class CharacterClassBuilder {
    private CharacterClassType type;

    public CharacterClassType getType() {
        return type;
    }

    public void setType(CharacterClassType type) {
        this.type = type;
    }

    public CharacterClass build() {
        return new CharacterClass(type);
    }
}
