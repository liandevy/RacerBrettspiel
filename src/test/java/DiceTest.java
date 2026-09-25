import com.academy.RandomService;
import com.academy.autos.YassirAuto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class DiceTest {
    @Test
    void diceRollReturnsEveryValueWithinItsInclusiveBounds() {
        for (int i = 0; i < 1000; i++) {
            int roll = RandomService.rangeInclusive(1, 6);

            assertTrue(roll >= 1 && roll <= 6,
                    "A dice roll must be between 1 and 6");
        }
    }

    @Test
    void yassirAutoUsesTwoFourSidedDice() {
        YassirAuto auto = new YassirAuto();

        for (int i = 0; i < 1000; i++) {
            int movement = auto.fahreRunde();

            assertTrue(movement >= 2 && movement <= 8,
                    "Two four-sided dice must produce a movement between 2 and 8");
        }
    }
}
