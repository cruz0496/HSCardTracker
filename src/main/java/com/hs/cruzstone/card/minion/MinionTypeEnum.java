/*
* All rights reserved by Austin McGowan, Isai Cruz, and the other brother.
* This started as a silly project no one would ever see so this license shouldn't matter.
*
* Copyright 2024
*/
package com.hs.cruzstone.card.minion;

public enum MinionTypeEnum {
    UNDEAD("Undead"),
    DEMON("Demon"),
    BEAST("Beast"),
    PIRATE("Pirate"),
    MECH("Mech"),
    ELEMENTAL("Elemental"),
    MURLOC("Murloc"),
    DRAGON("Dragon"),
    TOTEM("Totem"),
    NAGA("Naga"),
    QUILBOARD("Quilboar"),
    ALL("All");

    private String prettyName;

    MinionTypeEnum(String prettyName) {
        this.prettyName = prettyName;
    }

    MinionTypeEnum() {}

    public String getPrettyName() {
        return prettyName;
    }
}
