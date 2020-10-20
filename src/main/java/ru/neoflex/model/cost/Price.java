package ru.neoflex.model.cost;

public class Price{
	private int priceHotWater;
	private int priceGas;
	private int priceColdWater;
	private int priceElectricity;

	public void setPriceHotWater(int priceHotWater){
		this.priceHotWater = priceHotWater;
	}

	public int getPriceHotWater(){
		return priceHotWater;
	}

	public void setPriceGas(int priceGas){
		this.priceGas = priceGas;
	}

	public int getPriceGas(){
		return priceGas;
	}

	public void setPriceColdWater(int priceColdWater){
		this.priceColdWater = priceColdWater;
	}

	public int getPriceColdWater(){
		return priceColdWater;
	}

	public void setPriceElectricity(int priceElectricity){
		this.priceElectricity = priceElectricity;
	}

	public int getPriceElectricity(){
		return priceElectricity;
	}

	@Override
 	public String toString(){
		return 
			"Price{" + 
			"priceHotWater = '" + priceHotWater + '\'' + 
			",priceGas = '" + priceGas + '\'' + 
			",priceColdWater = '" + priceColdWater + '\'' + 
			",priceElectricity = '" + priceElectricity + '\'' + 
			"}";
		}
}
