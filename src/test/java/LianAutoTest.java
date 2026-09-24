import com.academy.LianAuto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class LianAutoTest {
    private final LianAuto auto = new LianAuto();

    @Test
    void resultNeverNegative() {
        for (int i = 0; i < 10_000; i++) {
            final var result = auto.fahreRunde();
            assertTrue(result >= 0);
        }
    }

    @Test
    void resultHitsEveryNumberBetween1And10() {
        final var hit = new boolean[10];

        for (int i = 0; i < 10_000; i++) {
            final var result = auto.fahreRunde();
            hit[result - 1] = true;
        }

        for (final var b : hit) {
            assertTrue(b);
        }
    }
}
