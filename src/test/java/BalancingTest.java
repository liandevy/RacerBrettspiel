import com.academy.Rennen;
import com.academy.autos.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;

public class BalancingTest {

    @Test
    void alleGewinnenEinmalIn10000Runden() {
        final var autos = new Auto[]{
                new DocHudson(),
                new ElisaAuto(),
                new GianisAuto(),
                new LeonAuto(),
                new LianAuto(),
                new NickAuto(),
                new SteventAuto(),
                new YassirAuto(),
        };
        final var winners = new HashSet<Auto>();

        for (int i = 0; i < 10_000; i++) {
            final var rennen = new Rennen(100, autos);
            final var winner = rennen.start();
            winners.add(winner);
        }

        for (final var auto : autos) {
            assertTrue(winners.contains(auto), "Car: " + auto.getClass().getSimpleName() + " never won");
        }
    }

    // Dieser Test dauert sehr lange (Messbar sekunden)
    @Test
    void alleGewinnenKonsistent() {
        for (int i = 0; i < 5; i++) {
            alleGewinnenEinmalIn10000Runden();
        }
    }

}
