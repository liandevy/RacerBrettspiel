import com.academy.ElisaAuto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ElisaAutoTest {
    private ElisaAuto auto = new ElisaAuto();

    @Test
    void resultsCanNotBeNegative() {
        for (int i = 0;i < 10000; i++){
          assertTrue(auto.fahreRunde()>=0);
        }
    }
}
