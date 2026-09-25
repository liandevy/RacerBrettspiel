package com.academy.autos;

import com.academy.RandomService;

public class LianAuto implements Auto {
    private int runden = 0;

    @Override
    public int fahreRunde() {
        runden += 1;
        if (isPrime(runden))
            // Dice rolled when prime number of rounds
            return RandomService.rangeInclusive(7, 12);
        // Default dice rolled
        return RandomService.rangeInclusive(1, 6);
    }

    private boolean isPrime(final int n) {
        if (n <= 1) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
