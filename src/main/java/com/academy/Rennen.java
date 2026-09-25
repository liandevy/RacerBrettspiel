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
    public Auto start() {
        int runde = 1;
        int letzter = -1;
        int erster = -1;

        while (true) {
            System.out.println("Runde: " + runde);

            int neuerLetzter = 0;

            for (int x = 1; x < positionen.length; x++) {
                if (positionen[x] < positionen[neuerLetzter]) {
                    neuerLetzter = x;
                }
            }

            if (neuerLetzter != letzter) {
                System.out.println(
                        autos[neuerLetzter].getClass().getSimpleName() + " faellt zurueck!");
                letzter = neuerLetzter;
            }
            else {
                System.out.println("Hinten keine Veraenderung!");
            }

            int neuerErster = 0;

            for (int x = 1; x < positionen.length; x++) {
                if (positionen[x] > positionen[neuerErster]) {
                    neuerErster = x;
                }
            }

            if (neuerErster != erster) {
                System.out.println(
                        autos[neuerErster].getClass().getSimpleName() + " hat die Fuehrung uebernommen!");
                erster = neuerErster;
            }
            else {
                System.out.println("An der Spitze bleibt es spannend!");
            }

            for (int i = 0; i < autos.length; i++) {
                if (autos[i] == null)
                    continue;

                final var gefahren = autos[i].fahreRunde();
                positionen[i] = Math.min(positionen[i] + gefahren, laenge);

                if (positionen[i] >= laenge) {
                    return autos[i];
                }
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            runde++;
        }
    }
}
