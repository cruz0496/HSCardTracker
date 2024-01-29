package com.hs.cruzstone.card.enums.keyword;

/**
 * The following keywords only appear in specific sets or are used very sparingly.
 */
public enum OtherKeywordsEnum {

  ADAPT("Adapt", "Choose one of three possible upgrades from a list of ten."),
  CASTS_WHEN_DRAWN("Casts When Drawn", "The spell card is automatically cast for no mana when " +
      "drawn from your deck. The next card in the deck is then drawn."),
  CHARGE("Charge", "A minion with Charge can attack enemy characters as soon as summoned."),
  CHOOSE_TWICE("Choose Twice", "Allows the player to choose two options from a list."),
  CORRUPT("Corrupt", "The card gains an additional effect if the player played a more expensive card this turn."),
  COUNTER("Counter", "Counters a spell that was just cast, preventing its effects."),
  DORMANT("Dormant", "The minion becomes a Permanent until certain conditions are fulfilled."),
  ECHO("Echo", "Adds another copy of the card to the hand after it’s played. The copy " +
      "disappears at the end of the turn. Echo can be replayed indefinitely during a turn."),
  FRENZY("Frenzy", "A one-time effect that activates the first time the minion survives damage."),
  IMMUNE("Immune", "Prevents all enemy interaction with the target, including damage."),
  INSPIRE("Inspire", "An effect that activates each time the controlling hero uses their Hero Power."),
  INVOKE("Invoke", "If a version of Galakrond is in the deck, Invoke triggers his Hero Power and upgrades him."),
  MAGNETIC("Magnetic", "Playing a Magnetic minion to the left of a Mech merges the two cards " +
      "together, combining their stats and effects."),
  MEGA_WINDFURY("Mega-Windfury", "Can attack four times each turn."),
  OVERKILL("Overkill", "An effect that activates when dealing more damage to a minion than is needed to kill it."),
  PASSIVE("Passive", "Cards provide a continuous, global effect to the game via an aura."),
  QUEST("Quest", "A special type of spell card that does not take effect until certain " +
      "requirements are met, granting a reward upon completion. Quests start in the mulligan."),
  REBORN("Reborn", "The first time a minion dies, it returns to life with one Health remaining."),
  RECRUIT("Recruit", "Summons a random minion from the player’s deck."),
  SIDEQUEST("Sidequest", "A special type of spell card that grants a reward once certain " +
      "requirements are met. Sidequests do not start in the mulligan."),
  SPELLBURST("Spellburst", "A one-time effect that activates the first time the controller casts a spell."),
  START_OF_GAME("Start of Game", "An effect that activates at the start of the game."),
  TWINSPELL("Twinspell", "Casting this spell puts another copy of the card into your hand, but without the Twinspell ability.");

  private String prettyName;
  private String description;
  OtherKeywordsEnum(String prettyName, String description){}
  OtherKeywordsEnum(){}
}
