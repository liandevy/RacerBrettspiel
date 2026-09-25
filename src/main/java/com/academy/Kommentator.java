package com.academy;

import com.academy.autos.Auto;

public class Kommentator {
    private final Auto[] autos;
    int erster = -1;
    int letzter = -1;

    /**
     * Creates a commenter with an array of cars.
     * @param autos cars participating in a race.
     */
    public Kommentator(final Auto[] autos) {
        this.autos = autos;
    }

    /**
     * Determines the new first place of the race.
     * @param positionen current positions of cars in the race.
     * @return String with the status of the car in first place.
     */
    public String kommentiereErster(final int[] positionen) {
        int neuerErster = 0;

        for (int x = 1; x < positionen.length; x++) {
            if (positionen[x] > positionen[neuerErster]) {
                neuerErster = x;
            }
        }

        if (neuerErster != erster) {
            erster = neuerErster;
            return autos[neuerErster].getClass().getSimpleName() + " hat die Fuehrung uebernommen!";
        }
        else {
            return "An der Spitze bleibt es spannend!";
        }
    }

    /**
     * Determines the new last place of the race.
     * @param positionen current positions of cars within the race
     * @return String with the status of the car in last place.
     */
    public String kommentiereLetzter(final int[] positionen) {
        int neuerLetzter = 0;

        for (int x = 1; x < positionen.length; x++) {
            if (positionen[x] < positionen[neuerLetzter]) {
                neuerLetzter = x;
            }
        }

        if (neuerLetzter != letzter) {
            letzter = neuerLetzter;
            return autos[neuerLetzter].getClass().getSimpleName() + " faellt zurueck!";
        }
        else {
            return "Hinten keine Veraenderung!";
        }
    }
}
