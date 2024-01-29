/*
* All rights reserved by Austin McGowan, Isai Cruz, and the other brother.
* This started as a silly project no one would ever see so this license shouldn't matter.
*
* Copyright 2024
*/
package com.hs.cruzstone.card;

import com.hs.cruzstone.card.enums.hero.HeroTypeEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "card")
class CardEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int internalCardId;

    private HeroTypeEnum heroTypeEnum;
    private int mana;
}
