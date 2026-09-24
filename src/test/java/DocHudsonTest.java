import com.academy.DocHudson;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DocHudsonTest {
    private DocHudson auto = new DocHudson();

    @Test
    void resultsCanNotBeNegative() {
        for (int i = 0;i < 10000; i++){
           assertTrue(auto.fahreRunde()>=0);
        }
    }
}