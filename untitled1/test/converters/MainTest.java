package converters;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {


    @Test
    void isaBoolean() {
        assertEquals(true, Main.isaBoolean("нн"));
    }

    @Test
    public void getCm() {
        assertEquals(BigDecimal.valueOf(8.0 * 1000000), Main.getMultiply(BigDecimal.valueOf(8.0)));
    }
}