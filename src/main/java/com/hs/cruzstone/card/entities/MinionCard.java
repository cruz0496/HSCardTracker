/*
* All rights reserved by Austin McGowan, Isai Cruz, and the other brother.
* This started as a silly project no one would ever see so this license shouldn't matter.
*
* Copyright 2024
*/
package com.hs.cruzstone.card.entities;

import com.hs.cruzstone.card.Card;
import com.hs.cruzstone.card.CardAbility;
import com.hs.cruzstone.card.RarityEnum;
import com.hs.cruzstone.card.StandardKeywordsEnum;
import jakarta.persistence.Entity;
import java.util.Collections;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MinionCard extends Card {

    private int attack;
    private int health;
    private List<CardAbility> cardAbilityList;

    public static void main(String[] args) {
        MinionCard minionCard = new MinionCard(6, 6,
            Collections.singletonList(new CardAbility(StandardKeywordsEnum.BATTLECRY, "Deal 6 damage randomly split " +
                "among other minions")), "Loose Specimen", RarityEnum.EPIC, 5, "Battlecry: Deal 6 damage randomly " +
            "split among " +
            "other minions", "Bob");
    }

    public MinionCard(int attack, int health, List<CardAbility> cardAbilityList, String name, RarityEnum rarityEnum,
        int manaCost, String cardText, String artistName) {

        super(name, rarityEnum, manaCost, cardText, artistName, "minion");
        this.attack = attack;
        this.health = health;
        this.cardAbilityList = cardAbilityList;
    }
}
