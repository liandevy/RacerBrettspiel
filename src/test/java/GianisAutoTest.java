import com.academy.autos.GianisAuto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GianisAutoTest {
    private GianisAuto auto = new GianisAuto();

    @Test
    void resultsCanNotBeNegative() {
        for (int i = 0;i < 10000; i++){
            assertTrue(auto.fahreRunde()>=0);
        }
    }
}