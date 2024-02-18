/*
* All rights reserved by Austin McGowan, Isai Cruz, and the other brother.
* This started as a silly project no one would ever see so this license shouldn't matter.
*
* Copyright 2024
*/
package com.hs.cruzstone.card.spell;

public enum SpellSchoolEnum {
    ARCANE("Arcane"),
    HOLY("Holy"),
    SHADOW("Shadow"),
    FEL("Fel"),
    NATURE("Nature"),
    FIRE("Fire"),
    FROST("Frost");

    private String prettyName;

    SpellSchoolEnum(String prettyName) {
        this.prettyName = prettyName;
    }

    SpellSchoolEnum() {}
}
