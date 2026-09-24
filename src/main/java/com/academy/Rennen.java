package com.academy;


public class Rennen {
    private final int laenge;
    private final int[] positionen;
    private final Auto[] autos;

    /**
     * Creates a Race with laenge and autos, laenge cannot be below 1.
     * @param laenge number of fields the race has.
     * @param autos cars participating in race.
     */
    public Rennen(final int laenge, final Auto[] autos) {
        if (laenge < 1)
            throw new IllegalArgumentException("laenge cannot be below 1");

        this.laenge = laenge;
        this.positionen = new int[autos.length];
        this.autos = autos;
    }

    /**
     * Runs the race and prints the winner by their class name
     * after finishing.
     * Cars declared earlier in the array will have an advantage over
     */
    public void start() {
        while (true) {
            for (int i = 0; i < autos.length; i++) {
                if (autos[i] == null)
                    continue;

                final var gefahren = autos[i].fahreRunde();
                positionen[i] = Math.min(positionen[i] + gefahren, laenge);

                if (positionen[i] >= laenge) {
                    System.out.println("Gewonnen hat: " + autos[i].getClass().getSimpleName());
                    return;
                }
            }
        }
    }
}
