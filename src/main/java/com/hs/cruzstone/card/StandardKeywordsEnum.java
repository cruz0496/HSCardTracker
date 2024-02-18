/*
* All rights reserved by Austin McGowan, Isai Cruz, and the other brother.
* This started as a silly project no one would ever see so this license shouldn't matter.
*
* Copyright 2024
*/
package com.hs.cruzstone.card;

/**
 * These are the standard keywords found on most cards.
 */
public enum StandardKeywordsEnum {
    BATTLECRY("Battlecry", "Does something when you play it from your hand."),
    CHOOSE_ONE("Choose One", ""),
    COMBO("Combo", "A bonus if you already played a card this turn."),
    DEATH_RATTLE("Deathrattle", "This effect is triggered when the minion dies."),
    DISCOVER("Discover", "Choose one of three random class cards."),
    DIVINE_SHIELD("Divine Shield", "Absorbs the next source of damage and is then removed."),
    FREEZE("Freeze", "Freezes a character. Frozen characters can’t attack or block for a turn."),
    LIFESTEAL("Lifesteal", "Damage dealt by this card restores Health to the controlling hero."),
    POISONOUS("Poisonous", "A minion damaged by a Poisonous minion is destroyed."),
    OUTCAST("Outcast", "Triggers an effect if the card is the right-most or left-most card in your hand."),
    OVERLOAD("Overload", "Reduces your Mana Crystals on the next turn by the amount specified on the card."),
    RUSH("Rush", "A minion with Rush can attack enemy minions as soon as summoned."),
    SECRET(
            "Secret",
            "After you play a Secret spell card, it remains hidden until something "
                    + "activates its trigger condition, revealing it and triggering its effect."),
    SILENCE("Silence", "Removes all card text, enchantments, and abilities from the targeted minion."),
    STEALTH(
            "Stealth",
            "Until they attack or deal damage, minions with Stealth may not be "
                    + "directly targeted by enemy attacks, spells, or abilities. Stealth is removed after attacking or dealing damage."),
    SPELL_DAMAGE("Spell Damage", "Increases the damage of your spells by the amount specified on the card."),
    TAUNT("Taunt", "Enemies must attack minions with Taunt before they can attack any non-Taunt characters."),
    WINDFURY("Windfury", "The player can attack twice each turn.");

    private String prettyName;
    private String description;

    StandardKeywordsEnum(String prettyName, String description) {}

    StandardKeywordsEnum() {}
}
