import java.util.Map;

public class CurrencyConversionRates {

    private String result;
    private Map<String, Double> conversion_rates;

    public String getResult() {
        return result;
    }

    public double getRate(String currency) {
        return conversion_rates.get(currency);
    }

}
