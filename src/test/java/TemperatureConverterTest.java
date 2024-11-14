import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    TemperatureConverter temperatureConverter = new TemperatureConverter();

    @Test
    void celsiusAFahrenheitTest() {
        double result1 = temperatureConverter.celsiusAFahrenheit(0);
        double result2 = temperatureConverter.celsiusAFahrenheit(100);
        assertEquals(32,result1 );
        assertEquals(212, result2);
    }

    @Test
    void FahrenheitACelsiusTest() {
        assertEquals(0, temperatureConverter.fahrenheitACelsius(32));
        assertEquals(100, temperatureConverter.fahrenheitACelsius(212));
    }

    @Test
    void testIsAboveBoilingPointWithBoilingTemperature() {
        assertTrue(temperatureConverter.arribaDelPuntoDeEbullicion(101, "C"));
        assertTrue(temperatureConverter.arribaDelPuntoDeEbullicion(213, "F"));
    }


    @Test
    void testIsAboveBoilingPointWithNotBoilingTemperature() {
        assertFalse(temperatureConverter.arribaDelPuntoDeEbullicion(99, "C"));
        assertFalse(temperatureConverter.arribaDelPuntoDeEbullicion(211, "F"));
    }

    @Test
    void testIsAboveBoilingPointInvalidScale() {
        assertThrows(IllegalArgumentException.class, () -> temperatureConverter.arribaDelPuntoDeEbullicion(100, "K"));
    }
}

