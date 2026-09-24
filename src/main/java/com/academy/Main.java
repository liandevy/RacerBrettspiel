package com.academy;


public class Main {
    public static void main(String[] args) {
        final var autos = new Auto[]{
                new DummesRacerAuto()
        };

        final var rennen = new Rennen(20, autos);

        rennen.start();
    }
}