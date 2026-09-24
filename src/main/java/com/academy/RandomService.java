package com.academy;

import java.security.SecureRandom;

public final class RandomService {
    private static final SecureRandom RANDOM = new SecureRandom();

    /**
     *
     * @param min The minimum inclusive value this method can return
     * @param max The maximum exclusive value this method can return
     * @return int between inclusive min and exclusive max.
     * @throws IllegalArgumentException if min >= max.
     */
    public static int range(final int min, final int max) {
        if (min >= max)
            throw new IllegalArgumentException("min cannot be greater than or equal to max");
        return RANDOM.nextInt(min, max);
    }

    /**
     *
     * @param min The minimum inclusive value this method can return
     * @param max The maximum inclusive value this method can return
     * @return int between inclusive min and inclusive max.
     * @throws IllegalArgumentException if min > max.
     */
    public static int rangeInclusive(final int min, final int max) {
        if (min > max)
            throw new IllegalArgumentException("min cannot be greater than max");
        return RANDOM.nextInt(min, max + 1);
    }
}
