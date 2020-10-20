package ru.neoflex.model.testimony;

import com.google.gson.annotations.SerializedName;

public class ResponseSaveTestimony {

	@SerializedName("date")
	private String date;

	@SerializedName("previousDate")
	private String previousDate;

	@SerializedName("currentTestimony")
	private Testimony currentTestimony;

	@SerializedName("previousTestimony")
	private Testimony previousTestimony;

	@SerializedName("consumed")
	private Consumed consumed;

	@SerializedName("cost")
	private Cost cost;

	@SerializedName("totalCost")
	private double totalCost;

	public String getDate(){
		return date;
	}

	public Consumed getConsumed(){
		return consumed;
	}

	public Testimony getPreviousTestimony(){
		return previousTestimony;
	}

	public Cost getCost(){
		return cost;
	}

	public String getPreviousDate(){
		return previousDate;
	}

	public double getTotalCost(){
		return totalCost;
	}

	public Testimony getCurrentTestimony(){
		return currentTestimony;
	}
}