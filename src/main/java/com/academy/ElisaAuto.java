package com.academy;

public class ElisaAuto implements Auto {
    @Override
    public int fahreRunde(){
        int zufall4 = RandomService.range(1,10);
        return zufall4;
    }
}
