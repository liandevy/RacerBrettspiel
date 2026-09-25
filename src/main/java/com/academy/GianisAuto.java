package com.academy;

public class GianisAuto implements Auto{

    @Override
    public int fahreRunde() {

        int wuerfel1 = RandomService.rangeInclusive(1, 15);

        return wuerfel1;
    }
}
