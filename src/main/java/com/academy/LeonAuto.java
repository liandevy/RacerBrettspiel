package com.academy;

public class LeonAuto implements Auto{
    private static final int DEFAULT_BONUS = 0;

    private final int bonus;

    public LeonAuto() {
        this(DEFAULT_BONUS);
    }

    public LeonAuto(final int bonus) {
        this.bonus = bonus;
    }

    @Override
    public int fahreRunde() {
        int distanz = 0;
        for(int i = 0; i < 2; i++){
            distanz += RandomService.rangeInclusive(1, 4);
        }
        return distanz + bonus;
    }
}
