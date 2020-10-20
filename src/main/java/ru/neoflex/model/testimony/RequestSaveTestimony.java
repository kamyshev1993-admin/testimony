package ru.neoflex.model.testimony;

import com.google.gson.annotations.SerializedName;
import ru.neoflex.model.IRequest;

public class RequestSaveTestimony implements IRequest {

	@SerializedName("date")
	private String date;

	@SerializedName("currentTestimony")
	private Testimony currentTestimony;

	public void setDate(String date){
		this.date = date;
	}

	public String getDate(){
		return date;
	}

	public void setCurrentTestimony(Testimony currentTestimony){
		this.currentTestimony = currentTestimony;
	}

	public Testimony getCurrentTestimony(){
		return currentTestimony;
	}

	@Override
 	public String toString(){
		return
			"RequestSaveTestimony{" +
			"date = '" + date + '\'' +
			",currentTestimony = '" + currentTestimony + '\'' +
			"}";
		}
}