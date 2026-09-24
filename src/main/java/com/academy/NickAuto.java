package com.academy;

/**
 * 1 zu 20 mit einem würfel mit d20 ansonsten mit d6 zu würfeln
 */
public class NickAuto implements Auto {
    @Override
    public int fahreRunde() {
        int zufall1 = RandomService.range(1,20);
        if (zufall1 == 20) {
            return RandomService.rangeInclusive(1,20);
        } else  {
            return RandomService.rangeInclusive(1,6);
        }

    }
}
