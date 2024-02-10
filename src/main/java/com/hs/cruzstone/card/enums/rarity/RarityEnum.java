package com.hs.cruzstone.card.enums.rarity;

public enum RarityEnum {

  COMMON("Common"),
  RARE("Rare"),
  EPIC("Epic"),
  LEGENDARY("Legendary");

  private String prettyName;

  RarityEnum(String prettyName) {
    this.prettyName = prettyName;
  }

  RarityEnum(){}
}
