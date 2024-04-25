package entites;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

public class Moedas {
	@SerializedName("USD")
	private double dolar;
	@SerializedName("ARS")
	private double pesoArgentino;
	@SerializedName("BRL")
	private double real;
	@SerializedName("COP")
	private double pesoColombiano;
	
	public double getDolar() {
		return dolar;
	}

	public double getPesoArgentino() {
		return pesoArgentino;
	}

	public double getReal() {
		return real;
	}
	public double getPesoColombiano() {
		return pesoColombiano;
	}

	public Moedas(JsonObject conversionRates) {
		if (conversionRates != null) {
			if (conversionRates.has("USD")) {
				this.dolar = conversionRates.get("USD").getAsDouble();
			}
			if (conversionRates.has("ARS")) {
				this.pesoArgentino = conversionRates.get("ARS").getAsDouble();
			}
			if (conversionRates.has("BRL")) {
				this.real = conversionRates.get("BRL").getAsDouble();
			}
			if (conversionRates.has("COP")) {
				this.real = conversionRates.get("COP").getAsDouble();
			}

		}
	}

}
