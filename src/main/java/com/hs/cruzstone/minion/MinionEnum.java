/*
* All rights reserved by Austin McGowan, Isai Cruz, and the other brother.
* This started as a silly project no one would ever see so this license shouldn't matter.
*
* Copyright 2024
*/
package com.hs.cruzstone.minion;

import jakarta.validation.constraints.Min;

public enum MinionEnum {
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

  public String getPrettyName() {
    return prettyName;
  }

  MinionEnum(){}



  MinionEnum(String prettyName) {
    this.prettyName = prettyName;
  }
}
