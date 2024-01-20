/*
* All rights reserved by Austin McGowan, Isai Cruz, and the other brother.
* This started as a silly project no one would ever see so this license shouldn't matter.
*
* Copyright 2024
*/
package com.hs.cruzstone.card;

import jakarta.persistence.*;

@Entity
@Table(name = "card")
class CardEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int internalCardId;

    private CardClass cardClass;
    private int mana;
}
