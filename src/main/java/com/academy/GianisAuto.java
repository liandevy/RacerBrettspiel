package com.academy;

public class GianisAuto {

        @Override
        public int fahreRunde() {

            int wuerfel1 = RandomService.rangeInclusive(1, 6);

            return wuerfel1;
        }
    }

