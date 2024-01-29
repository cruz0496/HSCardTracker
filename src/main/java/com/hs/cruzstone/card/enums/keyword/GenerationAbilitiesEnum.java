package com.hs.cruzstone.card.enums.keyword;

import org.apache.catalina.users.GenericRole;

/**
 * These abilities are specific to several cards that generate minions.
 */
public enum GenerationAbilitiesEnum {

  DEATH_KNIGHT("Death Knight", "Cards summoned by the Lich King and Arfus. They have their own class."),
  JADE_GOLDEM("Jade Golem", "Each Jade Golem summoned during a game has +1/+1 more than the previous one."),
  LACKEY("Lackey", "1 mana 1/1 minion with Battlecry."),
  PIECE_OF_CTHUN("Piece of C’Thun", "Playing four Pieces of C’Thun will shuffle C’Thun, the Shattered into the player’s deck."),
  SPARE_PART("Spare Part", "One-mana spells with minor benefits.");

  private String prettyName;
  private String description;
  GenerationAbilitiesEnum(String prettyName, String description){}
  GenerationAbilitiesEnum(){}
}
