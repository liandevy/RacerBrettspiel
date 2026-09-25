import com.academy.Rennen;
import com.academy.autos.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class RennenKommentatorTest {
    final Auto[] autos = new Auto[]{
            new DocHudson(),
            new ElisaAuto(),
            new GianisAuto(),
            new LeonAuto(),
            new LianAuto(),
            new NickAuto(),
            new SteventAuto(),
            new YassirAuto(),
    };
    final Rennen rennen = new Rennen(200, autos);

    /**
     * Tests the output of the Kommentator class on every possible outcome at least once in a race.
     * The race needs to be long enough so each outcome can be in the output. (min. 100)
     */
    @Test
    void ausgabeRunde(){
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;

        System.setOut(new PrintStream(output));

        try {
            rennen.start(1000);

            String ausgabe = output.toString();

            assertTrue(ausgabe.contains("Hinten keine Veraenderung!"));
            assertTrue(ausgabe.contains("faellt zurueck!"));
            assertTrue(ausgabe.contains("An der Spitze bleibt es spannend!"));
            assertTrue(ausgabe.contains("hat die Fuehrung uebernommen!"));

        } finally {
            System.setOut(originalOut);
        }
    }
}