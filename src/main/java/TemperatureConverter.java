public class TemperatureConverter {

    public double celsiusAFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public boolean arribaDelPuntoDeEbullicion(double temperature, String scale) {
        if ("C".equals(scale)) {
            return temperature > 100;
        } else if ("F".equals(scale)) {
            return temperature > 212;
        } else {
            throw new IllegalArgumentException("Invalid scale: must be 'C' or 'F'");
        }
    }
}
