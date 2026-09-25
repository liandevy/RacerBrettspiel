package com.academy;

public class GianisAuto implements Auto{

    @Override
    public int fahreRunde() {

        int wuerfel1 = RandomService.rangeInclusive(1, 16);

        return wuerfel1;
    }
}
