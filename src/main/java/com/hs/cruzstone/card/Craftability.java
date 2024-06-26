package com.hs.cruzstone.card;

import lombok.Data;

@Data
public class Craftability {

    private int dustFromDisenchant;
    private int dustFromDisenchantGolden;
    private int dustCostToCraft;
    private int dustCostToCraftGolden;
    private boolean isCraftable;

}
