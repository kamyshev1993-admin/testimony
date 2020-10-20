package ru.neoflex.model.testimony;

import com.google.gson.annotations.SerializedName;
import ru.neoflex.model.testimony.Consumed;
import ru.neoflex.model.testimony.Cost;
import ru.neoflex.model.testimony.PreviousTestimony;
import ru.neoflex.model.testimony.CurrentTestimony;

public class ResponseSaveTestimony{

	@SerializedName("date")
	private String date;

	@SerializedName("consumed")
	private Consumed consumed;

	@SerializedName("previousTestimony")
	private PreviousTestimony previousTestimony;

	@SerializedName("cost")
	private Cost cost;

	@SerializedName("previousDate")
	private String previousDate;

	@SerializedName("totalCost")
	private double totalCost;

	@SerializedName("currentTestimony")
	private CurrentTestimony currentTestimony;

	public String getDate(){
		return date;
	}

	public Consumed getConsumed(){
		return consumed;
	}

	public PreviousTestimony getPreviousTestimony(){
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

	public CurrentTestimony getCurrentTestimony(){
		return currentTestimony;
	}
}