package ru.neoflex.model.cost;

public class RequestSaveCost{
	private Price price;

	public void setPrice(Price price){
		this.price = price;
	}

	public Price getPrice(){
		return price;
	}

	@Override
 	public String toString(){
		return 
			"RequestSaveCost{" + 
			"price = '" + price + '\'' + 
			"}";
		}
}
