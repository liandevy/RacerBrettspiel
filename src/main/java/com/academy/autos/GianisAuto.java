package com.academy.autos;

import com.academy.RandomService;

public class GianisAuto implements Auto {

    @Override
    public int fahreRunde() {

        int wuerfel1 = RandomService.rangeInclusive(1, 9);

        return wuerfel1;
    }
}
