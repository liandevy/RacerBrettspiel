package com.academy;


import com.academy.autos.Auto;

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
     * @return winner
     */
    public Auto start(int wartezeit) {
        int runde = 1;
        Kommentator kommentator = new Kommentator(autos);

        while (true) {
            System.out.println("Runde: " + runde);

            for (int i = 0; i < autos.length; i++) {
                if (autos[i] == null)
                    continue;

                final var gefahren = autos[i].fahreRunde();
                positionen[i] = Math.min(positionen[i] + gefahren, laenge);

                if (positionen[i] >= laenge) {
                    return autos[i];
                }
            }

            System.out.println(kommentator.kommentiereErster(positionen));
            System.out.println(kommentator.kommentiereLetzter(positionen));

            try {
                Thread.sleep(wartezeit);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            runde++;
        }
    }
}
