/*
* All rights reserved by Austin McGowan, Isai Cruz, and the other brother.
* This started as a silly project no one would ever see so this license shouldn't matter.
*
* Copyright 2024
*/
package com.hs.cruzstone.card;

public enum RarityEnum {
    COMMON("Common"),
    RARE("Rare"),
    EPIC("Epic"),
    LEGENDARY("Legendary");

    private String prettyName;

    RarityEnum(String prettyName) {
        this.prettyName = prettyName;
    }

    RarityEnum() {}
}
