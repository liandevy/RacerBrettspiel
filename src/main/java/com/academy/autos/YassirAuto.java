package com.academy.autos;

import com.academy.RandomService;

public class YassirAuto implements Auto {

    @Override
    public int fahreRunde() {

        int wuerfel1 = RandomService.rangeInclusive(1, 4);
        int wuerfel2 = RandomService.rangeInclusive(1, 4);

        return wuerfel1 + wuerfel2;
    }
}
