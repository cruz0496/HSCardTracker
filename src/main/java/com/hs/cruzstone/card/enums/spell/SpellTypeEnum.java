package com.hs.cruzstone.card.enums.spell;

public enum SpellTypeEnum {

  ARCANE("Arcane"),
  HOLY("Holy"),
  SHADOW("Shadow"),
  FEL("Fel"),
  NATURE("Nature"),
  FIRE("Fire"),
  FROST("Frost");

  private String prettyName;

  SpellTypeEnum(String prettyName) {
    this.prettyName = prettyName;
  }

  SpellTypeEnum(){}
}
