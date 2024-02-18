package com.hs.cruzstone.card;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@Data
@MappedSuperclass /*This annotation tells the persistence provider that the fields (including the id field) should be treated as if they were declared in the subclass.*/
public abstract class Card {

    @Id
    private Long id;
    private String name;
    private RarityEnum rarityEnum;
    private int manaCost;
}
