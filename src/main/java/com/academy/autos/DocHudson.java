package com.academy.autos;

import com.academy.RandomService;

public class DocHudson implements Auto {
    @Override
    public int fahreRunde() {
        int zufall = RandomService.rangeInclusive(1, 11);
        return zufall;
    }
}