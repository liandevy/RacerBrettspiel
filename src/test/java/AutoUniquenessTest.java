import com.academy.autos.Auto;
import com.academy.autos.DocHudson;
import com.academy.autos.ElisaAuto;
import com.academy.autos.GianisAuto;
import com.academy.autos.LeonAuto;
import com.academy.autos.LianAuto;
import com.academy.autos.NickAuto;
import com.academy.autos.SteventAuto;
import com.academy.autos.YassirAuto;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AutoUniquenessTest {
    @Test
    void allRaceCarsHaveDifferentTypes() {
        Auto[] autos = {
                new DocHudson(),
                new ElisaAuto(),
                new GianisAuto(),
                new LeonAuto(),
                new LianAuto(),
                new NickAuto(),
                new SteventAuto(),
                new YassirAuto()
        };

        Set<Class<? extends Auto>> types = new HashSet<>();
        for (Auto auto : autos) {
            types.add(auto.getClass());
        }

        assertEquals(autos.length, types.size(),
                "Every participating car must have a unique type");
    }
}
