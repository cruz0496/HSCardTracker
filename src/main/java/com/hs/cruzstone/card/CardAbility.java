package com.hs.cruzstone.card;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CardAbility {
    private StandardKeywordsEnum standardKeywordsEnum;
    private String abilityDescription;
}
