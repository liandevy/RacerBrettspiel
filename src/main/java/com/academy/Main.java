package com.academy;


import com.academy.autos.*;

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
                new YassirAuto()
        };
        final var rennen = new Rennen(100, autos);
        final var sieger = rennen.start(1000);
        System.out.println(GlueckwunschNachricht.erstellen(sieger));
    }
}