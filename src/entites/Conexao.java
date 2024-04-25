package entites;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class Conexao {
	public Moedas conn() {
			JsonObject convertor = null;
			Moedas moeda= null;
		 try {
			 HttpClient client = HttpClient.newHttpClient();
		        HttpRequest request = HttpRequest.newBuilder()
		                .uri(URI.create("https://v6.exchangerate-api.com/v6/bc1ee5a1f05595c2fb5951e5/latest/USD"))
		                .build();
		        HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());
		        
		        String json = response.body();
		        Gson gson = new Gson();
		        JsonObject responseData = gson.fromJson(json, JsonObject.class);
				convertor = responseData.getAsJsonObject("conversion_rates");
				moeda = new Moedas(convertor);
				
		 }catch(Exception e) {
			 System.out.println("Error: " + e.getMessage());
		 }
		 return moeda;
	    }
	}

