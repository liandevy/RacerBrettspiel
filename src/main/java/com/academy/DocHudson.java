package com.academy;

public class DocHudson implements Auto {
    @Override
    public int fahreRunde() {
        int zufall = RandomService.rangeInclusive(1, 12);
        return zufall;
    }
}