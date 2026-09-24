package com.academy;

public class SteventAuto implements Auto {
    private static final int MIN_BEWEGUNG = 3;
    private static final int MAX_BEWEGUNG = 8;

    @Override
    public int fahreRunde() {
        return RandomService.rangeInclusive(MIN_BEWEGUNG, MAX_BEWEGUNG);
    }
}