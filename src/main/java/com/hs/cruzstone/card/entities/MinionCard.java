package com.hs.cruzstone.card.entities;

import com.hs.cruzstone.card.AbstractCard;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class MinionCard extends AbstractCard {

    private int attack;
    private int health;
}
