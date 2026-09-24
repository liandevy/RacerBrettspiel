package com.academy;

public class DummesRacerAuto implements Auto {
    private static final int DEFAULT_BONUS = 1;

    private final int bonus;

    /**
     * Creates Car with default bonus value.
     */
    public DummesRacerAuto() {
        this(DEFAULT_BONUS);
    }

    /**
     * Creates Car with given bonus value.
     */
    public DummesRacerAuto(final int bonus) {
        this.bonus = bonus;
    }

    @Override
    public int fahreRunde() {
        return RandomService.rangeInclusive(1, 6) + bonus;
    }
}
