import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiClient {

    private static final String API_URL = "https://v6.exchangerate-api.com/v6/76eb832232f432a6959c1238/latest/USD";

    public CurrencyConversionRates getConversionRates(String baseCurrency) {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(API_URL.replace("USD", baseCurrency)))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            Gson gson = new Gson();
            return gson.fromJson(response.body(), CurrencyConversionRates.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
