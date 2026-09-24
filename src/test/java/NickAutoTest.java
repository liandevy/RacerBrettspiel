import com.academy.autos.NickAuto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NickAutoTest {
    private NickAuto auto = new NickAuto();

    @Test
    void resultCannotBeNegativ() {
        for (int i = 0; i < 10000; i++) {
            assertTrue(auto.fahreRunde()>=0);
        }
    }
}
