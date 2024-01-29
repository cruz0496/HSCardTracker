package com.hs.cruzstone.card.enums.keyword;

/**
 * These abilities don’t have specific keywords attached to them. They are common effects and abilities found on cards.
 */
public enum OtherAbilitiesEnum {

  CANT_ATTACK("Can't Attack", "Prevents a minion from attacking."),
  CANT_ATTACK_HEROES("Can't Attack Heroes", "Prevents a minion from attacking heroes."),
  CARD_DRAW_EFFECT("Card Draw Effect", "Causes the player to draw cards from their deck."),
  CAST_SPELL("Cast Spell", "Casts a spell on behalf of the controlling player."),
  COPY("Copy", "Copies an existing card."),
  DEALS_DAMAGE("Deals Damage", "Deals damage to a character."),
  DESTROY("Destroy", "Destroys a minion, weapon, secret, or hero without dealing damage to it."),
  DISABLE_HERO_POWER("Disable Hero Power", "Causes both players to be unable to use their Hero Power."),
  DISCARD("Discard", "Causes the player to discard from their hand."),
  ELUSIVE("Elusive", "Elusive minions can’t be targeted by spells or Hero Powers."),
  ENCHANT("Enchant", "Modifies the statistics or card text of one or more cards. May be temporary, permanent, or ongoing."),
  ENRAGE("Enrage", "When damaged, this minion gains the Enraged effect."),
  EQUIP("Equip", "Equips the hero with a weapon."),
  FORCE_ATTACK("Force Attack", "Forces a character to attack."),
  FORGETFUL("Forgetful","Forgetful minions have a 50% chance of attacking the wrong enemy."),
  GAIN_ARMOR("Gain Armor", "The controlling hero gains Armor."),
  GENERATE("Generate", "Generates a new card and places it in the player’s hand."),
  HIGHLANDER("Highlander", "Take effect when a deck has no duplicates."),
  INCREMENT_ATTRIBUTE("Increment Attribute", "Adds or subtracts a value from something’s Attack, Health, Cost, or Durability."),
  JOUST("Joust", "Reveals a random card from each player’s deck. If the player who initiated " +
      "the Joust produces a card with a higher mana cost, they win the Joust, activating a secondary effect. Both cards are then shuffled back into their respective decks."),
  MIND_CONTROL_EFFECT("Mind Control Effect", "Transfers ownership of the targeted minion."),
  MODIFY_COST("Modify Cost", "Alters the mana cost of another card or Hero Power."),
  MULTIPLY_ATTRIBUTE("Multiple Attribute", "Multiplies something’s Attack, Health, or Cost by some value."),
  NO_DURABILITY_LOSS("No Durability Loss", "The possessing hero’s weapon does not lose any Durability during their turn."),
  PERMANENT("Permanent", "Permanent “minions” lack mana cost, Attack and Health, cannot be " +
      "targeted, are immune to all effects except their own, cannot be targeted by effects, and take up a space on the battlefield."),
  PLAYERBOUND("Playerbound", "Provides a permanent effect bound to the player."),
  PUT_INTO_BATTLEFIELD("Put into Battlefield", "Directly places a card from the player’s deck " +
      "or hand into the battlefield (without triggering Battlecry)."),
  PUT_INTO_HAND("Put into Hand", "Draws cards of a specific type directly from the player’s deck and places them into the player’s hand."),
  REFRESH_MANA("Refresh Mana", "Refills empty Mana Crystals."),
  REMOVE_FROM_DECK("Remove from Deck", "Removes cards directly from the player’s deck."),
  REPLACE("Replace", "Replace one card with another, without destroying or discarding the original card."),
  RESTORE_HEALTH("Restore Health", "Heals a character, increasing their Health by the stated amount."),
  RETURN("Return", "Returns the target minion to its owner’s hand."),
  SET_ATTRIBUTE("Set Attribute", "Assigns a new value for something’s Attack, Health, or Cost."),
  SHUFFLE_INTO_DECK("Shuffle into Deck", "Shuffles a card into a player’s deck."),
  SPEND_MANA("Spend Mana", "Spends mana in addition to the normal mana Cost to produce an extra effect."),
  SUMMON("Sumon", "Summons the specified minion(s). Distinct from simply playing a minion card" +
      " from the hand, this ability is found on spells and minions."),
  TRANSFORM("Transform", "Changes a minion into something, replacing the previous card."),
  TRANSFORM_IN_HAND("Transform in Hand", "At the start of the controlling player’s turn, " +
      "changes a card into something else while it is in the player’s hand."),
  UNLIMITED_ATTACKS("Unlimited Attacks", "Allows the possessing hero to attack an unlimited number of times each turn.");


  private String prettyName;
  private String description;
  OtherAbilitiesEnum(String prettyName, String description){}
  OtherAbilitiesEnum(){}
}
