package ru.neoflex.model.cost;

import ru.neoflex.model.IRequest;

public class RequestSaveCost implements IRequest {
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
