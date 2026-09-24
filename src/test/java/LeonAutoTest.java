import com.academy.LeonAuto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LeonAutoTest {
    private final LeonAuto leonAuto = new LeonAuto();

    @Test
    void notNegative() {
        for(int i = 0; i <= 10000; i++){
            assertTrue(leonAuto.fahreRunde() >= 0);
        }
    }
}
