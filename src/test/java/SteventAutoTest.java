import com.academy.autos.SteventAuto;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SteventAutoTest {

    @Test
    void carMustMoveBetweenThreeAndEightFields() {
        SteventAuto auto = new SteventAuto();

        for (int i = 0; i < 1000; i++) {
            int movement = auto.fahreRunde();

            assertTrue(movement >= 3 && movement <= 8,
                    "SteventAuto must move between 3 and 8 fields");
        }
    }
}