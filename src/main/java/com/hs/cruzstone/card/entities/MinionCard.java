package com.hs.cruzstone.card.entities;

import com.hs.cruzstone.card.Card;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class MinionCard extends Card {

    private int attack;
    private int health;
}
