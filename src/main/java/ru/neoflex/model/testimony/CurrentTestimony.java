package ru.neoflex.model.testimony;

import com.google.gson.annotations.SerializedName;

public class CurrentTestimony{

	@SerializedName("coldWater")
	private int coldWater;

	@SerializedName("gas")
	private int gas;

	@SerializedName("electricity")
	private int electricity;

	@SerializedName("hotWater")
	private int hotWater;

	public int getColdWater(){
		return coldWater;
	}

	public int getGas(){
		return gas;
	}

	public int getElectricity(){
		return electricity;
	}

	public int getHotWater(){
		return hotWater;
	}
}