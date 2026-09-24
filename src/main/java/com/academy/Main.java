package com.academy;


public class Main {
    public static void main(String[] args) {
        final var autos = new Auto[]{
                new DummesRacerAuto(),
                new SteventAuto()
        };

        final var rennen = new Rennen(20, autos);

        rennen.start();
    }
}