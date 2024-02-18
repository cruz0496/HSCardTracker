/*
* All rights reserved by Austin McGowan, Isai Cruz, and the other brother.
* This started as a silly project no one would ever see so this license shouldn't matter.
*
* Copyright 2024
*/
package com.hs.cruzstone.card;

public enum HeroTypeEnum {
    DRUID("Druid"),
    MAGE("Mage"),
    HUNTER("Hunter"),
    WARLOCK("Warlock"),
    DEATH_KNIGHT("Death Knight"),
    DEMON_HUNTER("Demon Hunter"),
    PRIEST("Priest"),
    ROGUE("Rogue"),
    PALADIN("Paladin"),
    SHAMAN("Shaman"),
    WARRIOR("Warrior");

    private String prettyName;

    HeroTypeEnum(String prettyName) {
        this.prettyName = prettyName;
    }

    HeroTypeEnum() {}

    public String getPrettyName() {
        return this.prettyName;
    }
}
