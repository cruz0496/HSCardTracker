package com.hs.cruzstone.card;

public enum CardType {

    MINION_CARD("Minion Card"),
    SPELL_CARD("Spell Card"),
    WEAPON_CARD("Weapon Card"),
    LOCATION_CARD("Location Card"),
    HERO_CARD("Hero Card"),



    private String prettyName;

    CardType(String prettyName) {
        this.prettyName = prettyName;
    }
    CardType(){}
}
