package com.academy;

public class LeonAuto implements Auto{
    private static final int DEFAULT_BONUS = 4;

    private final int bonus;

    public LeonAuto() {
        this(DEFAULT_BONUS);
    }

    public LeonAuto(final int bonus) {
        this.bonus = bonus;
    }

    @Override
    public int fahreRunde() {
        return RandomService.rangeInclusive(1, 4) + bonus;
    }

    public int getBonus(){
        return bonus;
    }
}
