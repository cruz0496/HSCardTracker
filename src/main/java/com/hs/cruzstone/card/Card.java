/*
* All rights reserved by Austin McGowan, Isai Cruz, and the other brother.
* This started as a silly project no one would ever see so this license shouldn't matter.
*
* Copyright 2024
*/
package com.hs.cruzstone.card;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@MappedSuperclass /*This annotation tells the persistence provider that the fields (including the id field) should be treated as if they were declared in the subclass.*/
@AllArgsConstructor
@NoArgsConstructor
public abstract class Card {

    public Card(String name, RarityEnum rarityEnum, int manaCost, String cardText, String artistName) {
        this.name = name;
        this.rarityEnum = rarityEnum;
        this.manaCost = manaCost;
        this.cardText = cardText;
        this.artistName = artistName;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;
    private RarityEnum rarityEnum;
    private int manaCost;
    private String cardText;
    private String artistName;
    private CardType cardType; // TODO Make enum for card type e.g. minion/spell/etc.
    // private SetEnum set; // TODO Make Set class and enum (set name for the enum)
}
