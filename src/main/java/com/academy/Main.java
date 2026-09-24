package com.academy;


import com.academy.autos.Auto;
import com.academy.autos.*;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        final var autos = new Auto[]{
                new DocHudson(),
                new ElisaAuto(),
                new GianisAuto(),
                new LeonAuto(),
                new LianAuto(),
                new NickAuto(),
                new SteventAuto(),
                new YassirAuto(),
        };
        final var winners = new HashSet<Auto>();

        for (int i = 0; i < 10_000; i++) {
            final var rennen = new Rennen(100, autos);
            final var winner = rennen.start();
            winners.add(winner);
        }

        for (final var auto : autos) {
            if (!winners.contains(auto))
                System.out.println(auto.getClass().getSimpleName() + " hat nie gewonnen");
        }
    }
}