import com.academy.YassirAuto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class YasirAutoTest {

    @Test
    void resultsCannotBeNegative() {

        YassirAuto auto = new YassirAuto();

        for (int i = 0; i < 10000; i++) {
            int ergebnis = auto.fahreRunde();

            assertTrue(ergebnis >= 2 && ergebnis <= 8);
        }
    }
}