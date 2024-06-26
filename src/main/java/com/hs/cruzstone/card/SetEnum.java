package com.hs.cruzstone.card;

public enum SetEnum {

    CORE("Core"),
    VOYAGE_TO_THE_SUNKEN_CITY("V")

    private String prettyName;

    SetEnum(String prettyName) {
        this.prettyName = prettyName;
    }

    SetEnum(){}
}
